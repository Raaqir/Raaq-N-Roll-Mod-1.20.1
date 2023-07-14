package net.raaqir.raaqnroll.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.raaqir.raaqnroll.block.ModBlocks;
import net.raaqir.raaqnroll.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.SHTAIN_ORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SHTAIN_ORE,
                        ModBlocks.SHTAIN_BLOCK,
                        ModBlocks.RAW_SHTAIN_BLOCK,
                        ModBlocks.DEEPSLATE_SHTAIN_ORE,
                        ModBlocks.END_STONE_SHTAIN_ORE,
                        ModBlocks.NETHER_SHTAIN_ORE,
                        ModBlocks.SHTAIN_STAIRS,
                        ModBlocks.SHTAIN_SLAB,
                        ModBlocks.SHTAIN_PRESSURE_PLATE,
                        ModBlocks.SHTAIN_FENCE,
                        ModBlocks.SHTAIN_FENCE_GATE,
                        ModBlocks.SHTAIN_WALL,
                        ModBlocks.SHTAIN_DOOR,
                        ModBlocks.SHTAIN_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_SHTAIN_ORE,
                        ModBlocks.END_STONE_SHTAIN_ORE,
                        ModBlocks.NETHER_SHTAIN_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SHTAIN_ORE,
                        ModBlocks.SHTAIN_BLOCK,
                        ModBlocks.RAW_SHTAIN_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SHTAIN_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.SHTAIN_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.SHTAIN_FENCE_GATE);

    }
}