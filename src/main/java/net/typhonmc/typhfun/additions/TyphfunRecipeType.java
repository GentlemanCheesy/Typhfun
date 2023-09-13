package net.typhonmc.typhfun.additions;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class TyphfunRecipeType {
    public static final RecipeType DRINK_MIXING = new RecipeType(new CustomItemStack( Items.DRINK_MIXER ),"DRINK_MIXER");
    public static final RecipeType SMITHING_PRESS = new RecipeType(new CustomItemStack( Items.SMITHING_PRESS ),"SMITHING_PRESS");

    //private final RecipeType CUSTOM_MOB_DROP = ?
    //private final RecipeType OXIDIZER = ?
    //private final RecipeType STRUCTURE_LOOT = ?
    //private final RecipeType SHOP = ?
}
