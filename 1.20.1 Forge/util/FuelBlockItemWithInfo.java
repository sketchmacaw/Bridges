package com.mcwbridges.kikoz.util;

import javax.annotation.Nullable;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.extensions.IForgeItem;

public class FuelBlockItemWithInfo extends BlockItemWithInfo implements IForgeItem {

	public FuelBlockItemWithInfo(Block block, Properties prop) {
		super(block, prop);
	}

	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
		return 300;
	}

}