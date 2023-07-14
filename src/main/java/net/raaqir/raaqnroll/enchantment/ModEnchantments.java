package net.raaqir.raaqnroll.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raaqir.raaqnroll.RaaqNRollMod;

public class ModEnchantments {
    public static final Enchantment LIGHTNING_STRIKER = register("lightning_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(RaaqNRollMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        RaaqNRollMod.LOGGER.info("Registering ModEnchantments for " + RaaqNRollMod.MOD_ID);
    }
}