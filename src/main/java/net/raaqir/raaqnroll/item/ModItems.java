package net.raaqir.raaqnroll.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raaqir.raaqnroll.RaaqNRollMod;
import net.raaqir.raaqnroll.block.ModBlocks;
import net.raaqir.raaqnroll.item.custom.MetalDetectorItem;
import net.raaqir.raaqnroll.item.custom.ModArmorItem;
import net.raaqir.raaqnroll.item.custom.ModPowerSwordItem;
import net.raaqir.raaqnroll.item.custom.PaxelItem;

public class ModItems {

    ///      ORES
    public static final Item SHTAIN = registerItem("shtain",
            new Item(new FabricItemSettings()));
    public static final Item RAW_SHTAIN = registerItem("raw_shtain",
            new Item(new FabricItemSettings()));

    public static final Item RAAQ = registerItem("raaq",
            new Item(new FabricItemSettings()));


    ///      TOOLS


    public static final Item SHTAIN_SWORD = registerItem("shtain_sword",
            new ModPowerSwordItem(ModToolMaterial.SHTAIN, 2, 2f, new FabricItemSettings()));
    public static final Item SHTAIN_PICKAXE = registerItem("shtain_pickaxe",
            new PickaxeItem(ModToolMaterial.SHTAIN, 1, 1f, new FabricItemSettings()));
    public static final Item SHTAIN_SHOVEL = registerItem("shtain_shovel",
            new ShovelItem(ModToolMaterial.SHTAIN, 0, 0f, new FabricItemSettings()));
    public static final Item SHTAIN_AXE = registerItem("shtain_axe",
            new AxeItem(ModToolMaterial.SHTAIN, 6, -2f, new FabricItemSettings()));
    public static final Item SHTAIN_HOE = registerItem("shtain_hoe",
            new HoeItem(ModToolMaterial.SHTAIN, 0, 0f, new FabricItemSettings()));

    public static final Item SHTAIN_PAXEL = registerItem("shtain_paxel",
            new PaxelItem(ModToolMaterial.SHTAIN, 0, 0f, new FabricItemSettings()));

    ///      ARMOR

    public static final Item SHTAIN_HELMET = registerItem("shtain_helmet",
            new ModArmorItem(ModArmorMaterials.SHTAIN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SHTAIN_CHESTPLATE = registerItem("shtain_chestplate",
            new ModArmorItem(ModArmorMaterials.SHTAIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SHTAIN_LEGGINGS = registerItem("shtain_leggings",
            new ModArmorItem(ModArmorMaterials.SHTAIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SHTAIN_BOOTS = registerItem("shtain_boots",
            new ModArmorItem(ModArmorMaterials.SHTAIN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item SHTAIN_HORSE_ARMOR = registerItem("shtain_horse_armor",
            new HorseArmorItem(14, "shtain", new FabricItemSettings()));

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
