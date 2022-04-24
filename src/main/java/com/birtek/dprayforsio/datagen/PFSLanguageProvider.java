package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.DPrayForSio;
import com.birtek.dprayforsio.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.birtek.dprayforsio.setup.ModSetup.TAB_NAME;

public class PFSLanguageProvider extends LanguageProvider {

    private final String locale;

    public PFSLanguageProvider(DataGenerator generator, String locale) {
        super(generator, DPrayForSio.MODID, locale);
        this.locale = locale;
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "-DPRAYFORSIO");
        switch (locale) {
            case "en_us" -> add(Registration.BLOCK_OF_SOLID_SIO.get(), "Block of solid SIO");
            case "pl_pl" -> add(Registration.BLOCK_OF_SOLID_SIO.get(), "Blok stałego SIO");
            case "fr_fr" -> add(Registration.BLOCK_OF_SOLID_SIO.get(), "Bloc de SIO solide");
        }
    }
}
