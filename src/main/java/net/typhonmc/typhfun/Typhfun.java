package net.typhonmc.typhfun;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Typhfun extends JavaPlugin implements SlimefunAddon {

    //Create custom Recipe Types
    //private final RecipeType RECIPETYPE_DRINK_MIXER = ?
    //private final RecipeType RECIPETYPE_SMITHING_PRESS = ?
    //private final RecipeType CUSTOM_MOB_DROP = ?

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
            new SlimefunItem(cheesy_bites, Items.GREEN_VEXAL_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.GREEN_VEXAL_PIPE, new SlimefunItemStack(Items.GREEN_VEXAL_PIPE, 32) ).register(this);
            new SlimefunItem(cheesy_bites, Items.DISPLAY_CASE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.DISPLAY_CASE).register(this);
            new SlimefunItem(cheesy_bites, Items.SLIME_BUCKET, RecipeType.NULL, Recipes.SLIME_BUCKET).register(this); //RecipeType.INTERACT has Maven-related bug

            new SlimefunItem(cheesy_bites, Items.BOW_OF_MIMICRY, RecipeType.MAGIC_WORKBENCH, Recipes.BOW_OF_MIMICRY).register(this);
            new SlimefunItem(cheesy_bites, Items.WOODEN_FLUID_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.WOODEN_FLUID_TANK).register(this);
            new SlimefunItem(cheesy_bites, Items.STONE_FLUID_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.STONE_FLUID_TANK).register(this);
            new SlimefunItem(cheesy_bites, Items.BLACKSTONE_FLUID_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.BLACKSTONE_FLUID_TANK).register(this);
            new SlimefunItem(cheesy_bites, Items.OBSIDIAN_FLUID_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.OBSIDIAN_FLUID_TANK).register(this);
            new SlimefunItem(cheesy_bites, Items.FROSTY_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.FROSTY_TANK).register(this);
            new SlimefunItem(cheesy_bites, Items.FISH_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.FISH_TANK).register(this);
            new SlimefunItem(cheesy_bites, Items.AXOLOTL_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.AXOLOTL_TANK).register(this);
            new SlimefunItem(cheesy_bites, Items.SPONGE_STAFF, RecipeType.MOB_DROP, Recipes.SPONGE_STAFF).register(this);

            new SlimefunItem(cheesy_bites, Items.INFUSED_FLUTE, RecipeType.MOB_DROP, Recipes.INFUSED_FLUTE).register(this);
            new SlimefunItem(cheesy_bites, Items.SLUDGE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SLUDGE, new SlimefunItemStack(Items.SLUDGE, 2) ).register(this);
            new SlimefunItem(cheesy_bites, Items.POISON_SHOT, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.POISON_SHOT).register(this);
            new SlimefunItem(cheesy_bites, Items.SQUID_SHOT, RecipeType.MOB_DROP, Recipes.SQUID_SHOT).register(this);
            new SlimefunItem(cheesy_bites, Items.INK_PHAIL, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.INK_PHAIL, new SlimefunItemStack(Items.INK_PHAIL, 3) ).register(this);
            new SlimefunItem(cheesy_bites, Items.DRINK_MIXER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.DRINK_MIXER).register(this);
            new SlimefunItem(cheesy_bites, Items.SPIKED_MILK, RecipeType.NULL, Recipes.SPIKED_MILK).register(this); // <--- RecipeType.DRINK_MIXER
            new SlimefunItem(cheesy_bites, Items.SPIKED_HONEY, RecipeType.NULL, Recipes.SPIKED_HONEY).register(this); // <--- RecipeType.DRINK_MIXER
            new SlimefunItem(cheesy_bites, Items.PRISTINE_PRISMARINE_SHARD, RecipeType.MOB_DROP, Recipes.PRISTINE_PRISMARINE_SHARD).register(this);

            new SlimefunItem(cheesy_bites, Items.PRISTINE_PRISM, RecipeType.MAGIC_WORKBENCH, Recipes.PRISTINE_PRISM).register(this);
            new SlimefunItem(cheesy_bites, Items.PRISM_PICKAXE, RecipeType.MAGIC_WORKBENCH, Recipes.PRISM_PICKAXE).register(this);
            new SlimefunItem(cheesy_bites, Items.PRISM_SHOVEL, RecipeType.MAGIC_WORKBENCH, Recipes.PRISM_SHOVEL).register(this);
            new SlimefunItem(cheesy_bites, Items.MIRROR_BLADE, RecipeType.MAGIC_WORKBENCH, Recipes.MIRROR_BLADE).register(this);
            new SlimefunItem(cheesy_bites, Items.HURRICANE_BLASTER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.HURRICANE_BLASTER).register(this);
            new SlimefunItem(cheesy_bites, Items.PAINTERS_POLISH, RecipeType.NULL, Recipes.PAINTERS_POLISH).register(this); // <--- RecipeType.SMITHING_PRESS
            new SlimefunItem(cheesy_bites, Items.PAINTERS_BRICKS, RecipeType.NULL, Recipes.PAINTERS_BRICKS).register(this); // <--- RecipeType.SMITHING_PRESS
            new SlimefunItem(cheesy_bites, Items.SENSOR_COMPONENT_ONE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SENSOR_COMPONENT_ONE).register(this);
            new SlimefunItem(cheesy_bites, Items.SENSOR_COMPONENT_TWO, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SENSOR_COMPONENT_TWO).register(this);

            new SlimefunItem(cheesy_bites, Items.MOB_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.MOB_SENSOR).register(this);
            new SlimefunItem(cheesy_bites, Items.PLAYER_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.PLAYER_SENSOR).register(this);
            new SlimefunItem(cheesy_bites, Items.ITEM_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ITEM_SENSOR).register(this);
            new SlimefunItem(cheesy_bites, Items.ADVANCED_PLAYER_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ADVANCED_PLAYER_SENSOR).register(this);
            new SlimefunItem(cheesy_bites, Items.ADVANCED_ITEM_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ADVANCED_ITEM_SENSOR).register(this);
            new SlimefunItem(cheesy_bites, Items.HOSTILITY_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.HOSTILITY_SENSOR).register(this);
            new SlimefunItem(cheesy_bites, Items.LASAGNA, RecipeType.NULL, Recipes.LASAGNA).register(this); //<--- RecipeType.CUSTOM_MOB_DROP
            new SlimefunItem(cheesy_bites, Items.IMPASTA, RecipeType.NULL, Recipes.IMPASTA, new SlimefunItemStack(Items.IMPASTA, 6) ).register(this); //<--- RecipeType.CUSTOM_MOB_DROP
            new SlimefunItem(cheesy_bites, Items.LINGUINE_LANCE, RecipeType.NULL, Recipes.LINGUINE_LANCE).register(this); //<--- RecipeType.CUSTOM_MOB_DROP

            new SlimefunItem(cheesy_bites, Items.PASTA_POWER, RecipeType.NULL, Recipes.PASTA_POWER).register(this); //<--- RecipeType.CUSTOM_MOB_DROP
            new SlimefunItem(cheesy_bites, Items.PASTAXE, RecipeType.NULL, Recipes.PASTAXE).register(this); //<--- RecipeType.CUSTOM_MOB_DROP
            new SlimefunItem(cheesy_bites, Items.SAUCE_SPADE, RecipeType.NULL, Recipes.SAUCE_SPADE).register(this); //<--- RecipeType.CUSTOM_MOB_DROP
            new SlimefunItem(cheesy_bites, Items.INFINIBURNER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.INFINIBURNER).register(this);
            new SlimefunItem(cheesy_bites, Items.PRISMATIC_DRAGON_WINGS, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.PRISMATIC_DRAGON_WINGS).register(this);
            new SlimefunItem(cheesy_bites, Items.WHITE_WARP_PIPE, RecipeType.MAGIC_WORKBENCH, Recipes.WHITE_WARP_PIPE).register(this);
            new SlimefunItem(cheesy_bites, Items.RED_WARP_PIPE, RecipeType.MAGIC_WORKBENCH, Recipes.RED_WARP_PIPE).register(this);
            new SlimefunItem(cheesy_bites, Items.CYAN_WARP_PIPE, RecipeType.MAGIC_WORKBENCH, Recipes.CYAN_WARP_PIPE).register(this);
            new SlimefunItem(cheesy_bites, Items.WHITE_VEXAL_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.WHITE_VEXAL_PIPE).register(this);

            //more
            //new SlimefunItem(cheesy_bites, Items., RecipeType., Recipes.).register(this);

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
