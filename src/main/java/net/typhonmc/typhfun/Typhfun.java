package net.typhonmc.typhfun;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Typhfun extends JavaPlugin implements SlimefunAddon {

    //Credit to AlchimiaVitae from [addon](https://github.com/Apeiros-46B/AlchimiaVitae)
    private static MiniMessage MINI_MESSAGE;
    private static LegacyComponentSerializer SERIALIZER;

    public static String format(String sentence) {
        return SERIALIZER.serialize( MINI_MESSAGE.deserialize(sentence) );
    }

    @Override
    public void onEnable() {
        Config settings;
        /*Get config values*/ {
            settings = new Config(this);

            //more things (later, mostly for prices)
        }

        //Create a new category with subcategories
        NestedItemGroup typhon_category = new NestedItemGroup( new NamespacedKey(this, "typhfun"), new CustomItemStack(Material.SCULK_SENSOR, "&3Typhfun", "", "&a> Click to open") );

        SubItemGroup cheesy_bites = new SubItemGroup( new NamespacedKey(this, "cheesy_bites"), typhon_category, new CustomItemStack(Material.ORANGE_DYE, "&6Chessy Bites") );
        SubItemGroup cheesy_power = new SubItemGroup( new NamespacedKey(this, "cheesy_bites"), typhon_category, new CustomItemStack(Material.ORANGE_CONCRETE, "&6Cheesy Power") );
        SubItemGroup cheesy_events = new SubItemGroup( new NamespacedKey(this, "cheesy_bites"), typhon_category, new CustomItemStack(Material.ORANGE_STAINED_GLASS, "&6Event Items ") );

        //Add items to subcategories
        /*Cheesy Bites*/ {
            new SlimefunItem(cheesy_bites, Items.SMITHING_PRESS, RecipeType.MULTIBLOCK, Recipes.SMITHING_PRESS).register(this);
            new SlimefunItem(cheesy_bites, Items.ENDER_MAILBOX, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ENDER_MAILBOX).register(this);
            new SlimefunItem(cheesy_bites, Items.ELECTURN, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ELECTURN).register(this);
            new SlimefunItem(cheesy_bites, Items.VEXAL_VEIL, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.VEXAL_VEIL, new SlimefunItemStack(Items.VEXAL_VEIL, 8) ).register(this);
            new SlimefunItem(cheesy_bites, Items.GREEN_WARP_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.GREEN_WARP_PIPE, new SlimefunItemStack(Items.GREEN_WARP_PIPE, 2) ).register(this);
            new SlimefunItem(cheesy_bites, Items.WRENCH_OF_WARPING, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.WRENCH_OF_WARPING).register(this);
            new SlimefunItem(cheesy_bites, Items.VEXAL_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.VEXAL_PIPE, new SlimefunItemStack(Items.VEXAL_PIPE, 32) ).register(this);
            new SlimefunItem(cheesy_bites, Items.DISPLAY_CASE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.DISPLAY_CASE).register(this);
            new SlimefunItem(cheesy_bites, Items.SLIME_BUCKET, RecipeType.INTERACT, Recipes.SLIME_BUCKET).register(this);

            //more
        }
        /*Cheesy Power*/ {
        }
        /*Cheesy Events*/ {
        }

    }

    @Override
    public void onDisable() {}

    @NotNull
    @Override
    public JavaPlugin getJavaPlugin() { return this; }

    @Nullable
    @Override
    public String getBugTrackerURL() { return null; }
}
