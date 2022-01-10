package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.DPrayForSio;
import com.birtek.dprayforsio.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.birtek.dprayforsio.setup.ModSetup.TAB_NAME;

public class PFSLanguageProvider extends LanguageProvider {

    public PFSLanguageProvider(DataGenerator generator, String locale) {
        super(generator, DPrayForSio.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup."+TAB_NAME, "-DPRAYFORSIO");
        add(Registration.BLOCK_OF_SOLID_SIO.get(), "Block of solid SIO");
    }
}
