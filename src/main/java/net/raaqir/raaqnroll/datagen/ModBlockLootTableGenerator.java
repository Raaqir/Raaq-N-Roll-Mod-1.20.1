package net.raaqir.raaqnroll.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.raaqir.raaqnroll.block.ModBlocks;
import net.raaqir.raaqnroll.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SHTAIN_BLOCK);
        addDrop(ModBlocks.RAAQ_BLOCK);
        addDrop(ModBlocks.RAW_SHTAIN_BLOCK);

        addDrop(ModBlocks.SHTAIN_ORE, oreDrops(ModBlocks.SHTAIN_ORE, ModItems.RAW_SHTAIN));
        addDrop(ModBlocks.DEEPSLATE_SHTAIN_ORE, oreDrops(ModBlocks.DEEPSLATE_SHTAIN_ORE, ModItems.RAW_SHTAIN));
        addDrop(ModBlocks.END_STONE_SHTAIN_ORE, oreDrops(ModBlocks.END_STONE_SHTAIN_ORE, ModItems.RAW_SHTAIN));
        addDrop(ModBlocks.NETHER_SHTAIN_ORE, oreDrops(ModBlocks.NETHER_SHTAIN_ORE, ModItems.RAW_SHTAIN));
        addDrop(ModBlocks.RAAQ_ORE, oreDrops(ModBlocks.RAAQ_ORE, ModItems.RAAQ));
        addDrop(ModBlocks.DEEPSLATE_RAAQ_ORE, oreDrops(ModBlocks.DEEPSLATE_RAAQ_ORE, ModItems.RAAQ));
        addDrop(ModBlocks.END_STONE_RAAQ_ORE, oreDrops(ModBlocks.END_STONE_RAAQ_ORE, ModItems.RAAQ));
        addDrop(ModBlocks.NETHER_RAAQ_ORE, oreDrops(ModBlocks.NETHER_RAAQ_ORE, ModItems.RAAQ));

        addDrop(ModBlocks.SHTAIN_STAIRS);
        addDrop(ModBlocks.SHTAIN_SLAB, slabDrops(ModBlocks.SHTAIN_SLAB));
        addDrop(ModBlocks.SHTAIN_BUTTON);
        addDrop(ModBlocks.SHTAIN_PRESSURE_PLATE);
        addDrop(ModBlocks.SHTAIN_FENCE);
        addDrop(ModBlocks.SHTAIN_FENCE_GATE);
        addDrop(ModBlocks.SHTAIN_WALL);
        addDrop(ModBlocks.SHTAIN_TRAPDOOR);
        addDrop(ModBlocks.SHTAIN_DOOR, doorDrops(ModBlocks.SHTAIN_DOOR));
        addDrop(ModBlocks.RAAQ_STAIRS);
        addDrop(ModBlocks.RAAQ_SLAB, slabDrops(ModBlocks.RAAQ_SLAB));
        addDrop(ModBlocks.RAAQ_BUTTON);
        addDrop(ModBlocks.RAAQ_PRESSURE_PLATE);
        addDrop(ModBlocks.RAAQ_FENCE);
        addDrop(ModBlocks.RAAQ_FENCE_GATE);
        addDrop(ModBlocks.RAAQ_WALL);
        addDrop(ModBlocks.RAAQ_TRAPDOOR);
        addDrop(ModBlocks.RAAQ_DOOR, doorDrops(ModBlocks.RAAQ_DOOR));

    }
}
