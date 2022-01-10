package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.DPrayForSio;
import com.birtek.dprayforsio.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PFSItemTags extends ItemTagsProvider {
    public PFSItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, DPrayForSio.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.STORAGE_BLOCKS_EMERALD).add(Registration.BLOCK_OF_SOLID_SIO_ITEM.get());
    }

    @Override
    public String getName() {
        return "-DPRAYFORSIO Tags";
    }
}
