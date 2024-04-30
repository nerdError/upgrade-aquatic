package com.teamabnormals.upgrade_aquatic.common.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ElderEyeBlockItem extends BlockItem {

	public ElderEyeBlockItem(Block block, Properties properties) {
		super(block, properties);
	}

	@Override
	public EquipmentSlot getEquipmentSlot(ItemStack stack) {
		return EquipmentSlot.HEAD;
	}
}
