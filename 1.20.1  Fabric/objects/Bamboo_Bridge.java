package net.kikoz.mcwbridges.objects;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class Bamboo_Bridge extends Bridge_Block_Rope
{

    protected static final VoxelShape SIDE_0 = VoxelShapes.union(BASE,Block.createCuboidShape(0, 3, 13, 16, 16, 16));
    protected static final VoxelShape SIDE_90 = VoxelShapes.union(BASE,Block.createCuboidShape(0, 3, 0, 3, 16, 16));
    protected static final VoxelShape SIDE_180 = VoxelShapes.union(BASE,Block.createCuboidShape(0, 3, 0, 16, 16, 3));
    protected static final VoxelShape SIDE_270 = VoxelShapes.union(BASE,Block.createCuboidShape(13, 3, 0, 16, 16, 16));

    protected static final VoxelShape CORNER_0 = VoxelShapes.union(SIDE_180, SIDE_90);
    protected static final VoxelShape CORNER_90 = VoxelShapes.union(SIDE_180, SIDE_270);
    protected static final VoxelShape CORNER_180 = VoxelShapes.union(SIDE_270, SIDE_0);
    protected static final VoxelShape CORNER_270 = VoxelShapes.union(SIDE_0, SIDE_90);

    protected static final VoxelShape MIDDLE_90 = VoxelShapes.union(SIDE_0, SIDE_180);
    protected static final VoxelShape MIDDLE_0 = VoxelShapes.union(SIDE_90, SIDE_270);

    public Bamboo_Bridge(AbstractBlock.Settings properties) {
        super(properties);
        this.setDefaultState((BlockState)this.getDefaultState().with(CONNECTION, Bridge_Block_Rope.ConnectionStatus.BASE)
        );
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        switch (state.get(CONNECTION)) {
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
            case END_E_LEFT:
                return SIDE_90;
            case END_E_RIGHT:
                return SIDE_90;
            case END_N_LEFT:
                return SIDE_270;
            case END_N_RIGHT:
                return SIDE_270;
            case END_S_LEFT:
                return SIDE_0;
            case END_S_RIGHT:
                return SIDE_180;
            case END_W_LEFT:
                return SIDE_180;
            case END_W_RIGHT:
                return SIDE_0;
            case MIDDLE_END_E:
                return MIDDLE_90;
            case MIDDLE_END_N:
                return MIDDLE_0;
            case MIDDLE_END_S:
                return MIDDLE_0;
            case MIDDLE_END_W:
                return MIDDLE_90;
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
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CONNECTION, FACING_TD);
    }
}