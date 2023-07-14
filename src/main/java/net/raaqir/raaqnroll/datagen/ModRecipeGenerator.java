package net.raaqir.raaqnroll.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.raaqir.raaqnroll.block.ModBlocks;
import net.raaqir.raaqnroll.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_SHTAIN)
                .pattern("SSS")
                .pattern("SPS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('P', ModItems.SHTAIN)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.SHTAIN), conditionsFromItem(ModItems.SHTAIN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_SHTAIN) + "_"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SHTAIN, RecipeCategory.MISC, ModBlocks.SHTAIN_BLOCK);

        offerSmelting(exporter, List.of(ModItems.RAW_SHTAIN, ModBlocks.SHTAIN_ORE, ModBlocks.DEEPSLATE_SHTAIN_ORE,
                        ModBlocks.NETHER_SHTAIN_ORE, ModBlocks.END_STONE_SHTAIN_ORE), RecipeCategory.MISC, ModItems.SHTAIN,
                0.25f, 200, "pink_garnet");
        offerBlasting(exporter, List.of(ModItems.RAW_SHTAIN, ModBlocks.SHTAIN_ORE, ModBlocks.DEEPSLATE_SHTAIN_ORE,
                        ModBlocks.NETHER_SHTAIN_ORE, ModBlocks.END_STONE_SHTAIN_ORE), RecipeCategory.MISC, ModItems.SHTAIN,
                0.25f, 200, "pink_garnet");
    }
}
