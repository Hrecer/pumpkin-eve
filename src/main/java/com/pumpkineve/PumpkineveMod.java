package com.pumpkineve;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pumpkineve.init.PumpkinEveModBlocks;
import com.pumpkineve.init.PumpkinEveModItems;
import com.pumpkineve.init.PumpkinEveModTabs;
import com.pumpkineve.init.PumpkinEveModBiomes;
import com.pumpkineve.world.biome.EvelandRegion;

@Mod(PumpkineveMod.MOD_ID)
public class PumpkineveMod {
    public static final String MOD_ID = "pumpkineve";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public PumpkineveMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        // 注册方块、物品、创造模式标签和生物群系
        PumpkinEveModBlocks.REGISTRY.register(modEventBus);
        PumpkinEveModItems.REGISTRY.register(modEventBus);
        PumpkinEveModTabs.REGISTRY.register(modEventBus);
        PumpkinEveModBiomes.REGISTRY.register(modEventBus);
        
        // 注册设置事件
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);
        
        LOGGER.info("Pumpkineve mod loaded successfully!");
    }
    
    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // 注册 TerraBlender 区域
            EvelandRegion.register();
            LOGGER.info("Pumpkineve mod setup completed!");
        });
    }
    
    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Pumpkineve mod client setup completed!");
    }
}
