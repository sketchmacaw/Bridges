package com.mcwbridges.kikoz.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Log_Bridge extends Bridge_Block {

	protected static final VoxelShape SIDE_0 = Shapes.or(BASE, Block.box(0, 2, 14, 16, 15, 16));
	protected static final VoxelShape SIDE_90 = Shapes.or(BASE, Block.box(0, 2, 0, 2, 15, 16));
	protected static final VoxelShape SIDE_180 = Shapes.or(BASE, Block.box(0, 2, 0, 16, 15, 2));
	protected static final VoxelShape SIDE_270 = Shapes.or(BASE, Block.box(14, 2, 0, 16, 15, 16));

	protected static final VoxelShape CORNER_0 = Shapes.or(SIDE_180, SIDE_90);
	protected static final VoxelShape CORNER_90 = Shapes.or(SIDE_180, SIDE_270);
	protected static final VoxelShape CORNER_180 = Shapes.or(SIDE_270, SIDE_0);
	protected static final VoxelShape CORNER_270 = Shapes.or(SIDE_0, SIDE_90);

	protected static final VoxelShape MIDDLE_90 = Shapes.or(SIDE_0, SIDE_180);
	protected static final VoxelShape MIDDLE_0 = Shapes.or(SIDE_90, SIDE_270);

	public Log_Bridge(Block.Properties prop) {
		super(prop);
		this.registerDefaultState(this.stateDefinition.any().setValue(CONNECTION, ConnectionStatus.BASE));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos,
			CollisionContext contx) {

		switch (state.getValue(CONNECTION)) {
		case BASE:
			return BASE;
		case CORNER_NE:
			return CORNER_270;
		case CORNER_NW:
			return CORNER_180;
		case CORNER_SE:
			return CORNER_0;
		case CORNER_SW:
			return CORNER_90;
		case END_N_TOGGLED:
			return SIDE_180;
		case END_E_TOGGLED:
			return SIDE_270;
		case END_S_TOGGLED:
			return SIDE_0;
		case END_W_TOGGLED:
			return SIDE_90;
		case MIDDLE_EW:
			return MIDDLE_0;
		case MIDDLE_NS:
			return MIDDLE_90;
		case SIDE_E:
			return SIDE_270;
		case SIDE_N:
			return SIDE_180;
		case SIDE_S:
			return SIDE_0;
		case SIDE_W:
			return SIDE_90;
		case BASE_TOGGLED:
			return BASE;
		default:
			return BASE;

		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(CONNECTION);
	}

}