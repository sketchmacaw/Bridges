package net.kikoz.mcwbridges.objects.items;

import com.mojang.serialization.MapCodec;
import net.kikoz.mcwbridges.objects.Bridge_Block;
import net.kikoz.mcwbridges.objects.Bridge_Block_Rope;
import net.kikoz.mcwbridges.objects.Bridge_Stairs;
import net.minecraft.block.Block;
import net.kikoz.mcwbridges.init.ItemInit;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class Bridge_Torch extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<LightState> LIGHTSTATE = EnumProperty.of("lightstate", LightState.class);

    protected static final VoxelShape EAST = Block.createCuboidShape(6.2, 0, 0, 9.8, 8, 2.8);
    protected static final VoxelShape SOUTH = Block.createCuboidShape(13.2, 0, 6.2, 16, 8, 9.8);
    protected static final VoxelShape WEST = Block.createCuboidShape(6.2, 0, 13.2, 9.8, 8, 16);
    protected static final VoxelShape NORTH = Block.createCuboidShape(0, 0, 6.2, 2.8, 8, 9.8);

    protected static final VoxelShape EAST_STAIR = Block.createCuboidShape(6.2, 6, 0, 9.8, 16, 2.8);
    protected static final VoxelShape SOUTH_STAIR = Block.createCuboidShape(13.2, 6, 6.2, 16, 16, 9.8);
    protected static final VoxelShape WEST_STAIR = Block.createCuboidShape(6.2, 6, 13.2, 9.8, 16, 16);
    protected static final VoxelShape NORTH_STAIR = Block.createCuboidShape(0, 6, 6.2, 2.8, 16, 9.8);

    public Bridge_Torch(AbstractBlock.Settings prop) {
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
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public void neighborUpdate(BlockState state, World level, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (fromPos.up().equals(pos) && !level.getBlockState(pos.down()).isFullCube(level, pos.down())) {
            level.breakBlock(pos, true);
        }
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }


    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIGHTSTATE);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockState state = this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().rotateYClockwise());
        BlockPos belowPos = context.getBlockPos().down();
        BlockState belowState = context.getWorld().getBlockState(belowPos);
        if (belowState.getBlock() instanceof Bridge_Block) {
            // Check ConnectionStatus
            Bridge_Block.ConnectionStatus connectionStatus = belowState.get(Bridge_Block.CONNECTION);
            if (connectionStatus == Bridge_Block.ConnectionStatus.BASE
                    || connectionStatus == Bridge_Block.ConnectionStatus.BASE_TOGGLED) {
                return null; // Prevent placement if ConnectionStatus is BASE
            }
        } else if (belowState.getBlock() instanceof Bridge_Block_Rope) {
            // Check ConnectionStatus
            Bridge_Block_Rope.ConnectionStatus connectionStatus = belowState.get(Bridge_Block_Rope.CONNECTION);
            if (connectionStatus == Bridge_Block_Rope.ConnectionStatus.BASE
                    || connectionStatus == Bridge_Block_Rope.ConnectionStatus.BASE_TOGGLED) {
                return null; // Prevent placement if ConnectionStatus is BASE
            }
        } else if (belowState.getBlock() instanceof Bridge_Stairs) {
            // Check ConnectionStatus
            Bridge_Stairs.ConnectionStatus connectionStatus = belowState.get(Bridge_Stairs.CONNECTION);
            if (connectionStatus == Bridge_Stairs.ConnectionStatus.BASE
                    || connectionStatus == Bridge_Stairs.ConnectionStatus.DOUBLE) {
                return null; // Prevent placement if ConnectionStatus is BASE
            }
        }
        // This way it is not possible to have a hovering light in the middle of a bridge, only with railings
        return state.with(LIGHTSTATE, LightState.byState(belowState));
    }


    @SuppressWarnings("deprecation")
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction dir, BlockState statetwo, WorldAccess access, BlockPos pos, BlockPos postwo) {
        return dir == Direction.DOWN ? state.with(LIGHTSTATE, LightState.byState(statetwo))
                : super.getStateForNeighborUpdate(state, dir, statetwo, access, pos, postwo);
    }

    public enum LightState implements StringIdentifiable
    {
        BRIDGE("bridge"), STAIR("stair");

        private final String name;

        private LightState(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
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

}
