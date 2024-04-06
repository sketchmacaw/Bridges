package net.kikoz.mcwbridges;


import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kikoz.mcwbridges.init.BlockInit;
import net.kikoz.mcwbridges.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacawsBridges implements ModInitializer {

	public static final String MOD_ID = "mcwbridges";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);
	public static final RegistryKey<ItemGroup> BRIDGEGROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MacawsBridges.MOD_ID, "bridges"));


	@Override
	public void onInitialize() {
		BlockInit.registerModBlocks();
		ItemInit.registerModItems();

		Registry.register(Registries.ITEM_GROUP, BRIDGEGROUP, FabricItemGroup.builder().displayName(Text.translatable("itemGroup.mcwbridges"))
				.icon(() -> new ItemStack(BlockInit.ROPE_OAK_BRIDGE)).entries((displayContext, entries) -> {
					entries.add(ItemInit.PLIERS);
					entries.add(BlockInit.BRIDGE_TORCH);
					entries.add(BlockInit.BRIDGE_LANTERN);
					entries.add(BlockInit.IRON_BRIDGE);
					entries.add(BlockInit.OAK_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.BIRCH_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.ACACIA_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.SPRUCE_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.JUNGLE_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.DARK_OAK_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.CRIMSON_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.WARPED_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.MANGROVE_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.CHERRY_LOG_BRIDGE_MIDDLE);
					entries.add(BlockInit.ROPE_OAK_BRIDGE);
					entries.add(BlockInit.ROPE_BIRCH_BRIDGE);
					entries.add(BlockInit.ROPE_SPRUCE_BRIDGE);
					entries.add(BlockInit.ROPE_JUNGLE_BRIDGE);
					entries.add(BlockInit.ROPE_ACACIA_BRIDGE);
					entries.add(BlockInit.ROPE_DARK_OAK_BRIDGE);
					entries.add(BlockInit.ROPE_CRIMSON_BRIDGE);
					entries.add(BlockInit.ROPE_WARPED_BRIDGE);
					entries.add(BlockInit.ROPE_MANGROVE_BRIDGE);
					entries.add(BlockInit.ROPE_CHERRY_BRIDGE);
					entries.add(BlockInit.BRICK_BRIDGE);
					entries.add(BlockInit.SANDSTONE_BRIDGE);
					entries.add(BlockInit.STONE_BRICK_BRIDGE);
					entries.add(BlockInit.ORANGE_SANDSTONE_BRIDGE);
					entries.add(BlockInit.BLACKSTONE_BRIDGE);
					entries.add(BlockInit.MOSSY_STONE_BRICK_BRIDGE);
					entries.add(BlockInit.DEEPSLATE_BRICK_BRIDGE);
					entries.add(BlockInit.DEEPSLATE_TILE_BRIDGE);
					entries.add(BlockInit.MUD_BRICK_BRIDGE);
					entries.add(BlockInit.COBBLESTONE_BRIDGE);
					entries.add(BlockInit.MOSSY_COBBLESTONE_BRIDGE);
					entries.add(BlockInit.ANDESITE_BRIDGE);
					entries.add(BlockInit.GRANITE_BRIDGE);
					entries.add(BlockInit.DIORITE_BRIDGE);
					entries.add(BlockInit.PRISMARINE_BRICKS_BRIDGE);
					entries.add(BlockInit.NETHER_BRICKS_BRIDGE);
					entries.add(BlockInit.END_STONE_BRICKS_BRIDGE);
					entries.add(BlockInit.OAK_RAIL_BRIDGE);
					entries.add(BlockInit.SPRUCE_RAIL_BRIDGE);
					entries.add(BlockInit.BIRCH_RAIL_BRIDGE);
					entries.add(BlockInit.JUNGLE_RAIL_BRIDGE);
					entries.add(BlockInit.ACACIA_RAIL_BRIDGE);
					entries.add(BlockInit.DARK_OAK_RAIL_BRIDGE);
					entries.add(BlockInit.CRIMSON_RAIL_BRIDGE);
					entries.add(BlockInit.WARPED_RAIL_BRIDGE);
					entries.add(BlockInit.MANGROVE_RAIL_BRIDGE);
					entries.add(BlockInit.CHERRY_RAIL_BRIDGE);
					entries.add(BlockInit.BAMBOO_BRIDGE);
					entries.add(BlockInit.DRY_BAMBOO_BRIDGE);
					entries.add(BlockInit.ASIAN_RED_BRIDGE);
					entries.add(BlockInit.GLASS_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_STONE_BRICKS_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_SANDSTONE_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_BRICKS_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_ORANGE_SANDSTONE_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_BLACKSTONE_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_MOSSY_STONE_BRICKS_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_DEEPSLATE_BRICKS_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_DEEPSLATE_TILES_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_MUD_BRICKS_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_COBBLESTONE_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_MOSSY_COBBLESTONE_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_ANDESITE_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_GRANITE_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_DIORITE_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_PRISMARINE_BRICKS_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_NETHER_BRICKS_BRIDGE);
					entries.add(BlockInit.BALUSTRADE_END_STONE_BRICKS_BRIDGE);
					entries.add(BlockInit.IRON_BRIDGE_PIER);
					entries.add(BlockInit.OAK_BRIDGE_PIER);
					entries.add(BlockInit.SPRUCE_BRIDGE_PIER);
					entries.add(BlockInit.BIRCH_BRIDGE_PIER);
					entries.add(BlockInit.JUNGLE_BRIDGE_PIER);
					entries.add(BlockInit.ACACIA_BRIDGE_PIER);
					entries.add(BlockInit.DARK_OAK_BRIDGE_PIER);
					entries.add(BlockInit.CRIMSON_BRIDGE_PIER);
					entries.add(BlockInit.WARPED_BRIDGE_PIER);
					entries.add(BlockInit.MANGROVE_BRIDGE_PIER);
					entries.add(BlockInit.CHERRY_BRIDGE_PIER);
					entries.add(BlockInit.ASIAN_RED_BRIDGE_PIER);
					entries.add(BlockInit.GLASS_BRIDGE_PIER);
					entries.add(BlockInit.BRICK_BRIDGE_PIER);
					entries.add(BlockInit.SANDSTONE_BRIDGE_PIER);
					entries.add(BlockInit.STONE_BRIDGE_PIER);
					entries.add(BlockInit.RED_SANDSTONE_BRIDGE_PIER);
					entries.add(BlockInit.BLACKSTONE_BRIDGE_PIER);
					entries.add(BlockInit.MOSSY_STONE_BRIDGE_PIER);
					entries.add(BlockInit.DEEPSLATE_BRICK_BRIDGE_PIER);
					entries.add(BlockInit.DEEPSLATE_TILE_BRIDGE_PIER);
					entries.add(BlockInit.MUD_BRICK_BRIDGE_PIER);
					entries.add(BlockInit.BAMBOO_BRIDGE_PIER);
					entries.add(BlockInit.DRY_BAMBOO_BRIDGE_PIER);
					entries.add(BlockInit.COBBLESTONE_BRIDGE_PIER);
					entries.add(BlockInit.MOSSY_COBBLESTONE_BRIDGE_PIER);
					entries.add(BlockInit.ANDESITE_BRIDGE_PIER);
					entries.add(BlockInit.GRANITE_BRIDGE_PIER);
					entries.add(BlockInit.DIORITE_BRIDGE_PIER);
					entries.add(BlockInit.PRISMARINE_BRICKS_BRIDGE_PIER);
					entries.add(BlockInit.NETHER_BRICKS_BRIDGE_PIER);
					entries.add(BlockInit.END_STONE_BRICKS_BRIDGE_PIER);
					entries.add(BlockInit.IRON_BRIDGE_STAIR);
					entries.add(BlockInit.OAK_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.SPRUCE_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.BIRCH_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.JUNGLE_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.ACACIA_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.DARK_OAK_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.CRIMSON_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.WARPED_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.MANGROVE_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.CHERRY_LOG_BRIDGE_STAIR);
					entries.add(BlockInit.OAK_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.SPRUCE_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.BIRCH_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.JUNGLE_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.ACACIA_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.DARK_OAK_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.CRIMSON_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.WARPED_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.MANGROVE_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.CHERRY_ROPE_BRIDGE_STAIR);
					entries.add(BlockInit.STONE_BRICK_BRIDGE_STAIR);
					entries.add(BlockInit.SANDSTONE_BRIDGE_STAIR);
					entries.add(BlockInit.ASIAN_RED_BRIDGE_STAIR);
					entries.add(BlockInit.GLASS_BRIDGE_STAIR);
					entries.add(BlockInit.BRICK_BRIDGE_STAIR);
					entries.add(BlockInit.RED_SANDSTONE_BRIDGE_STAIR);
					entries.add(BlockInit.BLACKSTONE_BRIDGE_STAIR);
					entries.add(BlockInit.MOSSY_STONE_BRIDGE_STAIR);
					entries.add(BlockInit.DEEPSLATE_BRICK_BRIDGE_STAIR);
					entries.add(BlockInit.DEEPSLATE_TILE_BRIDGE_STAIR);
					entries.add(BlockInit.MUD_BRICK_BRIDGE_STAIR);
					entries.add(BlockInit.BAMBOO_BRIDGE_STAIR);
					entries.add(BlockInit.DRY_BAMBOO_BRIDGE_STAIR);
					entries.add(BlockInit.COBBLESTONE_BRIDGE_STAIR);
					entries.add(BlockInit.MOSSY_COBBLESTONE_BRIDGE_STAIR);
					entries.add(BlockInit.ANDESITE_BRIDGE_STAIR);
					entries.add(BlockInit.GRANITE_BRIDGE_STAIR);
					entries.add(BlockInit.DIORITE_BRIDGE_STAIR);
					entries.add(BlockInit.PRISMARINE_BRICKS_BRIDGE_STAIR);
					entries.add(BlockInit.NETHER_BRICKS_BRIDGE_STAIR);
					entries.add(BlockInit.END_STONE_BRICKS_BRIDGE_STAIR);
				}).build());
	}
}




