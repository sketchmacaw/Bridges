package com.mcwbridges.kikoz.util;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.extensions.IForgeItem;

public class LightInfo extends BlockItem implements IForgeItem {

	public LightInfo(Block block, Properties prop) {
		super(block, prop);
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flag) {
		list.add(this.getDescription().withStyle(ChatFormatting.GRAY));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public MutableComponent getDescription() {
		return Component.translatable("mcwbridges.light.desc");
	}
}