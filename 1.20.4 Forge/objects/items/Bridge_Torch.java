package com.mcwbridges.kikoz.objects.items;

import com.mcwbridges.kikoz.objects.Bridge_Block;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Bridge_Torch extends HorizontalDirectionalBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<LightState> LIGHTSTATE = EnumProperty.create("lightstate", LightState.class);

	protected static final VoxelShape EAST = Block.box(6.2, 0, 0, 9.8, 8, 2.8);
	protected static final VoxelShape SOUTH = Block.box(13.2, 0, 6.2, 16, 8, 9.8);
	protected static final VoxelShape WEST = Block.box(6.2, 0, 13.2, 9.8, 8, 16);
	protected static final VoxelShape NORTH = Block.box(0, 0, 6.2, 2.8, 8, 9.8);

	protected static final VoxelShape EAST_STAIR = Block.box(6.2, 6, 0, 9.8, 16, 2.8);
	protected static final VoxelShape SOUTH_STAIR = Block.box(13.2, 6, 6.2, 16, 16, 9.8);
	protected static final VoxelShape WEST_STAIR = Block.box(6.2, 6, 13.2, 9.8, 16, 16);
	protected static final VoxelShape NORTH_STAIR = Block.box(0, 6, 6.2, 2.8, 16, 9.8);

	protected int lightValue;

	public Bridge_Torch(Properties prop, int lightValue) {
		super(prop);
		this.lightValue = lightValue;
		this.registerDefaultState(
				this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(LIGHTSTATE, LightState.BRIDGE));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos,
			CollisionContext contx) {
		Direction facing = state.getValue(FACING);
		LightState lightState = state.getValue(LIGHTSTATE);

		if (lightState == LightState.BRIDGE) {
			switch (facing) {
			case NORTH:
				return NORTH;
			case SOUTH:
				return SOUTH;
			case WEST:
				return WEST;
			default:
			case EAST:
				return EAST;
			}
		} else {
			switch (facing) {
			case NORTH:
				return NORTH_STAIR;
			case SOUTH:
				return SOUTH_STAIR;
			case WEST:
				return WEST_STAIR;
			default:
			case EAST:
				return EAST_STAIR;
			}
		}
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext contx) {
		return Shapes.empty();
	}

	@Override
	public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean bool) {
	    if (fromPos.above().equals(pos) && !level.getBlockState(pos.below()).isCollisionShapeFullBlock(level, pos.below())) {
	        level.destroyBlock(pos, true);
	    }
	}

	@Override
	public int getLightEmission(BlockState state, BlockGetter reader, BlockPos pos) {
		return lightValue;
	}

	public int getLightValue(BlockState state, BlockGetter reader, BlockPos pos) {
		return 15;
	}

	public float getAmbientOcclusionLightValue(BlockState state, BlockGetter reader, BlockPos pos) {
		return 1.0F;
	}

	@Override
	public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos) {
		return Shapes.empty();
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
		builder.add(FACING, LIGHTSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext contx) {
		BlockState state = this.defaultBlockState().setValue(FACING, contx.getHorizontalDirection().getClockWise());
		BlockPos belowPos = contx.getClickedPos().below();
		BlockState belowState = contx.getLevel().getBlockState(belowPos);
		if (belowState.getBlock() instanceof Bridge_Block) {
			// Check ConnectionStatus
			Bridge_Block.ConnectionStatus connectionStatus = belowState.getValue(Bridge_Block.CONNECTION);
			if (connectionStatus == Bridge_Block.ConnectionStatus.BASE
					|| connectionStatus == Bridge_Block.ConnectionStatus.BASE_TOGGLED) {
				return null; // Prevent placement if ConnectionStatus is BASE
			}
		} else if (belowState.getBlock() instanceof Bridge_Block_Rope) {
			// Check ConnectionStatus
			Bridge_Block_Rope.ConnectionStatus connectionStatus = belowState.getValue(Bridge_Block_Rope.CONNECTION);
			if (connectionStatus == Bridge_Block_Rope.ConnectionStatus.BASE
					|| connectionStatus == Bridge_Block_Rope.ConnectionStatus.BASE_TOGGLED) {
				return null; // Prevent placement if ConnectionStatus is BASE
			}
		} else if (belowState.getBlock() instanceof Bridge_Stairs) {
			// Check ConnectionStatus
			Bridge_Stairs.ConnectionStatus connectionStatus = belowState.getValue(Bridge_Stairs.CONNECTION);
			if (connectionStatus == Bridge_Stairs.ConnectionStatus.BASE
					|| connectionStatus == Bridge_Stairs.ConnectionStatus.DOUBLE) {
				return null; // Prevent placement if ConnectionStatus is BASE
			}
		}
		// Use LightState based on the block below
		return state.setValue(LIGHTSTATE, LightState.byState(belowState));
	}

	@SuppressWarnings("deprecation")
	@Override
	public BlockState updateShape(BlockState state, Direction dir, BlockState statetwo, LevelAccessor access,
			BlockPos pos, BlockPos postwo) {
		// If the block below changes, update the light state accordingly
		return dir == Direction.DOWN ? state.setValue(LIGHTSTATE, LightState.byState(statetwo))
				: super.updateShape(state, dir, statetwo, access, pos, postwo);
	}

	public enum LightState implements StringRepresentable {
		BRIDGE("bridge"), STAIR("stair");

		private final String name;

		private LightState(String name) {
			this.name = name;
		}

		public String getSerializedName() {
			return this.name;
		}

		public static LightState byState(BlockState state) {
			if (state.getBlock() instanceof Bridge_Stairs) {
				return STAIR;
			} else {
				return BRIDGE;
			}
		}

	}

	@Override
	protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
		return null;
	}
}
