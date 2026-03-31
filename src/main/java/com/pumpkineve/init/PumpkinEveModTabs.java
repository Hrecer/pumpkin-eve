
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pumpkineve.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.pumpkineve.PumpkineveMod;
import com.pumpkineve.init.PumpkinEveModBlocks;
import com.pumpkineve.init.PumpkinEveModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PumpkinEveModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PumpkineveMod.MOD_ID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PumpkinEveModBlocks.ORCHBERB.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(PumpkinEveModItems.CRACKED_GILD_ORCHRUS.get());
			tabData.accept(PumpkinEveModItems.GILD_ORCHRUS.get());
			tabData.accept(PumpkinEveModItems.ORCHRUS.get());
			tabData.accept(PumpkinEveModItems.CRACKED_ORCHRUS.get());
		}
	}
}
