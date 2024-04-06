package net.kikoz.mcwbridges.objects;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class Bridge_Support extends Block implements Waterloggable
{
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public Bridge_Support(AbstractBlock.Settings properties) {
    	super(properties);
        this.setDefaultState((BlockState)this.getDefaultState()
        .with(WATERLOGGED, false)
        );
    }

    public void onBroken(World worldIn, BlockPos pos) {
        worldIn.syncWorldEvent(1029, pos, 0);
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
                return VoxelShapes.empty();
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext contx)
    {
        FluidState fluidstate = contx.getWorld().getFluidState(contx.getBlockPos());
        boolean flag = fluidstate.getFluid() == Fluids.WATER;
        return super.getPlacementState(contx).with(WATERLOGGED, Boolean.valueOf(flag));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public void placeAt(WorldAccess world, BlockState state, BlockPos pos, int flags) {
        world.setBlockState(pos, this.getDefaultState(), flags);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
    }
}
