package net.kikoz.mcwbridges.util;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.kikoz.mcwbridges.init.BlockInit;
import net.minecraft.client.render.RenderLayer;

public class ClientEventBusSubscriber implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.IRON_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CHERRY_LOG_BRIDGE_MIDDLE, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_OAK_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_BIRCH_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_SPRUCE_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_JUNGLE_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_ACACIA_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_DARK_OAK_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_CRIMSON_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_WARPED_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_MANGROVE_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ROPE_CHERRY_BRIDGE, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.STONE_BRICK_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ORANGE_SANDSTONE_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_STONE_BRICK_BRIDGE, RenderLayer.getCutout());	
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BLACKSTONE_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_BRICK_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_TILE_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_BRIDGE, RenderLayer.getCutout());


		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_RAIL_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CHERRY_RAIL_BRIDGE, RenderLayer.getCutout());


		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DRY_BAMBOO_BRIDGE, RenderLayer.getCutout());
		
		// PIERS

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.IRON_BRIDGE_PIER, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_BRIDGE_PIER, RenderLayer.getCutout());	
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CHERRY_BRIDGE_PIER, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.STONE_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RED_SANDSTONE_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BLACKSTONE_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_STONE_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_BRICK_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_TILE_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_BRIDGE_PIER, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DRY_BAMBOO_BRIDGE_PIER, RenderLayer.getCutout());
		
		// STAIRS
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.IRON_BRIDGE_STAIR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_LOG_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CHERRY_LOG_BRIDGE_STAIR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CHERRY_ROPE_BRIDGE_STAIR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.STONE_BRICK_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RED_SANDSTONE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_STONE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BLACKSTONE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_BRICK_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_TILE_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_BRIDGE_STAIR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_BRIDGE_STAIR, RenderLayer.getCutout());	
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DRY_BAMBOO_BRIDGE_STAIR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRIDGE_TORCH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRIDGE_LANTERN, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ASIAN_RED_BRIDGE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GLASS_BRIDGE, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ASIAN_RED_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GLASS_BRIDGE_PIER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ASIAN_RED_BRIDGE_STAIR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GLASS_BRIDGE_STAIR, RenderLayer.getCutout());



	}
}