package blockmeska.mod.datagen;

import blockmeska.mod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.COPPER_RAIL, 16)
                .pattern("X X")
                .pattern("XIX")
                .pattern("X X")
                .input('X', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COPPER_RAIL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.POWERED_COPPER_RAIL, 8)
                .pattern("X X")
                .pattern("XIX")
                .pattern("XRX")
                .input('X', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.POWERED_COPPER_RAIL)));
    }
}
