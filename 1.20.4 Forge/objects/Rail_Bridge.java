package com.mcwbridges.kikoz.objects;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Rail_Bridge extends Block {

	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

	protected static final VoxelShape OCCLUSION = Block.box(0.0D, 0.1D, 0.0D, 16D, 16D, 16D);

	public Rail_Bridge(Block.Properties prop) {
		super(prop);
		this.registerDefaultState(
				this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(POWERED, Boolean.valueOf(false)));
	}

	@Override
	public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext contx) {
		return OCCLUSION;
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.MODEL;
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(POWERED, FACING);
	}

	public int getSignal(BlockState state, BlockGetter reader, BlockPos pos, Direction dir) {
		if (state.getValue(POWERED) == true) {
			return 10;
		} else
			return 0;
	}

	public boolean isSignalSource(BlockState state) {
		if (state.getValue(POWERED) == true) {
			return true;
		} else
			return false;
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn,
			BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		Item item = itemstack.getItem();
		Boolean power = state.getValue(POWERED);

		if (power == true && item == Items.AIR) {
			state = state.cycle(POWERED);
			level.setBlock(pos, state, 2);
			dropTorch(level, pos);
			return InteractionResult.CONSUME;
		}

		if (item == Items.REDSTONE_TORCH && power == false) {
			state = state.cycle(POWERED);
			level.setBlock(pos, state, 2);

			if (!player.getAbilities().instabuild) {
				itemstack.shrink(1);
			}
			return InteractionResult.CONSUME;
		}

		if (power == false && item != Items.REDSTONE_TORCH) {
			return InteractionResult.PASS;
		}
		return InteractionResult.PASS;
	}

	public static void dropTorch(Level level, BlockPos pos) {
		popResource(level, pos, new ItemStack(Items.REDSTONE_TORCH, 1));
	}

	@Override
	public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player user) {
		Boolean i = state.getValue(POWERED);

		if (!level.isClientSide) {

			if (i == true) {
				dropTorch(level, pos);
			}
		}

		return super.playerWillDestroy(level, pos, state, user);
	}

	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext contx) {
		return this.defaultBlockState().setValue(FACING, contx.getHorizontalDirection().getClockWise());
	}

	public void placeAt(Level level, BlockPos pos, int num) {
		level.setBlock(pos, this.defaultBlockState(), num);
	}

}