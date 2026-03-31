
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pumpkineve.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.pumpkineve.block.OrchberbBlock;
import com.pumpkineve.PumpkineveMod;

public class PumpkinEveModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PumpkineveMod.MOD_ID);
	public static final RegistryObject<Block> ORCHBERB = REGISTRY.register("orchberb", () -> new OrchberbBlock());
}
