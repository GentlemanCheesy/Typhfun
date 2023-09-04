package net.typhonmc.typhfun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Recipe {

    public static ItemStack[] SMITHING_PRESS = {
            null, null, null,
            null, null, null,
            null, null, null
    };

    public static ItemStack[] BOW_OF_MIMICRY = {
            new ItemStack(Material.EMERALD), null,                            new ItemStack(Material.EMERALD),
            null,                            new ItemStack(Material.DIAMOND), null,
            new ItemStack(Material.EMERALD), null,                            new ItemStack(Material.EMERALD)
    };
}
