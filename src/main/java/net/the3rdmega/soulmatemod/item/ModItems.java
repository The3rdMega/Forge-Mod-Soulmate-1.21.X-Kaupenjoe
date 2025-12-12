package net.the3rdmega.soulmatemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.the3rdmega.soulmatemod.SoulmateMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SoulmateMod.MOD_ID);

    public static final RegistryObject<Item> GIGNOMETHYST = ITEMS.register("gignomethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GIGNOMETHYST = ITEMS.register("raw_gignomethyst",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
