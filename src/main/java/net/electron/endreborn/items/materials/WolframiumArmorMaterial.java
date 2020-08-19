package net.electron.endreborn.items.materials;

import net.electron.endreborn.items.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import java.lang.Override;
import net.minecraft.sound.SoundEvents;

public class WolframiumArmorMaterial implements ArmorMaterial
{
    private static final int[] BASE_DURABILITY = new int[]{200, 250, 250, 220};
    private static final int[] PROTECTION_AMOUNTS = new int[]{2, 6, 5, 2};

    @Override
    public int getDurability(EquipmentSlot equipmentSlot)
    {
        return BASE_DURABILITY[equipmentSlot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot)
    {
        return PROTECTION_AMOUNTS[equipmentSlot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability()
    {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModItems.WOLF_INGOT);
    }

    @Override
    public String getName()
    {
        return "tungsten";
    }

    @Override
    public float getToughness()
    {
        return 2;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5f;
    }
}