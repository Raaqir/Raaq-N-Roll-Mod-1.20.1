package net.raaqir.raaqnroll.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raaqir.raaqnroll.RaaqNRollMod;
import net.raaqir.raaqnroll.block.ModBlocks;
import net.raaqir.raaqnroll.item.custom.MetalDetectorItem;

public class ModItems {

    ///      ORES
    public static final Item SHTAIN = registerItem("shtain",
            new Item(new FabricItemSettings()));
    public static final Item RAW_SHTAIN = registerItem("raw_shtain",
            new Item(new FabricItemSettings()));

    public static final Item RAAQ = registerItem("raaq",
            new Item(new FabricItemSettings()));

    ///      MISC ITEMS
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(256)));

    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new Item(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));

    public static final Item PEAT_BRICK = registerItem("peat_brick",
            new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RaaqNRollMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(SHTAIN);
        entries.add(RAW_SHTAIN);
        entries.add(RAAQ);

        entries.add(ModBlocks.SHTAIN_BLOCK);
        entries.add(ModBlocks.RAW_SHTAIN_BLOCK);
        entries.add(ModBlocks.RAAQ_BLOCK);
    }

    public static void registerModItems() {
        RaaqNRollMod.LOGGER.info("Registering Mod Items for " + RaaqNRollMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
