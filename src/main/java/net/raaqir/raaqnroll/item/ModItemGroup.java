package net.raaqir.raaqnroll.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raaqir.raaqnroll.RaaqNRollMod;
import net.raaqir.raaqnroll.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup SHTAIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RaaqNRollMod.MOD_ID, "shtain_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.shtain_group"))
                    .icon(() -> new ItemStack(ModItems.SHTAIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SHTAIN);
                        entries.add(ModItems.RAW_SHTAIN);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.PEAT_BRICK);

                        entries.add(ModBlocks.SHTAIN_BLOCK);
                        entries.add(ModBlocks.RAW_SHTAIN_BLOCK);

                        entries.add(ModBlocks.SHTAIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SHTAIN_ORE);
                        entries.add(ModBlocks.END_STONE_SHTAIN_ORE);
                        entries.add(ModBlocks.NETHER_SHTAIN_ORE);

                        entries.add(ModBlocks.SHTAIN_STAIRS);
                        entries.add(ModBlocks.SHTAIN_SLAB);

                        entries.add(ModBlocks.SHTAIN_BUTTON);
                        entries.add(ModBlocks.SHTAIN_PRESSURE_PLATE);
                        entries.add(ModBlocks.SHTAIN_FENCE);
                        entries.add(ModBlocks.SHTAIN_FENCE_GATE);
                        entries.add(ModBlocks.SHTAIN_WALL);
                        entries.add(ModBlocks.SHTAIN_DOOR);
                        entries.add(ModBlocks.SHTAIN_TRAPDOOR);

                    }).build());

    public static void registerItemGroups() {

    }
}
