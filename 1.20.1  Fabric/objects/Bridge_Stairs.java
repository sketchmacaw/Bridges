package net.kikoz.mcwbridges.objects;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class Bridge_Stairs extends Block {
   public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public static final EnumProperty<ConnectionStatus> CONNECTION = EnumProperty.of("connection", ConnectionStatus.class);

    protected static final VoxelShape N = Stream.of(
            Block.createCuboidShape(0, 8, 0, 8, 16, 16), Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape E = Stream.of(
            Block.createCuboidShape(0, 8, 0, 16, 16, 8), Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape S = Stream.of(
            Block.createCuboidShape(8, 8, 0, 16, 16, 16), Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape W = Stream.of(
            Block.createCuboidShape(0, 8, 8, 16, 16, 16), Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();


    public Bridge_Stairs(Settings properties) {
       super(properties);
       this.setDefaultState((BlockState)this.getDefaultState()
       .with(FACING, Direction.NORTH)
       .with(CONNECTION, ConnectionStatus.BASE)
       );
   }

    private BlockState StairState(BlockState state, WorldAccess access, BlockPos pos)
    {
        BlockState northState = access.getBlockState(pos.north());
        BlockState eastState = access.getBlockState(pos.east());
        BlockState southState = access.getBlockState(pos.south());
        BlockState westState = access.getBlockState(pos.west());

        boolean north = northState.getBlock() == this;
        boolean east = eastState.getBlock() == this;
        boolean south = southState.getBlock() == this;
        boolean west = westState.getBlock() == this;

        ConnectionStatus connection = getConnectionStatus(state.get(FACING), north, east, south, west);

        return state.with(CONNECTION, connection);
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

    public enum ConnectionStatus implements StringIdentifiable
    {
        BASE("base"), DOUBLE("double"), LEFT("left"), RIGHT("right");

        private final String name;

        private ConnectionStatus(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
            return this.name;
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        this.StairState(state, world, pos);
    }

    @Override
    @Deprecated
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return this.StairState(state, world, pos);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        switch (state.get(FACING)) {

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
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getStackInHand(hand);
        if (itemstack.getItem() instanceof BlockItem) {
            BlockItem blockItem = (BlockItem) itemstack.getItem();
            if (blockItem.getBlock() == this) {
                Direction blockFacingDirection = state.get(FACING);
                Direction facing = player.getHorizontalFacing();

                BlockPos placePos = pos.offset(facing).up();

                if (level.getBlockState(placePos).isAir()) {
                    level.setBlockState(placePos, this.getDefaultState().with(FACING, blockFacingDirection), 3);
                    if (!player.getAbilities().creativeMode) {
                        itemstack.decrement(1);
                    }
                    return ActionResult.SUCCESS;
                }
            }
        }
        return ActionResult.PASS;
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext contx) {
        BlockPos pos = contx.getBlockPos().down();
        WorldAccess world = contx.getWorld();
        BlockState stateBelow = world.getBlockState(pos);

        if (stateBelow.getBlock() instanceof Bridge_Stairs) {
            return null;
        }

        return this.StairState(super.getPlacementState(contx), contx.getWorld(), contx.getBlockPos())
                .with(FACING, contx.getHorizontalPlayerFacing().rotateYClockwise());
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, CONNECTION);
    }
}