package com.mcwbridges.kikoz.objects;

import javax.annotation.Nullable;

import com.mcwbridges.kikoz.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Bridge_Block_Rope extends Block {

	public static final EnumProperty<ConnectionStatus> CONNECTION = EnumProperty.create("connection",
			ConnectionStatus.class);

	protected static final VoxelShape BASE = Block.box(0, 0, 0, 15.99, 4, 15.99);

	protected static final VoxelShape SIDE_0 = Shapes.or(BASE, Block.box(0, 2, 15, 16, 16, 16));
	protected static final VoxelShape SIDE_90 = Shapes.or(BASE, Block.box(0, 2, 0, 1, 16, 16));
	protected static final VoxelShape SIDE_180 = Shapes.or(BASE, Block.box(0, 2, 0, 16, 16, 1));
	protected static final VoxelShape SIDE_270 = Shapes.or(BASE, Block.box(15, 2, 0, 16, 16, 16));

	protected static final VoxelShape CORNER_0 = Shapes.or(SIDE_180, SIDE_90);
	protected static final VoxelShape CORNER_90 = Shapes.or(SIDE_180, SIDE_270);
	protected static final VoxelShape CORNER_180 = Shapes.or(SIDE_270, SIDE_0);
	protected static final VoxelShape CORNER_270 = Shapes.or(SIDE_0, SIDE_90);

	protected static final VoxelShape MIDDLE_90 = Shapes.or(SIDE_0, SIDE_180);
	protected static final VoxelShape MIDDLE_0 = Shapes.or(SIDE_90, SIDE_270);

	protected static final VoxelShape BASE_COLLISION = Block.box(0, 0, 0, 15.99, 3, 15.99);

	protected static final VoxelShape COLLISION_SIDE_0 = Shapes.or(BASE, Block.box(0, 2, 15, 16, 25, 16));
	protected static final VoxelShape COLLISION_SIDE_90 = Shapes.or(BASE, Block.box(0, 2, 0, 1, 25, 16));
	protected static final VoxelShape COLLISION_SIDE_180 = Shapes.or(BASE, Block.box(0, 2, 0, 16, 25, 1));
	protected static final VoxelShape COLLISION_SIDE_270 = Shapes.or(BASE, Block.box(15, 2, 0, 16, 25, 16));

	protected static final VoxelShape COLLISION_CORNER_0 = Shapes.or(COLLISION_SIDE_180, COLLISION_SIDE_90);
	protected static final VoxelShape COLLISION_CORNER_90 = Shapes.or(COLLISION_SIDE_180, COLLISION_SIDE_270);
	protected static final VoxelShape COLLISION_CORNER_180 = Shapes.or(COLLISION_SIDE_270, COLLISION_SIDE_0);
	protected static final VoxelShape COLLISION_CORNER_270 = Shapes.or(COLLISION_SIDE_0, COLLISION_SIDE_90);

	protected static final VoxelShape COLLISION_MIDDLE_90 = Shapes.or(COLLISION_SIDE_0, COLLISION_SIDE_180);
	protected static final VoxelShape COLLISION_MIDDLE_0 = Shapes.or(COLLISION_SIDE_90, COLLISION_SIDE_270);

	public Bridge_Block_Rope(Properties prop) {
		super(prop);
		this.registerDefaultState(this.stateDefinition.any().setValue(CONNECTION, ConnectionStatus.BASE)
				.setValue(FACING_TD, Direction.NORTH));
	}

	public static final DirectionProperty FACING_TD = DirectionProperty.create("facing", Direction.NORTH,
			Direction.EAST);

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
	public BlockState rotate(BlockState state, Rotation rot) {
		Direction originalDirection = state.getValue(FACING_TD);
		Direction rotatedDirection = rot.rotate(originalDirection);

		// If the original direction was north or south, keep the result as north
		if (originalDirection == Direction.NORTH || originalDirection == Direction.SOUTH) {
			rotatedDirection = Direction.NORTH;
		} else {
			// Otherwise, keep the result as east
			rotatedDirection = Direction.EAST;
		}

		return state.setValue(FACING_TD, rotatedDirection);
	}

	@Override
	public BlockState mirror(BlockState state, Mirror mir) {
		Direction originalDirection = state.getValue(FACING_TD);
		Direction rotatedDirection = mir == Mirror.FRONT_BACK ? originalDirection : originalDirection.getOpposite();

		// If the original direction was north or south, keep the result as north
		if (originalDirection == Direction.NORTH || originalDirection == Direction.SOUTH) {
			rotatedDirection = Direction.NORTH;
		} else {
			// Otherwise, keep the result as east
			rotatedDirection = Direction.EAST;
		}

		return state.setValue(FACING_TD, rotatedDirection);
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext contx) {

		switch (state.getValue(CONNECTION)) {
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

	private BlockState StairState(BlockState state, LevelAccessor access, BlockPos pos) {
		boolean north = access.getBlockState(pos.north()).getBlock() == this;
		boolean east = access.getBlockState(pos.east()).getBlock() == this;
		boolean south = access.getBlockState(pos.south()).getBlock() == this;
		boolean west = access.getBlockState(pos.west()).getBlock() == this;

		ConnectionStatus connection = getConnectionStatus(north, east, south, west);

		Direction facingDirection = state.getValue(FACING_TD);

		// Create the new block state with both the connection status and facing
		return state.setValue(CONNECTION, connection).setValue(FACING_TD, facingDirection);
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

	public enum ConnectionStatus implements StringRepresentable {
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
		public String getSerializedName() {
			return name;
		}
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn,
			BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		Item item = itemstack.getItem();
		ConnectionStatus connection = state.getValue(CONNECTION);

		if (item == ItemInit.PLIERS.get() || item == Items.SHEARS) {
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

			level.setBlockAndUpdate(pos, state.setValue(CONNECTION, newConnection));
			return InteractionResult.SUCCESS;
		} else if (itemstack.getItem() instanceof BlockItem) {
			BlockItem blockItem = (BlockItem) itemstack.getItem();
			if (blockItem.getBlock() == this) {
				Direction facing = player.getDirection();
				Direction blockFacingDirection = (facing == Direction.NORTH || facing == Direction.SOUTH)
						? Direction.NORTH
						: Direction.EAST;

				BlockPos placePos = pos.relative(facing);

				if (level.getBlockState(placePos).isAir()) {
					level.setBlock(placePos, this.defaultBlockState().setValue(FACING_TD, blockFacingDirection), 3);
					if (!player.getAbilities().instabuild) {
						itemstack.shrink(1);
					}
					return InteractionResult.SUCCESS;
				}
			}
		}
		return InteractionResult.PASS;
	}

	@Override
	public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
		if (state.hasProperty(FACING_TD) && statetwo.hasProperty(FACING_TD)) { // Check if both blocks have the
																				// FACING_TD property
			BlockState newState = state.setValue(FACING_TD, statetwo.getValue(FACING_TD));
			if (!statetwo.is(newState.getBlock())) {
				level.setBlock(pos, this.StairState(newState, level, pos), 2);
			}
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(CONNECTION, FACING_TD);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction dir, BlockState statetwo, LevelAccessor access,
			BlockPos pos, BlockPos postwo) {
		ConnectionStatus connection = state.getValue(CONNECTION);
		if (connection == ConnectionStatus.BASE_TOGGLED || connection == ConnectionStatus.END_N_LEFT
				|| connection == ConnectionStatus.END_N_RIGHT || connection == ConnectionStatus.END_E_LEFT
				|| connection == ConnectionStatus.END_E_RIGHT || connection == ConnectionStatus.END_S_LEFT
				|| connection == ConnectionStatus.END_S_RIGHT || connection == ConnectionStatus.END_W_LEFT
				|| connection == ConnectionStatus.END_W_RIGHT) {
			return state;
		}
		return this.StairState(state, access, pos).setValue(FACING_TD, state.getValue(FACING_TD));
	}

	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext contx) {
		Direction facingDirection = contx.getHorizontalDirection();

		if (facingDirection == Direction.WEST) {
			facingDirection = Direction.EAST;
		} else if (facingDirection == Direction.SOUTH) {
			facingDirection = Direction.NORTH;
		}

		BlockPos pos = contx.getClickedPos().below();
		LevelAccessor world = contx.getLevel();
		BlockState stateBelow = world.getBlockState(pos);

		if (stateBelow.getBlock() instanceof Bridge_Block_Rope) {
			return null;
		}

		return this.StairState(super.getStateForPlacement(contx), contx.getLevel(), contx.getClickedPos())
				.setValue(FACING_TD, facingDirection);
	}

}
