package net.xuantran.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.xuantran.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs {

    public static void register(IEventBus eventBus) {
        eventBus.addListener(ModCreativeModTabs::addCreative);
    }

    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.MOONSHACKLE);
            event.accept(ModBlocks.MOON_BLOCK);
        }
    }
}