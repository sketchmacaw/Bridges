package net.kikoz.mcwbridges.init;

import net.kikoz.mcwbridges.MacawsBridges;
import net.kikoz.mcwbridges.objects.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.kikoz.mcwbridges.objects.items.Bridge_Lantern;
import net.kikoz.mcwbridges.objects.items.Bridge_Torch;
import net.kikoz.mcwbridges.util.BlockItemWithInfo;
import net.kikoz.mcwbridges.util.LightInfo;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockInit 
{

	 public static final Block IRON_BRIDGE = registerBridgeBlock("iron_bridge", new Iron_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).strength(3.0F,5.0F).requiresTool().sounds(BlockSoundGroup.METAL)));

	 public static final Block OAK_LOG_BRIDGE_MIDDLE = registerBridgeBlock("oak_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.5F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block BIRCH_LOG_BRIDGE_MIDDLE = registerBridgeBlock("birch_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.5F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ACACIA_LOG_BRIDGE_MIDDLE = registerBridgeBlock("acacia_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.5F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block SPRUCE_LOG_BRIDGE_MIDDLE = registerBridgeBlock("spruce_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.5F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block JUNGLE_LOG_BRIDGE_MIDDLE = registerBridgeBlock("jungle_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.5F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block DARK_OAK_LOG_BRIDGE_MIDDLE = registerBridgeBlock("dark_oak_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.5F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CRIMSON_LOG_BRIDGE_MIDDLE = registerBridgeBlock("crimson_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.5F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block WARPED_LOG_BRIDGE_MIDDLE = registerBridgeBlock("warped_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.LICHEN_GREEN).strength(1.0F,2.5F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block MANGROVE_LOG_BRIDGE_MIDDLE = registerBridgeBlock("mangrove_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.5F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CHERRY_LOG_BRIDGE_MIDDLE = registerBridgeBlock("cherry_log_bridge_middle", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.0F,2.5F).sounds(BlockSoundGroup.CHERRY_WOOD)));

     public static final Block ROPE_OAK_BRIDGE = registerBridgeBlock("rope_oak_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ROPE_BIRCH_BRIDGE = registerBridgeBlock("rope_birch_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ROPE_SPRUCE_BRIDGE = registerBridgeBlock("rope_spruce_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ROPE_JUNGLE_BRIDGE = registerBridgeBlock("rope_jungle_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ROPE_ACACIA_BRIDGE = registerBridgeBlock("rope_acacia_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ROPE_DARK_OAK_BRIDGE = registerBridgeBlock("rope_dark_oak_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ROPE_CRIMSON_BRIDGE = registerBridgeBlock("rope_crimson_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block ROPE_WARPED_BRIDGE = registerBridgeBlock("rope_warped_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.LICHEN_GREEN).strength(1.0F,2.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block ROPE_MANGROVE_BRIDGE = registerBridgeBlock("rope_mangrove_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ROPE_CHERRY_BRIDGE = registerBridgeBlock("rope_cherry_bridge", new Bridge_Block_Rope(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.0F,2.0F).sounds(BlockSoundGroup.CHERRY_WOOD)));

	 public static final Block BRICK_BRIDGE = registerBridgeBlock("brick_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block SANDSTONE_BRIDGE = registerBridgeBlock("sandstone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block STONE_BRICK_BRIDGE = registerBridgeBlock("stone_brick_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block ORANGE_SANDSTONE_BRIDGE = registerBridgeBlock("orange_sandstone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block BLACKSTONE_BRIDGE = registerBridgeBlock("blackstone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block MOSSY_STONE_BRICK_BRIDGE = registerBridgeBlock("mossy_stone_brick_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block DEEPSLATE_BRICK_BRIDGE = registerBridgeBlock("deepslate_brick_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block DEEPSLATE_TILE_BRIDGE = registerBridgeBlock("deepslate_tile_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block MUD_BRICK_BRIDGE = registerBridgeBlock("mud_brick_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

  	 public static final Block OAK_RAIL_BRIDGE = registerBlock("oak_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block SPRUCE_RAIL_BRIDGE = registerBlock("spruce_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block BIRCH_RAIL_BRIDGE = registerBlock("birch_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block JUNGLE_RAIL_BRIDGE = registerBlock("jungle_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ACACIA_RAIL_BRIDGE = registerBlock("acacia_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block DARK_OAK_RAIL_BRIDGE = registerBlock("dark_oak_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CRIMSON_RAIL_BRIDGE = registerBlock("crimson_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block WARPED_RAIL_BRIDGE = registerBlock("warped_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.LICHEN_GREEN).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block MANGROVE_RAIL_BRIDGE = registerBlock("mangrove_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CHERRY_RAIL_BRIDGE = registerBlock("cherry_rail_bridge", new Rail_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.PINK).nonOpaque().strength(1.0F,3.0F).sounds(BlockSoundGroup.CHERRY_WOOD)));

	 public static final Block BAMBOO_BRIDGE = registerBridgeBlock("bamboo_bridge", new Bamboo_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(1.0F,2.0F).sounds(BlockSoundGroup.BAMBOO)));
	 public static final Block DRY_BAMBOO_BRIDGE = registerBridgeBlock("dry_bamboo_bridge", new Bamboo_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(1.0F,2.0F).sounds(BlockSoundGroup.SCAFFOLDING)));
	

	//Support Pillars
	 public static final Block IRON_BRIDGE_PIER = registerBlock("iron_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).strength(3.0F,5.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
	
	 public static final Block OAK_BRIDGE_PIER = registerBlock("oak_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block SPRUCE_BRIDGE_PIER = registerBlock("spruce_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block BIRCH_BRIDGE_PIER = registerBlock("birch_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block JUNGLE_BRIDGE_PIER = registerBlock("jungle_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ACACIA_BRIDGE_PIER = registerBlock("acacia_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block DARK_OAK_BRIDGE_PIER = registerBlock("dark_oak_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CRIMSON_BRIDGE_PIER = registerBlock("crimson_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block WARPED_BRIDGE_PIER = registerBlock("warped_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.LICHEN_GREEN).strength(1.0F,2.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block MANGROVE_BRIDGE_PIER = registerBlock("mangrove_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
     public static final Block CHERRY_BRIDGE_PIER = registerBlock("cherry_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.0F,2.0F).sounds(BlockSoundGroup.CHERRY_WOOD)));

	 public static final Block BRICK_BRIDGE_PIER = registerBlock("brick_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_RED).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block SANDSTONE_BRIDGE_PIER = registerBlock("sandstone_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block STONE_BRIDGE_PIER = registerBlock("stone_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block RED_SANDSTONE_BRIDGE_PIER = registerBlock("red_sandstone_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_RED).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block BLACKSTONE_BRIDGE_PIER = registerBlock("blackstone_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block MOSSY_STONE_BRIDGE_PIER = registerBlock("mossy_stone_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block DEEPSLATE_BRICK_BRIDGE_PIER = registerBlock("deepslate_brick_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block DEEPSLATE_TILE_BRIDGE_PIER = registerBlock("deepslate_tile_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block MUD_BRICK_BRIDGE_PIER = registerBlock("mud_brick_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

	 public static final Block BAMBOO_BRIDGE_PIER = registerBlock("bamboo_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(1.0F,2.0F).sounds(BlockSoundGroup.BAMBOO)));
	 public static final Block DRY_BAMBOO_BRIDGE_PIER = registerBlock("dry_bamboo_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(1.0F,2.0F).sounds(BlockSoundGroup.SCAFFOLDING)));

	//Stairs
	 public static final Block IRON_BRIDGE_STAIR = registerBlock("iron_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).strength(3.0F,5.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
	
	 public static final Block OAK_LOG_BRIDGE_STAIR = registerBlock("oak_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block SPRUCE_LOG_BRIDGE_STAIR = registerBlock("spruce_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block BIRCH_LOG_BRIDGE_STAIR = registerBlock("birch_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block JUNGLE_LOG_BRIDGE_STAIR = registerBlock("jungle_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ACACIA_LOG_BRIDGE_STAIR = registerBlock("acacia_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block DARK_OAK_LOG_BRIDGE_STAIR = registerBlock("dark_oak_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CRIMSON_LOG_BRIDGE_STAIR = registerBlock("crimson_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block WARPED_LOG_BRIDGE_STAIR = registerBlock("warped_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.LICHEN_GREEN).strength(1.0F,2.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block MANGROVE_LOG_BRIDGE_STAIR = registerBlock("mangrove_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CHERRY_LOG_BRIDGE_STAIR = registerBlock("cherry_log_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.0F,2.0F).sounds(BlockSoundGroup.CHERRY_WOOD)));

	 public static final Block OAK_ROPE_BRIDGE_STAIR = registerBlock("oak_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block SPRUCE_ROPE_BRIDGE_STAIR = registerBlock("spruce_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block BIRCH_ROPE_BRIDGE_STAIR = registerBlock("birch_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block JUNGLE_ROPE_BRIDGE_STAIR = registerBlock("jungle_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block ACACIA_ROPE_BRIDGE_STAIR = registerBlock("acacia_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block DARK_OAK_ROPE_BRIDGE_STAIR = registerBlock("dark_oak_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CRIMSON_ROPE_BRIDGE_STAIR = registerBlock("crimson_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block WARPED_ROPE_BRIDGE_STAIR = registerBlock("warped_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.LICHEN_GREEN).strength(1.0F,2.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
	 public static final Block MANGROVE_ROPE_BRIDGE_STAIR = registerBlock("mangrove_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(1.0F,2.0F).sounds(BlockSoundGroup.WOOD)));
	 public static final Block CHERRY_ROPE_BRIDGE_STAIR = registerBlock("cherry_rope_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.0F,2.0F).sounds(BlockSoundGroup.CHERRY_WOOD)));

	 public static final Block STONE_BRICK_BRIDGE_STAIR = registerBlock("stone_brick_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block SANDSTONE_BRIDGE_STAIR = registerBlock("sandstone_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block BRICK_BRIDGE_STAIR = registerBlock("brick_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_RED).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block RED_SANDSTONE_BRIDGE_STAIR = registerBlock("red_sandstone_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_RED).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block BLACKSTONE_BRIDGE_STAIR = registerBlock("blackstone_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block MOSSY_STONE_BRIDGE_STAIR = registerBlock("mossy_stone_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block DEEPSLATE_BRICK_BRIDGE_STAIR = registerBlock("deepslate_brick_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block DEEPSLATE_TILE_BRIDGE_STAIR = registerBlock("deepslate_tile_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	 public static final Block MUD_BRICK_BRIDGE_STAIR = registerBlock("mud_brick_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

	 public static final Block BAMBOO_BRIDGE_STAIR = registerBlock("bamboo_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(1.0F,6.0F).sounds(BlockSoundGroup.BAMBOO)));
	 public static final Block DRY_BAMBOO_BRIDGE_STAIR = registerBlock("dry_bamboo_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(1.0F,6.0F).sounds(BlockSoundGroup.SCAFFOLDING)));

	 //3.0.0
	 public static final Block BRIDGE_TORCH = registerLightBlock("bridge_torch", new Bridge_Torch(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(1.0F,6.0F).sounds(BlockSoundGroup.BAMBOO)));
	 public static final Block BRIDGE_LANTERN = registerLightBlock("bridge_lantern", new Bridge_Lantern(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(1.0F,6.0F).sounds(BlockSoundGroup.BAMBOO)));

	 public static final Block ASIAN_RED_BRIDGE = registerBridgeBlock("asian_red_bridge", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(1.0F,6.0F).sounds(BlockSoundGroup.BAMBOO)));
	 public static final Block GLASS_BRIDGE = registerBridgeBlock("glass_bridge", new Log_Bridge(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(1.0F,6.0F).sounds(BlockSoundGroup.BAMBOO)));

	public static final Block COBBLESTONE_BRIDGE = registerBridgeBlock("cobblestone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block MOSSY_COBBLESTONE_BRIDGE = registerBridgeBlock("mossy_cobblestone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block ANDESITE_BRIDGE = registerBridgeBlock("andesite_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block GRANITE_BRIDGE = registerBridgeBlock("granite_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIORITE_BRIDGE = registerBridgeBlock("diorite_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block PRISMARINE_BRICKS_BRIDGE = registerBridgeBlock("prismarine_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block NETHER_BRICKS_BRIDGE = registerBridgeBlock("nether_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block END_STONE_BRICKS_BRIDGE = registerBridgeBlock("end_stone_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block COBBLESTONE_BRIDGE_PIER = registerBlock("cobblestone_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block MOSSY_COBBLESTONE_BRIDGE_PIER = registerBlock("mossy_cobblestone_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block ANDESITE_BRIDGE_PIER = registerBlock("andesite_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block GRANITE_BRIDGE_PIER = registerBlock("granite_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIORITE_BRIDGE_PIER = registerBlock("diorite_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block PRISMARINE_BRICKS_BRIDGE_PIER = registerBlock("prismarine_bricks_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block NETHER_BRICKS_BRIDGE_PIER = registerBlock("nether_bricks_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block END_STONE_BRICKS_BRIDGE_PIER = registerBlock("end_stone_bricks_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block COBBLESTONE_BRIDGE_STAIR = registerBlock("cobblestone_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block MOSSY_COBBLESTONE_BRIDGE_STAIR = registerBlock("mossy_cobblestone_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block ANDESITE_BRIDGE_STAIR = registerBlock("andesite_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block GRANITE_BRIDGE_STAIR = registerBlock("granite_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIORITE_BRIDGE_STAIR = registerBlock("diorite_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block PRISMARINE_BRICKS_BRIDGE_STAIR = registerBlock("prismarine_bricks_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block NETHER_BRICKS_BRIDGE_STAIR = registerBlock("nether_bricks_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block END_STONE_BRICKS_BRIDGE_STAIR = registerBlock("end_stone_bricks_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block BALUSTRADE_STONE_BRICKS_BRIDGE = registerBridgeBlock("balustrade_stone_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_SANDSTONE_BRIDGE = registerBridgeBlock("balustrade_sandstone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_BRICKS_BRIDGE = registerBridgeBlock("balustrade_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_ORANGE_SANDSTONE_BRIDGE = registerBridgeBlock("balustrade_orange_sandstone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_BLACKSTONE_BRIDGE = registerBridgeBlock("balustrade_blackstone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_MOSSY_STONE_BRICKS_BRIDGE = registerBridgeBlock("balustrade_mossy_stone_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_DEEPSLATE_BRICKS_BRIDGE = registerBridgeBlock("balustrade_deepslate_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_DEEPSLATE_TILES_BRIDGE = registerBridgeBlock("balustrade_deepslate_tiles_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_MUD_BRICKS_BRIDGE = registerBridgeBlock("balustrade_mud_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_COBBLESTONE_BRIDGE = registerBridgeBlock("balustrade_cobblestone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_MOSSY_COBBLESTONE_BRIDGE = registerBridgeBlock("balustrade_mossy_cobblestone_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_ANDESITE_BRIDGE = registerBridgeBlock("balustrade_andesite_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_GRANITE_BRIDGE = registerBridgeBlock("balustrade_granite_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_DIORITE_BRIDGE = registerBridgeBlock("balustrade_diorite_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_PRISMARINE_BRICKS_BRIDGE = registerBridgeBlock("balustrade_prismarine_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_NETHER_BRICKS_BRIDGE = registerBridgeBlock("balustrade_nether_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BALUSTRADE_END_STONE_BRICKS_BRIDGE = registerBridgeBlock("balustrade_end_stone_bricks_bridge", new Bridge_Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block ASIAN_RED_BRIDGE_PIER = registerBlock("asian_red_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block GLASS_BRIDGE_PIER = registerBlock("glass_bridge_pier", new Bridge_Support(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block ASIAN_RED_BRIDGE_STAIR = registerBlock("asian_red_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block GLASS_BRIDGE_STAIR = registerBlock("glass_bridge_stair", new Bridge_Stairs(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(1.0F,6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(MacawsBridges.MOD_ID, name), block);
	}

	private static Block registerLightBlock(String name, Block block) {
		registerLightBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(MacawsBridges.MOD_ID, name), block);
	}

	private static Block registerBridgeBlock(String name, Block block) {
		registerBridgeBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(MacawsBridges.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		Item item = Registry.register(Registries.ITEM, new Identifier(MacawsBridges.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()));
		return item;
	}

	private static Item registerLightBlockItem(String name, Block block) {
		Item item = Registry.register(Registries.ITEM, new Identifier(MacawsBridges.MOD_ID, name),
				new LightInfo(block, new FabricItemSettings()));
		return item;
	}

	private static Item registerBridgeBlockItem(String name, Block block) {
		Item item = Registry.register(Registries.ITEM, new Identifier(MacawsBridges.MOD_ID, name),
				new BlockItemWithInfo(block, new FabricItemSettings()));
		return item;
	}
	public static void registerModBlocks() {
	}
}