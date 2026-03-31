
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package com.pumpkineve.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

import com.pumpkineve.init.PumpkinEveModBlocks;
import com.pumpkineve.init.PumpkinEveModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PumpkinEveModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			// 检查方块和物品是否已注册，避免空指针异常
			if (PumpkinEveModBlocks.ORCHBERB.isPresent()) {
				event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PumpkinEveModBlocks.ORCHBERB.get(), 6), new ItemStack(Blocks.CARVED_PUMPKIN), new ItemStack(Items.PUMPKIN_PIE), 29, 16, 0.17f));
				event.getTrades().get(3).add(new BasicItemListing(new ItemStack(PumpkinEveModBlocks.ORCHBERB.get(), 54), new ItemStack(Blocks.CARVED_PUMPKIN, 40), new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 8, 52, 0.37f));
			}
			if (PumpkinEveModItems.CRACKED_GILD_ORCHRUS.isPresent()) {
				event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PumpkinEveModItems.CRACKED_GILD_ORCHRUS.get(), 10),

						new ItemStack(Blocks.MELON), 10, 5, 0.05f));
			}
			if (PumpkinEveModItems.GILD_ORCHRUS.isPresent()) {
				event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PumpkinEveModItems.GILD_ORCHRUS.get(), 10),

						new ItemStack(Blocks.HAY_BLOCK), 10, 5, 0.05f));
			}
		}
	}
}
