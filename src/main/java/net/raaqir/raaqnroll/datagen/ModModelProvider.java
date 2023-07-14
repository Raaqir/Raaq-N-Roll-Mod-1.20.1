package net.raaqir.raaqnroll.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.raaqir.raaqnroll.block.ModBlocks;
import net.raaqir.raaqnroll.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkGarnetTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SHTAIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SHTAIN_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHTAIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SHTAIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_SHTAIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_SHTAIN_ORE);

        pinkGarnetTexturePool.stairs(ModBlocks.SHTAIN_STAIRS);
        pinkGarnetTexturePool.slab(ModBlocks.SHTAIN_SLAB);
        pinkGarnetTexturePool.button(ModBlocks.SHTAIN_BUTTON);
        pinkGarnetTexturePool.pressurePlate(ModBlocks.SHTAIN_PRESSURE_PLATE);
        pinkGarnetTexturePool.fence(ModBlocks.SHTAIN_FENCE);
        pinkGarnetTexturePool.fenceGate(ModBlocks.SHTAIN_FENCE_GATE);
        pinkGarnetTexturePool.wall(ModBlocks.SHTAIN_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.SHTAIN_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SHTAIN_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SHTAIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SHTAIN, Models.GENERATED);

        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAT_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

    }
}
