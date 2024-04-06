package net.kikoz.mcwbridges.objects;


import net.kikoz.mcwbridges.init.ItemInit;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;


public class Bridge_Block_Rope extends Block
{
    public static final EnumProperty<Bridge_Block_Rope.ConnectionStatus> CONNECTION = EnumProperty.of("connection", Bridge_Block_Rope.ConnectionStatus.class);

    protected static final VoxelShape BASE = Block.createCuboidShape(0, 0, 0, 15.99, 4, 15.99);

    protected static final VoxelShape SIDE_0 = VoxelShapes.union(BASE,Block.createCuboidShape(0, 2, 15, 16, 16, 16));
    protected static final VoxelShape SIDE_90 = VoxelShapes.union(BASE,Block.createCuboidShape(0, 2, 0, 1, 16, 16));
    protected static final VoxelShape SIDE_180 = VoxelShapes.union(BASE,Block.createCuboidShape(0, 2, 0, 16, 16, 1));
    protected static final VoxelShape SIDE_270 = VoxelShapes.union(BASE,Block.createCuboidShape(15, 2, 0, 16, 16, 16));

    protected static final VoxelShape CORNER_0 = VoxelShapes.union(SIDE_180, SIDE_90);
    protected static final VoxelShape CORNER_90 = VoxelShapes.union(SIDE_180, SIDE_270);
    protected static final VoxelShape CORNER_180 = VoxelShapes.union(SIDE_270, SIDE_0);
    protected static final VoxelShape CORNER_270 = VoxelShapes.union(SIDE_0, SIDE_90);

    protected static final VoxelShape MIDDLE_90 = VoxelShapes.union(SIDE_0, SIDE_180);
    protected static final VoxelShape MIDDLE_0 = VoxelShapes.union(SIDE_90, SIDE_270);

    protected static final VoxelShape BASE_COLLISION = Block.createCuboidShape(0, 0, 0, 15.99, 4, 15.99);

    protected static final VoxelShape COLLISION_SIDE_0 = VoxelShapes.union(BASE_COLLISION,Block.createCuboidShape(0, 2, 15, 16, 26, 16));
    protected static final VoxelShape COLLISION_SIDE_90 = VoxelShapes.union(BASE_COLLISION,Block.createCuboidShape(0, 2, 0, 1, 26, 16));
    protected static final VoxelShape COLLISION_SIDE_180 = VoxelShapes.union(BASE_COLLISION,Block.createCuboidShape(0, 2, 0, 16, 26, 1));
    protected static final VoxelShape COLLISION_SIDE_270 = VoxelShapes.union(BASE_COLLISION,Block.createCuboidShape(15, 2, 0, 16, 26, 16));

    protected static final VoxelShape COLLISION_CORNER_0 = VoxelShapes.union(COLLISION_SIDE_180, COLLISION_SIDE_90);
    protected static final VoxelShape COLLISION_CORNER_90 = VoxelShapes.union(COLLISION_SIDE_180, COLLISION_SIDE_270);
    protected static final VoxelShape COLLISION_CORNER_180 = VoxelShapes.union(COLLISION_SIDE_270, COLLISION_SIDE_0);
    protected static final VoxelShape COLLISION_CORNER_270 = VoxelShapes.union(COLLISION_SIDE_0, COLLISION_SIDE_90);

    protected static final VoxelShape COLLISION_MIDDLE_90 = VoxelShapes.union(COLLISION_SIDE_0, COLLISION_SIDE_180);
    protected static final VoxelShape COLLISION_MIDDLE_0 = VoxelShapes.union(COLLISION_SIDE_90, COLLISION_SIDE_270);

    public Bridge_Block_Rope(AbstractBlock.Settings properties) {
        super(properties);
        this.setDefaultState((BlockState)this.getDefaultState()
                .with(CONNECTION, Bridge_Block_Rope.ConnectionStatus.BASE)
                .with(FACING_TD, Direction.NORTH)
        );
    }

