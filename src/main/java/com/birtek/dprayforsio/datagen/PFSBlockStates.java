package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.DPrayForSio;
import com.birtek.dprayforsio.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PFSBlockStates extends BlockStateProvider {

    public PFSBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, DPrayForSio.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.BLOCK_OF_SOLID_SIO.get());
    }
}
