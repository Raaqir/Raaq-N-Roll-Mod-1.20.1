package net.raaqir.raaqnroll.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.raaqir.raaqnroll.block.ModBlocks;
import net.raaqir.raaqnroll.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ShtainTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SHTAIN_BLOCK);
        BlockStateModelGenerator.BlockTexturePool RaaqTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAAQ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SHTAIN_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHTAIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SHTAIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_SHTAIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_SHTAIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAAQ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RAAQ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RAAQ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RAAQ_ORE);

        ShtainTexturePool.stairs(ModBlocks.SHTAIN_STAIRS);
        ShtainTexturePool.slab(ModBlocks.SHTAIN_SLAB);
        ShtainTexturePool.button(ModBlocks.SHTAIN_BUTTON);
        ShtainTexturePool.pressurePlate(ModBlocks.SHTAIN_PRESSURE_PLATE);
        ShtainTexturePool.fence(ModBlocks.SHTAIN_FENCE);
        ShtainTexturePool.fenceGate(ModBlocks.SHTAIN_FENCE_GATE);
        ShtainTexturePool.wall(ModBlocks.SHTAIN_WALL);
        RaaqTexturePool.stairs(ModBlocks.RAAQ_STAIRS);
        RaaqTexturePool.slab(ModBlocks.RAAQ_SLAB);
        RaaqTexturePool.button(ModBlocks.RAAQ_BUTTON);
        RaaqTexturePool.pressurePlate(ModBlocks.RAAQ_PRESSURE_PLATE);
        RaaqTexturePool.fence(ModBlocks.RAAQ_FENCE);
        RaaqTexturePool.fenceGate(ModBlocks.RAAQ_FENCE_GATE);
        RaaqTexturePool.wall(ModBlocks.RAAQ_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.SHTAIN_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SHTAIN_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.RAAQ_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RAAQ_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SHTAIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAAQ, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SHTAIN, Models.GENERATED);

        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAT_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.SHTAIN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHTAIN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHTAIN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHTAIN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHTAIN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHTAIN_PAXEL, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHTAIN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHTAIN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHTAIN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHTAIN_BOOTS));

        itemModelGenerator.register(ModItems.SHTAIN_HORSE_ARMOR, Models.GENERATED);


    }
}
