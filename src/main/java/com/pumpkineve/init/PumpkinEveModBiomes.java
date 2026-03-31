package com.pumpkineve.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.entity.MobCategory;

import com.pumpkineve.PumpkineveMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PumpkinEveModBiomes {
    public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, PumpkineveMod.MOD_ID);
    
    // Eveland群系的ResourceKey
    public static final ResourceKey<Biome> EVELAND_KEY = ResourceKey.create(Registries.BIOME, 
        new ResourceLocation(PumpkineveMod.MOD_ID, "eveland"));
    
    // 注册自定义生物群系
    public static final RegistryObject<Biome> EVELAND = REGISTRY.register("eveland", 
        () -> {
            // 创建生物生成设置
            MobSpawnSettings.Builder mobSpawnBuilder = new MobSpawnSettings.Builder();
            
            // 添加怪物生成
            mobSpawnBuilder.addSpawn(MobCategory.MONSTER, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.SPIDER, 100, 4, 4));
            mobSpawnBuilder.addSpawn(MobCategory.MONSTER, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.ZOMBIE, 95, 4, 4));
            mobSpawnBuilder.addSpawn(MobCategory.MONSTER, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.SKELETON, 100, 4, 4));
            mobSpawnBuilder.addSpawn(MobCategory.MONSTER, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.CREEPER, 100, 4, 4));
            mobSpawnBuilder.addSpawn(MobCategory.MONSTER, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.ENDERMAN, 10, 1, 4));
            mobSpawnBuilder.addSpawn(MobCategory.MONSTER, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.WITCH, 5, 1, 1));
            
            // 添加动物生成
            mobSpawnBuilder.addSpawn(MobCategory.CREATURE, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.SHEEP, 12, 4, 4));
            mobSpawnBuilder.addSpawn(MobCategory.CREATURE, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.PIG, 10, 4, 4));
            mobSpawnBuilder.addSpawn(MobCategory.CREATURE, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.CHICKEN, 10, 4, 4));
            mobSpawnBuilder.addSpawn(MobCategory.CREATURE, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.COW, 8, 4, 4));
            mobSpawnBuilder.addSpawn(MobCategory.CREATURE, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.FOX, 36, 12, 34));
            mobSpawnBuilder.addSpawn(MobCategory.CREATURE, 
                new MobSpawnSettings.SpawnerData(net.minecraft.world.entity.EntityType.CAT, 17, 4, 4));
            
            MobSpawnSettings mobSpawnSettings = mobSpawnBuilder.build();
            
            // 生成设置由 eveland.json 完整定义
            BiomeGenerationSettings generationSettings = BiomeGenerationSettings.EMPTY;
            
            // 创建特殊效果
            BiomeSpecialEffects specialEffects = new BiomeSpecialEffects.Builder()
                .fogColor(12638463)
                .skyColor(7972607)
                .waterColor(16777087)
                .waterFogColor(16777097)
                .grassColorOverride(16741116)
                .foliageColorOverride(16737814)
                .build();
            
            // 构建生物群系
            return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.7f)
                .downfall(0.5f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(specialEffects)
                .mobSpawnSettings(mobSpawnSettings)
                .generationSettings(generationSettings)
                .build();
        }
    );
}
