package com.pumpkineve.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.ParameterUtils;

import com.pumpkineve.PumpkineveMod;
import com.pumpkineve.init.PumpkinEveModBiomes;

import java.util.function.Consumer;

public class EvelandRegion extends Region {
    
    public static final ResourceLocation LOCATION = ResourceLocation.fromNamespaceAndPath(PumpkineveMod.MOD_ID, "eveland_region");
    
    public EvelandRegion() {
        super(LOCATION, RegionType.OVERWORLD, 1); // 权重为1，使群系更加稀有
    }
    
    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        // 使用极其稀有的气候参数组合 - 只有在极其罕见的条件下才生成
        // 使用最极端的参数值来最大程度降低生成概率
        // 使用 FAR_INLAND 确保只在最深处陆地生成
        // 使用 VALLEY 地形 + FULL_RANGE 偏移来创建稀有生成条件
        addBiome(mapper, ParameterUtils.Temperature.HOT, 
                 ParameterUtils.Humidity.HUMID, 
                 ParameterUtils.Continentalness.FAR_INLAND, 
                 ParameterUtils.Erosion.EROSION_6, 
                 ParameterUtils.Weirdness.VALLEY, 
                 ParameterUtils.Depth.SURFACE, 
                 0L, 
                 PumpkinEveModBiomes.EVELAND_KEY);
    }
    
    public static void register() {
        Regions.register(new EvelandRegion());
        PumpkineveMod.LOGGER.info("Registered Eveland region with TerraBlender");
    }
}
