package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.DPrayForSio;
import com.birtek.dprayforsio.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PFSBlockTags extends BlockTagsProvider {

    public PFSBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, DPrayForSio.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.BEACON_BASE_BLOCKS).add(Registration.BLOCK_OF_SOLID_SIO.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(Registration.BLOCK_OF_SOLID_SIO.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(Registration.BLOCK_OF_SOLID_SIO.get());
        tag(BlockTags.CRYSTAL_SOUND_BLOCKS).add(Registration.BLOCK_OF_SOLID_SIO.get());
        tag(BlockTags.PIGLIN_REPELLENTS).add(Registration.BLOCK_OF_SOLID_SIO.get());
    }

    @Override
    public String getName() {
        return "-DPRAYFORSIO Tags";
    }
}
