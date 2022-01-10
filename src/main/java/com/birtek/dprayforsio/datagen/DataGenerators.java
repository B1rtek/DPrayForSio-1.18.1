package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.DPrayForSio;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = DPrayForSio.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new PFSRecipes(generator));
            generator.addProvider(new PFSLootTables(generator));
            PFSBlockTags blockTags = new PFSBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new PFSItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new PFSBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new PFSItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new PFSLanguageProvider(generator, "en_us"));
        }
    }
}