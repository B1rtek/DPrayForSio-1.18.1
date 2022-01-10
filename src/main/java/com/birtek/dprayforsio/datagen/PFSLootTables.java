package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.setup.Registration;
import net.minecraft.data.DataGenerator;

public class PFSLootTables extends BaseLootTableProvider {

    public PFSLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.BLOCK_OF_SOLID_SIO.get(), createSilkTouchTable("block_of_solid_sio", Registration.BLOCK_OF_SOLID_SIO.get(), Registration.BLOCK_OF_SOLID_SIO_ITEM.get(), 1, 1));
    }
}
