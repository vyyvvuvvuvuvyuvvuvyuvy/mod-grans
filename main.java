package com.example.grannyandslendrina;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpawnEgg;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
    public static final String MODID = "grannyandslendrina";
    public static final String NAME = "Granny and Slendrina Mod";
    public static final String VERSION = "1.0";

    public static Item grannySpawnEgg;
    public static Item slendrinaSpawnEgg;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        grannySpawnEgg = new ItemSpawnEgg(1, 0xFFFFFF, 0x000000).setUnlocalizedName("granny_spawn_egg");
        slendrinaSpawnEgg = new ItemSpawnEgg(2, 0x000000, 0xFF0000).setUnlocalizedName("slendrina_spawn_egg");
        
        GameRegistry.registerItem(grannySpawnEgg, "");
        GameRegistry.registerItem(, "");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        EntityRegistry.registerModEntity(GrannyEntity.class, "Granny", 1, this, 80, 3, true);
        EntityRegistry.registerModEntity(SlendrinaEntity.class, "Slendrina", 2, this, 80, 3, true);
    }

    public static class GrannyEntity extends EntityZombie {
        public GrannyEntity() {
            super(null);
        }
    }

    public static class SlendrinaEntity extends EntityEnderman {
        public SlendrinaEntity() {
            super(null);
        }
    }
}
