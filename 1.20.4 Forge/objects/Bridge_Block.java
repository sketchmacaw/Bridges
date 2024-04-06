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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Bridge_Block extends Block {

	public static final EnumProperty<ConnectionStatus> CONNECTION = EnumProperty.create("connection",
			ConnectionStatus.class);

	protected static final VoxelShape BASE = Block.box(0, 0, 0, 15.99, 4, 15.99);

	protected static final VoxelShape SIDE_0 = Shapes.or(BASE, Block.box(0, 3, 13, 16, 16, 16));
	protected static final VoxelShape SIDE_90 = Shapes.or(BASE, Block.box(0, 3, 0, 3, 16, 16));
	protected static final VoxelShape SIDE_180 = Shapes.or(BASE, Block.box(0, 3, 0, 16, 16, 3));
	protected static final VoxelShape SIDE_270 = Shapes.or(BASE, Block.box(13, 3, 0, 16, 16, 16));

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

	public Bridge_Block(Properties prop) {
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
		case END_N_TOGGLED:
			return COLLISION_SIDE_180;
		case END_E_TOGGLED:
			return COLLISION_SIDE_270;
		case END_S_TOGGLED:
			return COLLISION_SIDE_0;
		case END_W_TOGGLED:
			return COLLISION_SIDE_90;
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
		return state.setValue(CONNECTION, connection);
	}

	private ConnectionStatus getConnectionStatus(boolean north, boolean east, boolean south, boolean west) {
		if (!north && !south && !east && !west) {
			return ConnectionStatus.MIDDLE_NS;
		} else if (north && !east && south && !west) {
			return ConnectionStatus.MIDDLE_EW;
		} else if (!north && east && !south && west) {
			return ConnectionStatus.MIDDLE_NS;
		} else if (!north && !east && south && !west) {
			return ConnectionStatus.MIDDLE_EW;
		} else if (north && !east && !south && !west) {
			return ConnectionStatus.MIDDLE_EW;
		} else if (!north && !east && !south && west) {
			return ConnectionStatus.MIDDLE_NS;
		} else if (!north && east && !south && !west) {
			return ConnectionStatus.MIDDLE_NS;
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
		BASE("base"), MIDDLE_NS("middle_ns"), MIDDLE_EW("middle_ew"), CORNER_NE("corner_ne"), CORNER_NW("corner_nw"),
		CORNER_SE("corner_se"), CORNER_SW("corner_sw"), SIDE_N("side_n"), SIDE_E("side_e"), SIDE_S("side_s"),
		SIDE_W("side_w"), END_N_TOGGLED("end_n_toggled"), END_E_TOGGLED("end_e_toggled"),
		END_S_TOGGLED("end_s_toggled"), END_W_TOGGLED("end_w_toggled"), BASE_TOGGLED("base_toggled"),;

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
				newConnection = ConnectionStatus.CORNER_NW;
				break;
			case CORNER_NW:
				newConnection = ConnectionStatus.CORNER_NE;
				break;
			case CORNER_NE:
				newConnection = ConnectionStatus.CORNER_SE;
				break;
			case CORNER_SE:
				newConnection = ConnectionStatus.END_N_TOGGLED;
				break;
			case END_N_TOGGLED:
				newConnection = ConnectionStatus.END_E_TOGGLED;
				break;
			case END_E_TOGGLED:
				newConnection = ConnectionStatus.END_S_TOGGLED;
				break;
			case END_S_TOGGLED:
				newConnection = ConnectionStatus.END_W_TOGGLED;
				break;
			case END_W_TOGGLED:
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
				BlockPos placePos = pos.relative(facing);

				if (level.getBlockState(placePos).isAir()) {
					level.setBlock(placePos, this.defaultBlockState(), 3);
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
		if (!statetwo.is(state.getBlock())) {
			level.setBlock(pos, this.StairState(state, level, pos), 2);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(CONNECTION);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction dir, BlockState statetwo, LevelAccessor access,
			BlockPos pos, BlockPos postwo) {
		ConnectionStatus connection = state.getValue(CONNECTION);
		if (connection == ConnectionStatus.BASE_TOGGLED || connection == ConnectionStatus.END_N_TOGGLED
				|| connection == ConnectionStatus.END_E_TOGGLED || connection == ConnectionStatus.END_S_TOGGLED
				|| connection == ConnectionStatus.END_W_TOGGLED) {
			return state;
		}
		return this.StairState(state, access, pos);
	}

	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext contx) {
		BlockPos pos = contx.getClickedPos().below();
		LevelAccessor world = contx.getLevel();
		BlockState stateBelow = world.getBlockState(pos);

		if (stateBelow.getBlock() instanceof Bridge_Block) {
			return null;
		}

		return this.StairState(super.getStateForPlacement(contx), world, contx.getClickedPos());
	}

}