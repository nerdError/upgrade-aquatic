package com.teamabnormals.upgrade_aquatic.core.other;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UAConstants {
	public static final String CAVERNS_AND_CHASMS = "caverns_and_chasms";

	public static final ResourceLocation GLOW_BERRY_BASKET = new ResourceLocation("berry_good", "glow_berry_basket");

	public static final ResourceLocation BAMBOO_LADDER = new ResourceLocation("woodworks", "bamboo_ladder");
	public static final ResourceLocation BAMBOO_BEEHIVE = new ResourceLocation("woodworks", "bamboo_beehive");
	public static final ResourceLocation BAMBOO_BOOKSHELF = new ResourceLocation("woodworks", "bamboo_bookshelf");
	public static final ResourceLocation BAMBOO_CLOSET = new ResourceLocation("woodworks", "bamboo_closet");
	public static final ResourceLocation TRAPPED_BAMBOO_CLOSET = new ResourceLocation("woodworks", "trapped_bamboo_closet");

	public static final DeferredRegister<Item> CAVERNS_AND_CHASMS_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UAConstants.CAVERNS_AND_CHASMS);

	public static RegistryObject<Item> COBBLESTONE_BRICKS = CAVERNS_AND_CHASMS_ITEMS.register("cobblestone_bricks", () -> new Item(new Item.Properties()));
	public static RegistryObject<Item> COBBLESTONE_TILES = CAVERNS_AND_CHASMS_ITEMS.register("cobblestone_tiles", () -> new Item(new Item.Properties()));
}
