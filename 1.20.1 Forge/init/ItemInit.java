package com.mcwbridges.kikoz.init;


import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.items.Plier;
import com.mcwbridges.kikoz.util.BlockItemWithInfo;
import com.mcwbridges.kikoz.util.FuelBlockItemWithInfo;
import com.mcwbridges.kikoz.util.FuelItemBlock;
import com.mcwbridges.kikoz.util.LightInfo;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsBridges.MOD_ID);
	
	public static final RegistryObject<Item> PLIERS = ITEMS.register("pliers", () -> new Plier(new Item.Properties()));

	public static final RegistryObject<Item> IRON_BRIDGE = ITEMS.register("iron_bridge",() -> new BlockItemWithInfo(BlockInit.IRON_BRIDGE.get(), new Item.Properties()));

	public static final RegistryObject<Item> OAK_LOG_BRIDGE_MIDDLE = ITEMS.register("oak_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.OAK_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_LOG_BRIDGE_MIDDLE = ITEMS.register("birch_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.BIRCH_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_LOG_BRIDGE_MIDDLE = ITEMS.register("acacia_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.ACACIA_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_LOG_BRIDGE_MIDDLE = ITEMS.register("spruce_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.SPRUCE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_LOG_BRIDGE_MIDDLE = ITEMS.register("jungle_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.JUNGLE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_LOG_BRIDGE_MIDDLE = ITEMS.register("dark_oak_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.DARK_OAK_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_LOG_BRIDGE_MIDDLE = ITEMS.register("crimson_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.CRIMSON_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_LOG_BRIDGE_MIDDLE = ITEMS.register("warped_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.WARPED_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_LOG_BRIDGE_MIDDLE = ITEMS.register("mangrove_log_bridge_middle",() -> new FuelBlockItemWithInfo(BlockInit.MANGROVE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> ROPE_OAK_BRIDGE = ITEMS.register("rope_oak_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_OAK_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_BIRCH_BRIDGE = ITEMS.register("rope_birch_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_BIRCH_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_SPRUCE_BRIDGE = ITEMS.register("rope_spruce_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_SPRUCE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_JUNGLE_BRIDGE = ITEMS.register("rope_jungle_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_JUNGLE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_ACACIA_BRIDGE = ITEMS.register("rope_acacia_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_ACACIA_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_DARK_OAK_BRIDGE = ITEMS.register("rope_dark_oak_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_DARK_OAK_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_CRIMSON_BRIDGE = ITEMS.register("rope_crimson_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_CRIMSON_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_WARPED_BRIDGE = ITEMS.register("rope_warped_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_WARPED_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_MANGROVE_BRIDGE = ITEMS.register("rope_mangrove_bridge",() -> new FuelBlockItemWithInfo(BlockInit.ROPE_MANGROVE_BRIDGE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> BRICK_BRIDGE = ITEMS.register("brick_bridge",() -> new BlockItemWithInfo(BlockInit.BRICK_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_BRIDGE = ITEMS.register("sandstone_bridge",() -> new BlockItemWithInfo(BlockInit.SANDSTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_BRICK_BRIDGE = ITEMS.register("stone_brick_bridge",() -> new BlockItemWithInfo(BlockInit.STONE_BRICK_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ORANGE_SANDSTONE_BRIDGE = ITEMS.register("orange_sandstone_bridge",() -> new BlockItemWithInfo(BlockInit.ORANGE_SANDSTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_BRIDGE = ITEMS.register("blackstone_bridge",() -> new BlockItemWithInfo(BlockInit.BLACKSTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_STONE_BRICK_BRIDGE = ITEMS.register("mossy_stone_brick_bridge",() -> new BlockItemWithInfo(BlockInit.MOSSY_STONE_BRICK_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_BRICK_BRIDGE = ITEMS.register("deepslate_brick_bridge",() -> new BlockItemWithInfo(BlockInit.DEEPSLATE_BRICK_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_TILE_BRIDGE = ITEMS.register("deepslate_tile_bridge",() -> new BlockItemWithInfo(BlockInit.DEEPSLATE_TILE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_BRIDGE = ITEMS.register("mud_brick_bridge",() -> new BlockItemWithInfo(BlockInit.MUD_BRICK_BRIDGE.get(), new Item.Properties()));

	public static final RegistryObject<Item> OAK_RAIL_BRIDGE = ITEMS.register("oak_rail_bridge",() -> new FuelItemBlock(BlockInit.OAK_RAIL_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_RAIL_BRIDGE = ITEMS.register("spruce_rail_bridge",() -> new FuelItemBlock(BlockInit.SPRUCE_RAIL_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_RAIL_BRIDGE = ITEMS.register("birch_rail_bridge",() -> new FuelItemBlock(BlockInit.BIRCH_RAIL_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_RAIL_BRIDGE = ITEMS.register("jungle_rail_bridge",() -> new FuelItemBlock(BlockInit.JUNGLE_RAIL_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_RAIL_BRIDGE = ITEMS.register("acacia_rail_bridge",() -> new FuelItemBlock(BlockInit.ACACIA_RAIL_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_RAIL_BRIDGE = ITEMS.register("dark_oak_rail_bridge",() -> new FuelItemBlock(BlockInit.DARK_OAK_RAIL_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_RAIL_BRIDGE = ITEMS.register("crimson_rail_bridge",() -> new FuelItemBlock(BlockInit.CRIMSON_RAIL_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_RAIL_BRIDGE = ITEMS.register("warped_rail_bridge",() -> new FuelItemBlock(BlockInit.WARPED_RAIL_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_RAIL_BRIDGE = ITEMS.register("mangrove_rail_bridge",() -> new FuelItemBlock(BlockInit.MANGROVE_RAIL_BRIDGE.get(), new Item.Properties()));

	public static final RegistryObject<Item> BAMBOO_BRIDGE = ITEMS.register("bamboo_bridge",() -> new FuelBlockItemWithInfo(BlockInit.BAMBOO_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE = ITEMS.register("dry_bamboo_bridge",() -> new FuelBlockItemWithInfo(BlockInit.DRY_BAMBOO_BRIDGE.get(), new Item.Properties()));
	

	//Support Pillars
	public static final RegistryObject<Item> IRON_BRIDGE_PIER = ITEMS.register("iron_bridge_pier",() -> new BlockItem(BlockInit.IRON_BRIDGE_PIER.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> OAK_BRIDGE_PIER = ITEMS.register("oak_bridge_pier",() -> new FuelItemBlock(BlockInit.OAK_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_BRIDGE_PIER = ITEMS.register("spruce_bridge_pier",() -> new FuelItemBlock(BlockInit.SPRUCE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_BRIDGE_PIER = ITEMS.register("birch_bridge_pier",() -> new FuelItemBlock(BlockInit.BIRCH_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_BRIDGE_PIER = ITEMS.register("jungle_bridge_pier",() -> new FuelItemBlock(BlockInit.JUNGLE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_BRIDGE_PIER = ITEMS.register("acacia_bridge_pier",() -> new FuelItemBlock(BlockInit.ACACIA_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_BRIDGE_PIER = ITEMS.register("dark_oak_bridge_pier",() -> new FuelItemBlock(BlockInit.DARK_OAK_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_BRIDGE_PIER = ITEMS.register("crimson_bridge_pier",() -> new FuelItemBlock(BlockInit.CRIMSON_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_BRIDGE_PIER = ITEMS.register("warped_bridge_pier",() -> new FuelItemBlock(BlockInit.WARPED_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_BRIDGE_PIER = ITEMS.register("mangrove_bridge_pier",() -> new FuelItemBlock(BlockInit.MANGROVE_BRIDGE_PIER.get(), new Item.Properties()));

	public static final RegistryObject<Item> BRICK_BRIDGE_PIER = ITEMS.register("brick_bridge_pier",() -> new BlockItem(BlockInit.BRICK_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_BRIDGE_PIER = ITEMS.register("sandstone_bridge_pier",() -> new BlockItem(BlockInit.SANDSTONE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_BRIDGE_PIER = ITEMS.register("stone_bridge_pier",() -> new BlockItem(BlockInit.STONE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_BRIDGE_PIER = ITEMS.register("red_sandstone_bridge_pier",() -> new BlockItem(BlockInit.RED_SANDSTONE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_BRIDGE_PIER = ITEMS.register("blackstone_bridge_pier",() -> new BlockItem(BlockInit.BLACKSTONE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_STONE_BRIDGE_PIER = ITEMS.register("mossy_stone_bridge_pier",() -> new BlockItem(BlockInit.MOSSY_STONE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_BRICK_BRIDGE_PIER = ITEMS.register("deepslate_brick_bridge_pier",() -> new BlockItem(BlockInit.DEEPSLATE_BRICK_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_TILE_BRIDGE_PIER = ITEMS.register("deepslate_tile_bridge_pier",() -> new BlockItem(BlockInit.DEEPSLATE_TILE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_BRIDGE_PIER = ITEMS.register("mud_brick_bridge_pier",() -> new BlockItem(BlockInit.MUD_BRICK_BRIDGE_PIER.get(), new Item.Properties()));

	public static final RegistryObject<Item> BAMBOO_BRIDGE_PIER = ITEMS.register("bamboo_bridge_pier",() -> new FuelItemBlock(BlockInit.BAMBOO_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE_PIER = ITEMS.register("dry_bamboo_bridge_pier",() -> new FuelItemBlock(BlockInit.DRY_BAMBOO_BRIDGE_PIER.get(), new Item.Properties()));

	
	//Stairs
	public static final RegistryObject<Item> IRON_BRIDGE_STAIR = ITEMS.register("iron_bridge_stair",() -> new BlockItem(BlockInit.IRON_BRIDGE_STAIR.get(), new Item.Properties()));	
	
	public static final RegistryObject<Item> OAK_LOG_BRIDGE_STAIR = ITEMS.register("oak_log_bridge_stair",() -> new FuelItemBlock(BlockInit.OAK_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_LOG_BRIDGE_STAIR = ITEMS.register("spruce_log_bridge_stair",() -> new FuelItemBlock(BlockInit.SPRUCE_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_LOG_BRIDGE_STAIR = ITEMS.register("birch_log_bridge_stair",() -> new FuelItemBlock(BlockInit.BIRCH_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_LOG_BRIDGE_STAIR = ITEMS.register("jungle_log_bridge_stair",() -> new FuelItemBlock(BlockInit.JUNGLE_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_LOG_BRIDGE_STAIR = ITEMS.register("acacia_log_bridge_stair",() -> new FuelItemBlock(BlockInit.ACACIA_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_LOG_BRIDGE_STAIR = ITEMS.register("dark_oak_log_bridge_stair",() -> new FuelItemBlock(BlockInit.DARK_OAK_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_LOG_BRIDGE_STAIR = ITEMS.register("crimson_log_bridge_stair",() -> new FuelItemBlock(BlockInit.CRIMSON_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_LOG_BRIDGE_STAIR = ITEMS.register("warped_log_bridge_stair",() -> new FuelItemBlock(BlockInit.WARPED_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_LOG_BRIDGE_STAIR = ITEMS.register("mangrove_log_bridge_stair",() -> new FuelItemBlock(BlockInit.MANGROVE_LOG_BRIDGE_STAIR.get(), new Item.Properties()));

	public static final RegistryObject<Item> OAK_ROPE_BRIDGE_STAIR = ITEMS.register("oak_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.OAK_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_ROPE_BRIDGE_STAIR = ITEMS.register("spruce_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.SPRUCE_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_ROPE_BRIDGE_STAIR = ITEMS.register("birch_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.BIRCH_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_ROPE_BRIDGE_STAIR = ITEMS.register("jungle_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.JUNGLE_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_ROPE_BRIDGE_STAIR = ITEMS.register("acacia_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.ACACIA_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_ROPE_BRIDGE_STAIR = ITEMS.register("dark_oak_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.DARK_OAK_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_ROPE_BRIDGE_STAIR = ITEMS.register("crimson_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.CRIMSON_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_ROPE_BRIDGE_STAIR = ITEMS.register("warped_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.WARPED_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_ROPE_BRIDGE_STAIR = ITEMS.register("mangrove_rope_bridge_stair",() -> new FuelItemBlock(BlockInit.MANGROVE_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> STONE_BRICK_BRIDGE_STAIR = ITEMS.register("stone_brick_bridge_stair",() -> new BlockItem(BlockInit.STONE_BRICK_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_BRIDGE_STAIR = ITEMS.register("sandstone_bridge_stair",() -> new BlockItem(BlockInit.SANDSTONE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRICK_BRIDGE_STAIR = ITEMS.register("brick_bridge_stair",() -> new BlockItem(BlockInit.BRICK_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_BRIDGE_STAIR = ITEMS.register("red_sandstone_bridge_stair",() -> new BlockItem(BlockInit.RED_SANDSTONE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_BRIDGE_STAIR = ITEMS.register("blackstone_bridge_stair",() -> new BlockItem(BlockInit.BLACKSTONE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_STONE_BRIDGE_STAIR = ITEMS.register("mossy_stone_bridge_stair",() -> new BlockItem(BlockInit.MOSSY_STONE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_BRICK_BRIDGE_STAIR = ITEMS.register("deepslate_brick_bridge_stair",() -> new BlockItem(BlockInit.DEEPSLATE_BRICK_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_TILE_BRIDGE_STAIR = ITEMS.register("deepslate_tile_bridge_stair",() -> new BlockItem(BlockInit.DEEPSLATE_TILE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_BRIDGE_STAIR = ITEMS.register("mud_brick_bridge_stair",() -> new BlockItem(BlockInit.MUD_BRICK_BRIDGE_STAIR.get(), new Item.Properties()));

	public static final RegistryObject<Item> BAMBOO_BRIDGE_STAIR = ITEMS.register("bamboo_bridge_stair",() -> new FuelItemBlock(BlockInit.BAMBOO_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE_STAIR = ITEMS.register("dry_bamboo_bridge_stair",() -> new FuelItemBlock(BlockInit.DRY_BAMBOO_BRIDGE_STAIR.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> CHERRY_LOG_BRIDGE_MIDDLE = ITEMS.register("cherry_log_bridge_middle", () -> new FuelBlockItemWithInfo(BlockInit.CHERRY_LOG_BRIDGE_MIDDLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROPE_CHERRY_BRIDGE = ITEMS.register("rope_cherry_bridge", () -> new FuelBlockItemWithInfo(BlockInit.ROPE_CHERRY_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_RAIL_BRIDGE = ITEMS.register("cherry_rail_bridge", () -> new FuelItemBlock(BlockInit.CHERRY_RAIL_BRIDGE.get(), new Item.Properties()));

	public static final RegistryObject<Item> CHERRY_BRIDGE_PIER = ITEMS.register("cherry_bridge_pier", () -> new FuelItemBlock(BlockInit.CHERRY_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_LOG_BRIDGE_STAIR = ITEMS.register("cherry_log_bridge_stair", () -> new FuelBlockItemWithInfo(BlockInit.CHERRY_LOG_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_ROPE_BRIDGE_STAIR = ITEMS.register("cherry_rope_bridge_stair", () -> new FuelBlockItemWithInfo(BlockInit.CHERRY_ROPE_BRIDGE_STAIR.get(), new Item.Properties()));

	//3.0.0
	
	public static final RegistryObject<Item> BRIDGE_TORCH = ITEMS.register("bridge_torch", () -> new LightInfo(BlockInit.BRIDGE_TORCH.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRIDGE_LANTERN = ITEMS.register("bridge_lantern", () -> new LightInfo(BlockInit.BRIDGE_LANTERN.get(), new Item.Properties()));

	public static final RegistryObject<Item> ASIAN_RED_BRIDGE = ITEMS.register("asian_red_bridge", () -> new FuelBlockItemWithInfo(BlockInit.ASIAN_RED_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GLASS_BRIDGE = ITEMS.register("glass_bridge", () -> new BlockItemWithInfo(BlockInit.GLASS_BRIDGE.get(), new Item.Properties()));

	public static final RegistryObject<Item> COBBLESTONE_BRIDGE = ITEMS.register("cobblestone_bridge", () -> new BlockItemWithInfo(BlockInit.COBBLESTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_COBBLESTONE_BRIDGE = ITEMS.register("mossy_cobblestone_bridge", () -> new BlockItemWithInfo(BlockInit.MOSSY_COBBLESTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_BRIDGE = ITEMS.register("andesite_bridge", () -> new BlockItemWithInfo(BlockInit.ANDESITE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_BRIDGE = ITEMS.register("granite_bridge", () -> new BlockItemWithInfo(BlockInit.GRANITE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_BRIDGE = ITEMS.register("diorite_bridge", () -> new BlockItemWithInfo(BlockInit.DIORITE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> PRISMARINE_BRICKS_BRIDGE = ITEMS.register("prismarine_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.PRISMARINE_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHER_BRICKS_BRIDGE = ITEMS.register("nether_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.NETHER_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> END_STONE_BRICKS_BRIDGE = ITEMS.register("end_stone_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.END_STONE_BRICKS_BRIDGE.get(), new Item.Properties()));

	public static final RegistryObject<Item> COBBLESTONE_BRIDGE_PIER = ITEMS.register("cobblestone_bridge_pier", () -> new BlockItem(BlockInit.COBBLESTONE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_COBBLESTONE_BRIDGE_PIER = ITEMS.register("mossy_cobblestone_bridge_pier", () -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_BRIDGE_PIER = ITEMS.register("andesite_bridge_pier", () -> new BlockItem(BlockInit.ANDESITE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_BRIDGE_PIER = ITEMS.register("granite_bridge_pier", () -> new BlockItem(BlockInit.GRANITE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_BRIDGE_PIER = ITEMS.register("diorite_bridge_pier", () -> new BlockItem(BlockInit.DIORITE_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> PRISMARINE_BRICKS_BRIDGE_PIER = ITEMS.register("prismarine_bricks_bridge_pier", () -> new BlockItem(BlockInit.PRISMARINE_BRICKS_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHER_BRICKS_BRIDGE_PIER = ITEMS.register("nether_bricks_bridge_pier", () -> new BlockItem(BlockInit.NETHER_BRICKS_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> END_STONE_BRICKS_BRIDGE_PIER = ITEMS.register("end_stone_bricks_bridge_pier", () -> new BlockItem(BlockInit.END_STONE_BRICKS_BRIDGE_PIER.get(), new Item.Properties()));

	public static final RegistryObject<Item> COBBLESTONE_BRIDGE_STAIR = ITEMS.register("cobblestone_bridge_stair", () -> new BlockItem(BlockInit.COBBLESTONE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_COBBLESTONE_BRIDGE_STAIR = ITEMS.register("mossy_cobblestone_bridge_stair", () -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_BRIDGE_STAIR = ITEMS.register("andesite_bridge_stair", () -> new BlockItem(BlockInit.ANDESITE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_BRIDGE_STAIR = ITEMS.register("granite_bridge_stair", () -> new BlockItem(BlockInit.GRANITE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_BRIDGE_STAIR = ITEMS.register("diorite_bridge_stair", () -> new BlockItem(BlockInit.DIORITE_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> PRISMARINE_BRICKS_BRIDGE_STAIR = ITEMS.register("prismarine_bricks_bridge_stair", () -> new BlockItem(BlockInit.PRISMARINE_BRICKS_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHER_BRICKS_BRIDGE_STAIR = ITEMS.register("nether_bricks_bridge_stair", () -> new BlockItem(BlockInit.NETHER_BRICKS_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> END_STONE_BRICKS_BRIDGE_STAIR = ITEMS.register("end_stone_bricks_bridge_stair", () -> new BlockItem(BlockInit.END_STONE_BRICKS_BRIDGE_STAIR.get(), new Item.Properties()));

	public static final RegistryObject<Item> BALUSTRADE_STONE_BRICKS_BRIDGE = ITEMS.register("balustrade_stone_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_STONE_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_SANDSTONE_BRIDGE = ITEMS.register("balustrade_sandstone_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_SANDSTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_BRICKS_BRIDGE = ITEMS.register("balustrade_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_ORANGE_SANDSTONE_BRIDGE = ITEMS.register("balustrade_orange_sandstone_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_ORANGE_SANDSTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_BLACKSTONE_BRIDGE = ITEMS.register("balustrade_blackstone_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_BLACKSTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_MOSSY_STONE_BRICKS_BRIDGE = ITEMS.register("balustrade_mossy_stone_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_MOSSY_STONE_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_DEEPSLATE_BRICKS_BRIDGE = ITEMS.register("balustrade_deepslate_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_DEEPSLATE_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_DEEPSLATE_TILES_BRIDGE = ITEMS.register("balustrade_deepslate_tiles_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_DEEPSLATE_TILES_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_MUD_BRICKS_BRIDGE = ITEMS.register("balustrade_mud_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_MUD_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_COBBLESTONE_BRIDGE = ITEMS.register("balustrade_cobblestone_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_COBBLESTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_MOSSY_COBBLESTONE_BRIDGE = ITEMS.register("balustrade_mossy_cobblestone_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_MOSSY_COBBLESTONE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_ANDESITE_BRIDGE = ITEMS.register("balustrade_andesite_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_ANDESITE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_GRANITE_BRIDGE = ITEMS.register("balustrade_granite_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_GRANITE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_DIORITE_BRIDGE = ITEMS.register("balustrade_diorite_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_DIORITE_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_PRISMARINE_BRICKS_BRIDGE = ITEMS.register("balustrade_prismarine_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_PRISMARINE_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_NETHER_BRICKS_BRIDGE = ITEMS.register("balustrade_nether_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_NETHER_BRICKS_BRIDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BALUSTRADE_END_STONE_BRICKS_BRIDGE = ITEMS.register("balustrade_end_stone_bricks_bridge", () -> new BlockItemWithInfo(BlockInit.BALUSTRADE_END_STONE_BRICKS_BRIDGE.get(), new Item.Properties()));

	public static final RegistryObject<Item> ASIAN_RED_BRIDGE_PIER = ITEMS.register("asian_red_bridge_pier",() -> new FuelItemBlock(BlockInit.ASIAN_RED_BRIDGE_PIER.get(), new Item.Properties()));
	public static final RegistryObject<Item> GLASS_BRIDGE_PIER = ITEMS.register("glass_bridge_pier",() -> new BlockItem(BlockInit.GLASS_BRIDGE_PIER.get(), new Item.Properties()));

	public static final RegistryObject<Item> ASIAN_RED_BRIDGE_STAIR = ITEMS.register("asian_red_bridge_stair",() -> new FuelItemBlock(BlockInit.ASIAN_RED_BRIDGE_STAIR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GLASS_BRIDGE_STAIR = ITEMS.register("glass_bridge_stair",() -> new BlockItem(BlockInit.GLASS_BRIDGE_STAIR.get(), new Item.Properties()));

}