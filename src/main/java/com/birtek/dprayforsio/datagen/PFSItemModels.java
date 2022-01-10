package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.DPrayForSio;
import com.birtek.dprayforsio.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PFSItemModels extends ItemModelProvider {

    public PFSItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DPrayForSio.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.BLOCK_OF_SOLID_SIO.get().getRegistryName().getPath(), modLoc("block/block_of_solid_sio"));
    }
}
