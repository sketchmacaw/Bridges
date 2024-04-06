package net.kikoz.mcwbridges.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kikoz.mcwbridges.MacawsBridges;
import net.kikoz.mcwbridges.objects.items.Plier;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {


		public static final Item PLIERS = registerItem("pliers", new Plier(new FabricItemSettings()));

		private static Item registerItem(String name, Item item) {
			return Registry.register(Registries.ITEM, new Identifier(MacawsBridges.MOD_ID, name), item);
		}
		public static void registerModItems() {
		}

	}
