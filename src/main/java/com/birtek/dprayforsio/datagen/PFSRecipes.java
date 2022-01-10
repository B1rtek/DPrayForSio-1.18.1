package com.birtek.dprayforsio.datagen;

import com.birtek.dprayforsio.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class PFSRecipes extends RecipeProvider {
    public PFSRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Registration.BLOCK_OF_SOLID_SIO.get()).pattern("IRI").pattern("GIG").pattern("DGE")
                .define('I', Tags.Items.INGOTS_IRON).define('R', Tags.Items.DUSTS_REDSTONE)
                .define('G', Tags.Items.INGOTS_GOLD).define('D', Tags.Items.GEMS_DIAMOND)
                .define('E', Tags.Items.GEMS_EMERALD).group("dprayforsio")
                .unlockedBy("has_flex", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.ANY)).save(consumer);
    }
}
