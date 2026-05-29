package net.xuantran.tutorialmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xuantran.tutorialmod.TutorialMod;
import net.xuantran.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
    DeferredRegister.create(ForgeRegistries.CREATIVE_MODE_TABS, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab", 
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOONSHACKLE.get()))
    .title(Component.translatable("creativemodetab.tutorial_tab"))
    .displayItems(pParameter, pOutput) -> {
        pOutput.accept(ModItems.MOONSHACKLE.get());
        pOutput.accept(ModBlocks.MOON_BLOCK.get().asItem());
    })
    .build();


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
