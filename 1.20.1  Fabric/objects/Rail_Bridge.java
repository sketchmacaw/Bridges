package net.kikoz.mcwbridges.objects;


import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class Rail_Bridge extends Block
{

	public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public static final BooleanProperty POWERED = Properties.POWERED;

    protected static final VoxelShape OCCLUSION = Block.createCuboidShape(0.0, 0.1, 0.0, 16.0, 16.0, 16.0);

    public Rail_Bridge(AbstractBlock.Settings properties) {
    	super(properties);
        this.setDefaultState((BlockState)this.getDefaultState()
        .with(FACING, Direction.NORTH)
        .with(POWERED, false)
        );
    }

    @Override
    public VoxelShape getRaycastShape(BlockState state, BlockView world, BlockPos pos) {
        return OCCLUSION;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return OCCLUSION;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        if (state.get(POWERED) == true) {
            return 10;
        } else
            return 0;
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        if (state.get(POWERED) == true) {
            return true;
        } else
            return false;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        Boolean power = state.get(POWERED);

        if (power == true && item == Items.AIR) {
            state = state.cycle(POWERED);
            world.setBlockState(pos, state, 2);
            dropTorch(world, pos);
            return ActionResult.CONSUME;
        }

        if (item == Items.REDSTONE_TORCH && power == false) {
            state = state.cycle(POWERED);
            world.setBlockState(pos, state, 2);

            if (!player.getAbilities().creativeMode) {
                itemStack.decrement(1);
            }
            return ActionResult.CONSUME;
        }

        if (power == false && item != Items.REDSTONE_TORCH) {
            return ActionResult.PASS;
        }
        return ActionResult.PASS;
    }

    public static void dropTorch(World world, BlockPos pos) {
        dropStack(world, pos, new ItemStack(Items.REDSTONE_TORCH, 1));
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity PlayerEntity) {
        Boolean i = state.get(POWERED);

        if (!world.isClient) {

            if (i == true)
            {
                dropTorch(world, pos);
            }
        }

        super.onBreak(world, pos, state, PlayerEntity);
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(POWERED, FACING);
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext context) {
    return this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().rotateYClockwise());
    }

    public void placeAt(WorldAccess world, BlockState state, BlockPos pos, int flags) {
    world.setBlockState(pos, this.getDefaultState(), flags);
 }
}