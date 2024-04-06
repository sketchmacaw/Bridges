package com.mcwbridges.kikoz.objects.items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Bridge_Lantern extends Bridge_Torch {

	protected static final VoxelShape EAST = Block.box(5.5, 0, 0, 10.5, 7, 4);
	protected static final VoxelShape SOUTH = Block.box(12, 0, 5.5, 16, 7, 10.5);
	protected static final VoxelShape WEST = Block.box(5.5, 0, 12, 10.5, 7, 16);
	protected static final VoxelShape NORTH = Block.box(0, 0, 5.5, 4, 7, 10.5);

	protected static final VoxelShape EAST_STAIR = Block.box(5.5, 7, 0, 10.5, 16, 4);
	protected static final VoxelShape SOUTH_STAIR = Block.box(12, 7, 5.5, 16, 16, 10.5);
	protected static final VoxelShape WEST_STAIR = Block.box(5.5, 7, 12, 10.5, 16, 16);
	protected static final VoxelShape NORTH_STAIR = Block.box(0, 7, 5.5, 4, 16, 10.5);

	protected int lightValue;

	public Bridge_Lantern(Properties prop, int lightValue) {
		super(prop, 15);
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
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, LIGHTSTATE);
	}
}