    public static final DirectionProperty FACING_TD = DirectionProperty.of("facing", Direction.NORTH,
            Direction.EAST);

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
    public BlockState rotate(BlockState state, BlockRotation rot) {
        Direction originalDirection = state.get(FACING_TD);
        Direction rotatedDirection = rot.rotate(originalDirection);

        // If the original direction was north or south, keep the result as north
        if (originalDirection == Direction.NORTH || originalDirection == Direction.SOUTH) {
            rotatedDirection = Direction.NORTH;
        } else {
            // Otherwise, keep the result as east, the facings are the same for e,w and n,s so why have 4 extra states if 2 can do the job
            rotatedDirection = Direction.EAST;
        }

        return state.with(FACING_TD, rotatedDirection);
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mir) {
        Direction originalDirection = state.get(FACING_TD);
        Direction rotatedDirection = mir == BlockMirror.FRONT_BACK ? originalDirection : originalDirection.getOpposite();

        if (originalDirection == Direction.NORTH || originalDirection == Direction.SOUTH) {
            rotatedDirection = Direction.NORTH;
        } else {
            rotatedDirection = Direction.EAST;
        }

        return state.with(FACING_TD, rotatedDirection);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(CONNECTION)) {
            case BASE:
                return BASE;
            case CORNER_NE:
                return COLLISION_CORNER_270;
            case CORNER_NW:
                return COLLISION_CORNER_180;
            case CORNER_SE:
                return COLLISION_CORNER_0;
            case CORNER_SW:
                return COLLISION_CORNER_90;
            case END_E_LEFT:
                return COLLISION_SIDE_90;
            case END_E_RIGHT:
                return COLLISION_SIDE_90;
            case END_N_LEFT:
                return COLLISION_SIDE_270;
            case END_N_RIGHT:
                return COLLISION_SIDE_270;
            case END_S_LEFT:
                return COLLISION_SIDE_0;
            case END_S_RIGHT:
                return COLLISION_SIDE_180;
            case END_W_LEFT:
                return COLLISION_SIDE_180;
            case END_W_RIGHT:
                return COLLISION_SIDE_0;
            case MIDDLE_END_E:
                return COLLISION_MIDDLE_90;
            case MIDDLE_END_N:
                return COLLISION_MIDDLE_0;
            case MIDDLE_END_S:
                return COLLISION_MIDDLE_0;
            case MIDDLE_END_W:
                return COLLISION_MIDDLE_90;
            case MIDDLE_EW:
                return COLLISION_MIDDLE_0;
            case MIDDLE_NS:
                return COLLISION_MIDDLE_90;
            case SIDE_E:
                return COLLISION_SIDE_270;
            case SIDE_N:
                return COLLISION_SIDE_180;
            case SIDE_S:
                return COLLISION_SIDE_0;
            case SIDE_W:
                return COLLISION_SIDE_90;
            case BASE_TOGGLED:
                return BASE_COLLISION;
            default:
                return BASE_COLLISION;

        }
    }


    private BlockState BridgeRopeState(BlockState state, WorldAccess access, BlockPos pos)
    {
        boolean north = access.getBlockState(pos.north()).getBlock() == this;
        boolean east = access.getBlockState(pos.east()).getBlock() == this;
        boolean south = access.getBlockState(pos.south()).getBlock() == this;
        boolean west = access.getBlockState(pos.west()).getBlock() == this;

        ConnectionStatus connection = getConnectionStatus(north, east, south, west);

        Direction facingDirection = state.get(FACING_TD);

        return state.with(CONNECTION, connection).with(FACING_TD, facingDirection);
    }

    private ConnectionStatus getConnectionStatus(boolean north, boolean east, boolean south, boolean west) {
        if (!north && !south && !east && !west) {
            return ConnectionStatus.MIDDLE_NS;
        } else if (north && !east && south && !west) {
            return ConnectionStatus.MIDDLE_EW;
        } else if (!north && east && !south && west) {
            return ConnectionStatus.MIDDLE_NS;
        } else if (!north && !east && south && !west) {
            return ConnectionStatus.MIDDLE_END_S;
        } else if (north && !east && !south && !west) {
            return ConnectionStatus.MIDDLE_END_N;
        } else if (!north && !east && !south && west) {
            return ConnectionStatus.MIDDLE_END_W;
        } else if (!north && east && !south && !west) {
            return ConnectionStatus.MIDDLE_END_E;
        } else if (!north && !east && south && west) {
            return ConnectionStatus.CORNER_SW;
        } else if (!north && east && south && !west) {
            return ConnectionStatus.CORNER_SE;
        } else if (north && !east && !south && west) {
            return ConnectionStatus.CORNER_NW;
        } else if (north && east && !south && !west) {
            return ConnectionStatus.CORNER_NE;
        } else if (!north && east && south && west) {
            return ConnectionStatus.SIDE_N;
        } else if (north && !east && south && west) {
            return ConnectionStatus.SIDE_E;
        } else if (north && east && !south && west) {
            return ConnectionStatus.SIDE_S;
        } else if (north && east && south && !west) {
            return ConnectionStatus.SIDE_W;
        } else {
            return ConnectionStatus.BASE;
        }
    }

    public enum ConnectionStatus implements StringIdentifiable
    {
        BASE("base"), MIDDLE_NS("middle_ns"), MIDDLE_EW("middle_ew"), MIDDLE_END_N("middle_end_n"),
        MIDDLE_END_E("middle_end_e"), MIDDLE_END_S("middle_end_s"), MIDDLE_END_W("middle_end_w"),
        CORNER_NE("corner_ne"), CORNER_NW("corner_nw"), CORNER_SE("corner_se"), CORNER_SW("corner_sw"),
        SIDE_N("side_n"), SIDE_E("side_e"), SIDE_S("side_s"), SIDE_W("side_w"), END_N_LEFT("end_n_left"),
        END_N_RIGHT("end_n_right"), END_E_LEFT("end_e_left"), END_E_RIGHT("end_e_right"), END_S_LEFT("end_s_left"),
        END_S_RIGHT("end_s_right"), END_W_LEFT("end_w_left"), END_W_RIGHT("end_w_right"), BASE_TOGGLED("base_toggled");

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
    public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getStackInHand(hand);
        Item item = itemstack.getItem();
        Bridge_Block_Rope.ConnectionStatus connection = state.get(CONNECTION);

        if (item == ItemInit.PLIERS.asItem() || item == Items.SHEARS) {
            ConnectionStatus newConnection = ConnectionStatus.BASE;

            switch (connection) {
                case SIDE_N:
                case SIDE_E:
                case SIDE_S:
                case SIDE_W:
                    newConnection = ConnectionStatus.BASE_TOGGLED;
                    break;
                case CORNER_SW:
                    newConnection = ConnectionStatus.END_N_LEFT;
                    break;
                case END_N_LEFT:
                    newConnection = ConnectionStatus.END_S_RIGHT;
                    break;
                case END_S_RIGHT:
                    newConnection = ConnectionStatus.CORNER_NW;
                    break;
                case CORNER_NW:
                    newConnection = ConnectionStatus.END_S_LEFT;
                    break;
                case END_S_LEFT:
                    newConnection = ConnectionStatus.END_N_RIGHT;
                    break;
                case END_N_RIGHT:
                    newConnection = ConnectionStatus.CORNER_NE;
                    break;
                case CORNER_NE:
                    newConnection = ConnectionStatus.END_E_LEFT;
                    break;
                case END_E_LEFT:
                    newConnection = ConnectionStatus.END_W_RIGHT;
                    break;
                case END_W_RIGHT:
                    newConnection = ConnectionStatus.CORNER_SE;
                    break;
                case CORNER_SE:
                    newConnection = ConnectionStatus.END_W_LEFT;
                    break;
                case END_W_LEFT:
                    newConnection = ConnectionStatus.END_E_RIGHT;
                    break;
                case END_E_RIGHT:
                    newConnection = ConnectionStatus.BASE_TOGGLED;
                    break;
                case BASE_TOGGLED:
                    newConnection = ConnectionStatus.CORNER_SW;
                    break;
                case MIDDLE_EW:
                    newConnection = ConnectionStatus.BASE_TOGGLED;
                    break;
                case MIDDLE_NS:
                    newConnection = ConnectionStatus.BASE_TOGGLED;
                    break;
                case BASE:
                    newConnection = ConnectionStatus.BASE_TOGGLED;
                    break;
                default:
                    break;
            }

            level.setBlockState(pos, state.with(CONNECTION, newConnection));
            return ActionResult.SUCCESS;
        } else if (itemstack.getItem() instanceof BlockItem) {
            BlockItem blockItem = (BlockItem) itemstack.getItem();
            if (blockItem.getBlock() == this) {
                Direction facing = player.getHorizontalFacing();
                Direction blockFacingDirection = (facing == Direction.NORTH || facing == Direction.SOUTH)
                        ? Direction.NORTH
                        : Direction.EAST;

                BlockPos placePos = pos.offset(facing);

                if (level.getBlockState(placePos).isAir()) {
                    level.setBlockState(placePos, this.getDefaultState().with(FACING_TD, blockFacingDirection), 3);
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
    public void onStateReplaced(BlockState state, World level, BlockPos pos, BlockState statetwo, boolean moved) {
        if (state.contains(FACING_TD) && statetwo.contains(FACING_TD)) { // Check if both blocks have the
            // FACING_TD property
            BlockState newState = state.with(FACING_TD, statetwo.get(FACING_TD));
            if (!statetwo.isOf(newState.getBlock())) {
                level.setBlockState(pos, this.BridgeRopeState(newState, level, pos), 2);
            }
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CONNECTION, FACING_TD);
    }

    @Override
    @Deprecated
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess access, BlockPos pos, BlockPos neighborPos) {
        ConnectionStatus connection = state.get(CONNECTION);
        if (connection == ConnectionStatus.BASE_TOGGLED || connection == ConnectionStatus.END_N_LEFT
                || connection == ConnectionStatus.END_N_RIGHT || connection == ConnectionStatus.END_E_LEFT
                || connection == ConnectionStatus.END_E_RIGHT || connection == ConnectionStatus.END_S_LEFT
                || connection == ConnectionStatus.END_S_RIGHT || connection == ConnectionStatus.END_W_LEFT
                || connection == ConnectionStatus.END_W_RIGHT) {
            return state;
        }
        return this.BridgeRopeState(state, access, pos).with(FACING_TD, state.get(FACING_TD));
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext contx) {
        Direction facingDirection = contx.getHorizontalPlayerFacing();

        if (facingDirection == Direction.WEST) {
            facingDirection = Direction.EAST;
        } else if (facingDirection == Direction.SOUTH) {
            facingDirection = Direction.NORTH;
        }

        BlockPos pos = contx.getBlockPos().down();
        WorldAccess world = contx.getWorld();
        BlockState stateBelow = world.getBlockState(pos);

        if (stateBelow.getBlock() instanceof Bridge_Block_Rope) {
            return null;
        }
        return this.BridgeRopeState(super.getPlacementState(contx), contx.getWorld(), contx.getBlockPos())
                .with(FACING_TD, facingDirection);
    }
}