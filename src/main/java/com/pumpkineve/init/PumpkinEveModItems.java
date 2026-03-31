
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pumpkineve.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.food.FoodProperties;

import com.pumpkineve.PumpkineveMod;

public class PumpkinEveModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PumpkineveMod.MOD_ID);
	public static final RegistryObject<Item> ORCHBERB = block(PumpkinEveModBlocks.ORCHBERB);
	public static final RegistryObject<Item> CRACKED_GILD_ORCHRUS = REGISTRY.register("cracked_gild_orchrus", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(15).saturationMod(7.6f).build())));
	public static final RegistryObject<Item> GILD_ORCHRUS = REGISTRY.register("gild_orchrus", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(1f).build())));
	public static final RegistryObject<Item> ORCHRUS = REGISTRY.register("orchrus", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f).build())));
	public static final RegistryObject<Item> CRACKED_ORCHRUS = REGISTRY.register("cracked_orchrus", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(5.2f).build())));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
