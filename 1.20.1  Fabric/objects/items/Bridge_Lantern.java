package net.kikoz.mcwbridges.objects.items;

import net.kikoz.mcwbridges.objects.Bridge_Block;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class Bridge_Lantern extends Bridge_Torch
{
    protected static final VoxelShape EAST = Block.createCuboidShape(5.5, 0, 0, 10.5, 7, 4);
    protected static final VoxelShape SOUTH = Block.createCuboidShape(12, 0, 5.5, 16, 7, 10.5);
    protected static final VoxelShape WEST = Block.createCuboidShape(5.5, 0, 12, 10.5, 7, 16);
    protected static final VoxelShape NORTH = Block.createCuboidShape(0, 0, 5.5, 4, 7, 10.5);

    protected static final VoxelShape EAST_STAIR = Block.createCuboidShape(5.5, 7, 0, 10.5, 16, 4);
    protected static final VoxelShape SOUTH_STAIR = Block.createCuboidShape(12, 7, 5.5, 16, 16, 10.5);
    protected static final VoxelShape WEST_STAIR = Block.createCuboidShape(5.5, 7, 12, 10.5, 16, 16);
    protected static final VoxelShape NORTH_STAIR = Block.createCuboidShape(0, 7, 5.5, 4, 16, 10.5);

    public Bridge_Lantern(AbstractBlock.Settings prop) {
        super(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).sounds(BlockSoundGroup.METAL).strength(0.1F, 0.1F).luminance(BlockState -> 15));
        this.setDefaultState((BlockState)this.getDefaultState().with(FACING, Direction.NORTH).with(LIGHTSTATE, LightState.BRIDGE)
        );
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        Direction facing = state.get(FACING);
        LightState lightState = state.get(LIGHTSTATE);

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
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIGHTSTATE);
    }

}