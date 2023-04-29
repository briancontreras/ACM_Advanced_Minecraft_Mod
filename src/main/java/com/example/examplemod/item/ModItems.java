package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));

    public static final RegistryObject<Item> ACMIUM = ITEMS.register("acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));

    public static final RegistryObject<Item> RAW_ACMIUM = ITEMS.register("raw_acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));

    public static final RegistryObject<Item> MATCHA = ITEMS.register("matcha",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));

    public static final RegistryObject<Item> GLASS_CUP = ITEMS.register("glass_cup",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));
    public static final RegistryObject<Item> ICE_CUBES = ITEMS.register("ice_cubes",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));
    public static final RegistryObject<Item> MATCHA_LATTE = ITEMS.register("matcha_latte",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB).food(Foods.MATCHA_LATTE_PROP)));
    public static final RegistryObject<Item> UNROASTED_COFFEEBEANS = ITEMS.register("unroasted_coffeebeans",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));
    public static final RegistryObject<Item> ROASTED_COFFEEBEANS= ITEMS.register("roasted_coffeebeans",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB).food(Foods.CAFFEINE)));
    public static final RegistryObject<Item> COLD_BREW = ITEMS.register("cold_brew",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB).food(Foods.CAFFEINE)));
    public static final RegistryObject<Item> BOILING_WATER = ITEMS.register("boiling_water",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXAMPLE_TAB)));

    public static class Foods{
        public static final FoodProperties MATCHA_LATTE_PROP = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(.6f)
                .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,3),1).build();
        public static final FoodProperties CAFFEINE = new FoodProperties.Builder().alwaysEat().saturationMod(.6f)
                .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,3),1).build();
    }
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
