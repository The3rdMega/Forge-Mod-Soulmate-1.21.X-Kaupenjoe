package net.the3rdmega.soulmatemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.the3rdmega.soulmatemod.SoulmateMod;
import net.the3rdmega.soulmatemod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoulmateMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GIGNOMETHYST_ITEMS_TAB = CREATIVE_MODE_TABS.register("gignomethyst_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GIGNOMETHYST.get()))
                    .title(Component.translatable("creativetab.soulmatemod.gignomethyst_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GIGNOMETHYST.get());
                        output.accept(ModItems.RAW_GIGNOMETHYST.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> GIGNOMETHYST_BLOCKS_TAB = CREATIVE_MODE_TABS.register("gignomethyst_blocks_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GIGNOMETHYST_BLOCK.get()))
                    .withTabsBefore(GIGNOMETHYST_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.soulmatemod.gignomethyst_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GIGNOMETHYST_BLOCK.get());
                        output.accept(ModBlocks.RAW_GIGNOMETHYST_BLOCK.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
