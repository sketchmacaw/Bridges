package com.mcwbridges.kikoz.objects;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Bridge_Stairs extends HorizontalDirectionalBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public static final EnumProperty<ConnectionStatus> CONNECTION = EnumProperty.create("connection",
			ConnectionStatus.class);

	public static final VoxelShape N = Shapes.or(Block.box(0, 8, 0, 8, 16, 16), Block.box(0, 0, 0, 16, 8, 16));
	public static final VoxelShape E = Shapes.or(Block.box(0, 8, 0, 16, 16, 8), Block.box(0, 0, 0, 16, 8, 16));
	public static final VoxelShape S = Shapes.or(Block.box(8, 8, 0, 16, 16, 16), Block.box(0, 0, 0, 16, 8, 16));
	public static final VoxelShape W = Shapes.or(Block.box(0, 8, 8, 16, 16, 16), Block.box(0, 0, 0, 16, 8, 16));

	public Bridge_Stairs(Properties prop) {
		super(prop);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(CONNECTION,
				ConnectionStatus.BASE));
	}

	private BlockState StairState(BlockState state, LevelAccessor access, BlockPos pos) {

		BlockState northState = access.getBlockState(pos.north());
		BlockState eastState = access.getBlockState(pos.east());
		BlockState southState = access.getBlockState(pos.south());
		BlockState westState = access.getBlockState(pos.west());

		boolean north = northState.getBlock() == this;
		boolean east = eastState.getBlock() == this;
		boolean south = southState.getBlock() == this;
		boolean west = westState.getBlock() == this;

		ConnectionStatus connection = getConnectionStatus(state.getValue(FACING), north, east, south, west);

		return state.setValue(CONNECTION, connection);
	}

	private ConnectionStatus getConnectionStatus(Direction facing, boolean north, boolean east, boolean south,
			boolean west) {
		boolean isConnectedNorthSouth = north && south;
		boolean isConnectedEastWest = east && west;

		switch (facing) {
		case NORTH:
			if (isConnectedNorthSouth) {
				return ConnectionStatus.DOUBLE;
			} else if (south) {
				return ConnectionStatus.RIGHT;
			} else if (north) {
				return ConnectionStatus.LEFT;
			} else {
				return ConnectionStatus.BASE;
			}

		case SOUTH:
			if (isConnectedNorthSouth) {
				return ConnectionStatus.DOUBLE;
			} else if (north) {
				return ConnectionStatus.RIGHT;
			} else if (south) {
				return ConnectionStatus.LEFT;
			} else {
				return ConnectionStatus.BASE;
			}

		case EAST:
			if (isConnectedEastWest) {
				return ConnectionStatus.DOUBLE;
			} else if (west) {
				return ConnectionStatus.RIGHT;
			} else if (east) {
				return ConnectionStatus.LEFT;
			} else {
				return ConnectionStatus.BASE;
			}

		case WEST:
			if (isConnectedEastWest) {
				return ConnectionStatus.DOUBLE;
			} else if (east) {
				return ConnectionStatus.RIGHT;
			} else if (west) {
				return ConnectionStatus.LEFT;
			} else {
				return ConnectionStatus.BASE;
			}

		default:
			return ConnectionStatus.BASE;
		}
	}

	public enum ConnectionStatus implements StringRepresentable {
		BASE("base"), DOUBLE("double"), LEFT("left"), RIGHT("right");

		private final String name;

		private ConnectionStatus(String name) {
			this.name = name;
		}

		@Override
		public String getSerializedName() {
			return name;
		}
	}

	@Override
	public BlockState updateShape(BlockState state, Direction dir, BlockState statetwo, LevelAccessor access,
			BlockPos pos, BlockPos postwo) {
		return this.StairState(state, access, pos);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos,
			CollisionContext contx) {
		switch (state.getValue(FACING)) {

		case NORTH:
			return N;

		case SOUTH:
			return S;

		case WEST:
			return W;

		default:
		case EAST:
			return E;
		}
	}

	@Override
	public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos) {
		return Shapes.empty();
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn,
			BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);

		if (itemstack.getItem() instanceof BlockItem) {
			BlockItem blockItem = (BlockItem) itemstack.getItem();
			if (blockItem.getBlock() == this) {
				Direction blockFacingDirection = state.getValue(FACING);
				Direction facing = player.getDirection();

				BlockPos placePos = pos.relative(facing).above();

				if (level.getBlockState(placePos).isAir()) {
					level.setBlock(placePos, this.defaultBlockState().setValue(FACING, blockFacingDirection), 3);
					if (!player.getAbilities().instabuild) {
						itemstack.shrink(1);
					}
					return InteractionResult.SUCCESS;
				}
			}
		}
		return InteractionResult.PASS;
	}

	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext contx) {

		BlockPos pos = contx.getClickedPos().below();
		LevelAccessor world = contx.getLevel();
		BlockState stateBelow = world.getBlockState(pos);

		if (stateBelow.getBlock() instanceof Bridge_Stairs) {
			return null;
		}

		return this.StairState(super.getStateForPlacement(contx), contx.getLevel(), contx.getClickedPos())
				.setValue(FACING, contx.getHorizontalDirection().getClockWise());
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, CONNECTION);
	}

	@Override
	protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
		return null;
	}
}