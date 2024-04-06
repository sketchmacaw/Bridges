package com.mcwbridges.kikoz.init;

import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Bamboo_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Bridge_Support;
import com.mcwbridges.kikoz.objects.Iron_Bridge;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.items.Bridge_Lantern;
import com.mcwbridges.kikoz.objects.items.Bridge_Torch;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit 
{

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridges.MOD_ID);

	public static final RegistryObject<Block> IRON_BRIDGE = BLOCKS.register("iron_bridge", () -> new Iron_Bridge(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

	public static final RegistryObject<Block> OAK_LOG_BRIDGE_MIDDLE = BLOCKS.register("oak_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava()));
	public static final RegistryObject<Block> BIRCH_LOG_BRIDGE_MIDDLE = BLOCKS.register("birch_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> ACACIA_LOG_BRIDGE_MIDDLE = BLOCKS.register("acacia_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> SPRUCE_LOG_BRIDGE_MIDDLE = BLOCKS.register("spruce_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> JUNGLE_LOG_BRIDGE_MIDDLE = BLOCKS.register("jungle_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
	public static final RegistryObject<Block> DARK_OAK_LOG_BRIDGE_MIDDLE = BLOCKS.register("dark_oak_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
	public static final RegistryObject<Block> CRIMSON_LOG_BRIDGE_MIDDLE = BLOCKS.register("crimson_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
	public static final RegistryObject<Block> WARPED_LOG_BRIDGE_MIDDLE = BLOCKS.register("warped_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
	public static final RegistryObject<Block> MANGROVE_LOG_BRIDGE_MIDDLE = BLOCKS.register("mangrove_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
	
	public static final RegistryObject<Block> ROPE_OAK_BRIDGE = BLOCKS.register("rope_oak_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> ROPE_BIRCH_BRIDGE = BLOCKS.register("rope_birch_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> ROPE_SPRUCE_BRIDGE = BLOCKS.register("rope_spruce_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> ROPE_JUNGLE_BRIDGE = BLOCKS.register("rope_jungle_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
	public static final RegistryObject<Block> ROPE_ACACIA_BRIDGE = BLOCKS.register("rope_acacia_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> ROPE_DARK_OAK_BRIDGE = BLOCKS.register("rope_dark_oak_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
	public static final RegistryObject<Block> ROPE_CRIMSON_BRIDGE = BLOCKS.register("rope_crimson_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
	public static final RegistryObject<Block> ROPE_WARPED_BRIDGE = BLOCKS.register("rope_warped_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
	public static final RegistryObject<Block> ROPE_MANGROVE_BRIDGE = BLOCKS.register("rope_mangrove_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
	
	public static final RegistryObject<Block> BRICK_BRIDGE = BLOCKS.register("brick_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> SANDSTONE_BRIDGE = BLOCKS.register("sandstone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> STONE_BRICK_BRIDGE = BLOCKS.register("stone_brick_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
	public static final RegistryObject<Block> ORANGE_SANDSTONE_BRIDGE = BLOCKS.register("orange_sandstone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_BRIDGE = BLOCKS.register("blackstone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_BRICK_BRIDGE = BLOCKS.register("mossy_stone_brick_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
	public static final RegistryObject<Block> DEEPSLATE_BRICK_BRIDGE = BLOCKS.register("deepslate_brick_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
	public static final RegistryObject<Block> DEEPSLATE_TILE_BRIDGE = BLOCKS.register("deepslate_tile_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
	public static final RegistryObject<Block> MUD_BRICK_BRIDGE = BLOCKS.register("mud_brick_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

	public static final RegistryObject<Block> OAK_RAIL_BRIDGE = BLOCKS.register("oak_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> SPRUCE_RAIL_BRIDGE = BLOCKS.register("spruce_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> BIRCH_RAIL_BRIDGE = BLOCKS.register("birch_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> JUNGLE_RAIL_BRIDGE = BLOCKS.register("jungle_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
	public static final RegistryObject<Block> ACACIA_RAIL_BRIDGE = BLOCKS.register("acacia_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> DARK_OAK_RAIL_BRIDGE = BLOCKS.register("dark_oak_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
	public static final RegistryObject<Block> CRIMSON_RAIL_BRIDGE = BLOCKS.register("crimson_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
	public static final RegistryObject<Block> WARPED_RAIL_BRIDGE = BLOCKS.register("warped_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
	public static final RegistryObject<Block> MANGROVE_RAIL_BRIDGE = BLOCKS.register("mangrove_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

	public static final RegistryObject<Block> BAMBOO_BRIDGE = BLOCKS.register("bamboo_bridge", () -> new Bamboo_Bridge(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
	public static final RegistryObject<Block> DRY_BAMBOO_BRIDGE = BLOCKS.register("dry_bamboo_bridge", () -> new Bamboo_Bridge(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
	
	//Support Pillars
	public static final RegistryObject<Block> IRON_BRIDGE_PIER = BLOCKS.register("iron_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
	
	public static final RegistryObject<Block> OAK_BRIDGE_PIER = BLOCKS.register("oak_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> SPRUCE_BRIDGE_PIER = BLOCKS.register("spruce_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> BIRCH_BRIDGE_PIER = BLOCKS.register("birch_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> JUNGLE_BRIDGE_PIER = BLOCKS.register("jungle_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
	public static final RegistryObject<Block> ACACIA_BRIDGE_PIER = BLOCKS.register("acacia_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> DARK_OAK_BRIDGE_PIER = BLOCKS.register("dark_oak_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
	public static final RegistryObject<Block> CRIMSON_BRIDGE_PIER = BLOCKS.register("crimson_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
	public static final RegistryObject<Block> WARPED_BRIDGE_PIER = BLOCKS.register("warped_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
	public static final RegistryObject<Block> MANGROVE_BRIDGE_PIER = BLOCKS.register("mangrove_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
	
	public static final RegistryObject<Block> BRICK_BRIDGE_PIER = BLOCKS.register("brick_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> SANDSTONE_BRIDGE_PIER = BLOCKS.register("sandstone_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> STONE_BRIDGE_PIER = BLOCKS.register("stone_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
	public static final RegistryObject<Block> RED_SANDSTONE_BRIDGE_PIER = BLOCKS.register("red_sandstone_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_BRIDGE_PIER = BLOCKS.register("blackstone_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_BRIDGE_PIER = BLOCKS.register("mossy_stone_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));	
	public static final RegistryObject<Block> DEEPSLATE_BRICK_BRIDGE_PIER = BLOCKS.register("deepslate_brick_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
	public static final RegistryObject<Block> DEEPSLATE_TILE_BRIDGE_PIER = BLOCKS.register("deepslate_tile_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
	public static final RegistryObject<Block> MUD_BRICK_BRIDGE_PIER = BLOCKS.register("mud_brick_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
	
	public static final RegistryObject<Block> BAMBOO_BRIDGE_PIER = BLOCKS.register("bamboo_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
	public static final RegistryObject<Block> DRY_BAMBOO_BRIDGE_PIER = BLOCKS.register("dry_bamboo_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));

	//Stairs
	public static final RegistryObject<Block> IRON_BRIDGE_STAIR = BLOCKS.register("iron_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
	
	public static final RegistryObject<Block> OAK_LOG_BRIDGE_STAIR = BLOCKS.register("oak_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> SPRUCE_LOG_BRIDGE_STAIR = BLOCKS.register("spruce_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> BIRCH_LOG_BRIDGE_STAIR = BLOCKS.register("birch_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> JUNGLE_LOG_BRIDGE_STAIR = BLOCKS.register("jungle_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
	public static final RegistryObject<Block> ACACIA_LOG_BRIDGE_STAIR = BLOCKS.register("acacia_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> DARK_OAK_LOG_BRIDGE_STAIR = BLOCKS.register("dark_oak_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
	public static final RegistryObject<Block> CRIMSON_LOG_BRIDGE_STAIR = BLOCKS.register("crimson_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
	public static final RegistryObject<Block> WARPED_LOG_BRIDGE_STAIR = BLOCKS.register("warped_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
	public static final RegistryObject<Block> MANGROVE_LOG_BRIDGE_STAIR = BLOCKS.register("mangrove_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

	public static final RegistryObject<Block> OAK_ROPE_BRIDGE_STAIR = BLOCKS.register("oak_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> SPRUCE_ROPE_BRIDGE_STAIR = BLOCKS.register("spruce_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> BIRCH_ROPE_BRIDGE_STAIR = BLOCKS.register("birch_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> JUNGLE_ROPE_BRIDGE_STAIR = BLOCKS.register("jungle_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
	public static final RegistryObject<Block> ACACIA_ROPE_BRIDGE_STAIR = BLOCKS.register("acacia_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> DARK_OAK_ROPE_BRIDGE_STAIR = BLOCKS.register("dark_oak_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
	public static final RegistryObject<Block> CRIMSON_ROPE_BRIDGE_STAIR = BLOCKS.register("crimson_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
	public static final RegistryObject<Block> WARPED_ROPE_BRIDGE_STAIR = BLOCKS.register("warped_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
	public static final RegistryObject<Block> MANGROVE_ROPE_BRIDGE_STAIR = BLOCKS.register("mangrove_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
	
	public static final RegistryObject<Block> STONE_BRICK_BRIDGE_STAIR = BLOCKS.register("stone_brick_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
	public static final RegistryObject<Block> SANDSTONE_BRIDGE_STAIR = BLOCKS.register("sandstone_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> BRICK_BRIDGE_STAIR = BLOCKS.register("brick_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> RED_SANDSTONE_BRIDGE_STAIR = BLOCKS.register("red_sandstone_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_BRIDGE_STAIR = BLOCKS.register("blackstone_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_BRIDGE_STAIR = BLOCKS.register("mossy_stone_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
	public static final RegistryObject<Block> DEEPSLATE_BRICK_BRIDGE_STAIR = BLOCKS.register("deepslate_brick_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
	public static final RegistryObject<Block> DEEPSLATE_TILE_BRIDGE_STAIR = BLOCKS.register("deepslate_tile_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
	public static final RegistryObject<Block> MUD_BRICK_BRIDGE_STAIR = BLOCKS.register("mud_brick_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

	public static final RegistryObject<Block> BAMBOO_BRIDGE_STAIR = BLOCKS.register("bamboo_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
	public static final RegistryObject<Block> DRY_BAMBOO_BRIDGE_STAIR = BLOCKS.register("dry_bamboo_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));

	//2.1.0
	
	public static final RegistryObject<Block> CHERRY_LOG_BRIDGE_MIDDLE = BLOCKS.register("cherry_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
	public static final RegistryObject<Block> ROPE_CHERRY_BRIDGE = BLOCKS.register("rope_cherry_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
	public static final RegistryObject<Block> CHERRY_RAIL_BRIDGE = BLOCKS.register("cherry_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

	public static final RegistryObject<Block> CHERRY_BRIDGE_PIER = BLOCKS.register("cherry_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
	public static final RegistryObject<Block> CHERRY_LOG_BRIDGE_STAIR = BLOCKS.register("cherry_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
	public static final RegistryObject<Block> CHERRY_ROPE_BRIDGE_STAIR = BLOCKS.register("cherry_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

	//3.0.0
	
	public static final RegistryObject<Block> BRIDGE_TORCH = BLOCKS.register("bridge_torch", () -> new Bridge_Torch(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(0.8F,2.0F).instabreak().sound(SoundType.WOOD), 15));
	public static final RegistryObject<Block> BRIDGE_LANTERN = BLOCKS.register("bridge_lantern", () -> new Bridge_Lantern(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(0.8F,2.0F).instabreak().sound(SoundType.WOOD), 15));

	public static final RegistryObject<Block> ASIAN_RED_BRIDGE = BLOCKS.register("asian_red_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
	public static final RegistryObject<Block> GLASS_BRIDGE = BLOCKS.register("glass_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(Blocks.GLASS)));

	public static final RegistryObject<Block> COBBLESTONE_BRIDGE = BLOCKS.register("cobblestone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRIDGE = BLOCKS.register("mossy_cobblestone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> ANDESITE_BRIDGE = BLOCKS.register("andesite_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> GRANITE_BRIDGE = BLOCKS.register("granite_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> DIORITE_BRIDGE = BLOCKS.register("diorite_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> PRISMARINE_BRICKS_BRIDGE = BLOCKS.register("prismarine_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
	public static final RegistryObject<Block> NETHER_BRICKS_BRIDGE = BLOCKS.register("nether_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));
	public static final RegistryObject<Block> END_STONE_BRICKS_BRIDGE = BLOCKS.register("end_stone_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));

	public static final RegistryObject<Block> COBBLESTONE_BRIDGE_PIER = BLOCKS.register("cobblestone_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRIDGE_PIER = BLOCKS.register("mossy_cobblestone_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> ANDESITE_BRIDGE_PIER = BLOCKS.register("andesite_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> GRANITE_BRIDGE_PIER = BLOCKS.register("granite_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> DIORITE_BRIDGE_PIER = BLOCKS.register("diorite_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> PRISMARINE_BRICKS_BRIDGE_PIER = BLOCKS.register("prismarine_bricks_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
	public static final RegistryObject<Block> NETHER_BRICKS_BRIDGE_PIER = BLOCKS.register("nether_bricks_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));
	public static final RegistryObject<Block> END_STONE_BRICKS_BRIDGE_PIER = BLOCKS.register("end_stone_bricks_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));

	public static final RegistryObject<Block> COBBLESTONE_BRIDGE_STAIR = BLOCKS.register("cobblestone_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRIDGE_STAIR = BLOCKS.register("mossy_cobblestone_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> ANDESITE_BRIDGE_STAIR = BLOCKS.register("andesite_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> GRANITE_BRIDGE_STAIR = BLOCKS.register("granite_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> DIORITE_BRIDGE_STAIR = BLOCKS.register("diorite_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> PRISMARINE_BRICKS_BRIDGE_STAIR = BLOCKS.register("prismarine_bricks_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
	public static final RegistryObject<Block> NETHER_BRICKS_BRIDGE_STAIR = BLOCKS.register("nether_bricks_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));
	public static final RegistryObject<Block> END_STONE_BRICKS_BRIDGE_STAIR = BLOCKS.register("end_stone_bricks_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));

	public static final RegistryObject<Block> BALUSTRADE_STONE_BRICKS_BRIDGE = BLOCKS.register("balustrade_stone_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
	public static final RegistryObject<Block> BALUSTRADE_SANDSTONE_BRIDGE = BLOCKS.register("balustrade_sandstone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> BALUSTRADE_BRICKS_BRIDGE = BLOCKS.register("balustrade_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BALUSTRADE_ORANGE_SANDSTONE_BRIDGE = BLOCKS.register("balustrade_orange_sandstone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BALUSTRADE_BLACKSTONE_BRIDGE = BLOCKS.register("balustrade_blackstone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BALUSTRADE_MOSSY_STONE_BRICKS_BRIDGE = BLOCKS.register("balustrade_mossy_stone_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
	public static final RegistryObject<Block> BALUSTRADE_DEEPSLATE_BRICKS_BRIDGE = BLOCKS.register("balustrade_deepslate_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
	public static final RegistryObject<Block> BALUSTRADE_DEEPSLATE_TILES_BRIDGE = BLOCKS.register("balustrade_deepslate_tiles_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
	public static final RegistryObject<Block> BALUSTRADE_MUD_BRICKS_BRIDGE = BLOCKS.register("balustrade_mud_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
	public static final RegistryObject<Block> BALUSTRADE_COBBLESTONE_BRIDGE = BLOCKS.register("balustrade_cobblestone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<Block> BALUSTRADE_MOSSY_COBBLESTONE_BRIDGE = BLOCKS.register("balustrade_mossy_cobblestone_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> BALUSTRADE_ANDESITE_BRIDGE = BLOCKS.register("balustrade_andesite_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> BALUSTRADE_GRANITE_BRIDGE = BLOCKS.register("balustrade_granite_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> BALUSTRADE_DIORITE_BRIDGE = BLOCKS.register("balustrade_diorite_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> BALUSTRADE_PRISMARINE_BRICKS_BRIDGE = BLOCKS.register("balustrade_prismarine_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
	public static final RegistryObject<Block> BALUSTRADE_NETHER_BRICKS_BRIDGE = BLOCKS.register("balustrade_nether_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));
	public static final RegistryObject<Block> BALUSTRADE_END_STONE_BRICKS_BRIDGE = BLOCKS.register("balustrade_end_stone_bricks_bridge", () -> new Bridge_Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));	

	public static final RegistryObject<Block> ASIAN_RED_BRIDGE_PIER = BLOCKS.register("asian_red_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> GLASS_BRIDGE_PIER = BLOCKS.register("glass_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.copy(Blocks.GLASS)));

	public static final RegistryObject<Block> ASIAN_RED_BRIDGE_STAIR = BLOCKS.register("asian_red_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> GLASS_BRIDGE_STAIR = BLOCKS.register("glass_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.copy(Blocks.GLASS)));

}
