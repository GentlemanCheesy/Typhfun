package net.typhonmc.typhfun;

import net.typhonmc.typhfun.commands.typhfun;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import static net.typhonmc.typhfun.Recipes.getCustomItem;

public final class Typhfun extends JavaPlugin implements SlimefunAddon {

    //Create custom Recipe Types
    //private final RecipeType RECIPETYPE_DRINK_MIXER = ?
    //private final RecipeType RECIPETYPE_SMITHING_PRESS = ?
    //private final RecipeType CUSTOM_MOB_DROP = ?
    //private final RecipeType OXIDIZER = ?
    //private final RecipeType STRUCTURE_LOOT = ?
    //private final RecipeType SHOP = ?

    private static List<SlimefunItem> items = new ArrayList<>();
    private static HashMap<String, SlimefunItem> mapping = new HashMap<>();

    private static Typhfun instance;
    public static FileConfiguration settings;
    public static Logger log;
    @Override
    public void onEnable() {
        instance = this;

        log = this.getLogger();
        log.info("Initializing");

        /*Set config values*/ {
            saveDefaultConfig();
            reload(false);
            log.info("Collected configurations");
        }

        /*Register command(s)*/ {
            this.getCommand("typhfun").setExecutor( new typhfun() );
            this.getCommand("typhfun").setTabCompleter( new typhfun() );

            log.info("Enabled commands");
        }

        //Create a new category with subcategories
        NestedItemGroup typhon_category = new NestedItemGroup( new NamespacedKey(this, "typhfun"), new CustomItemStack(Material.SCULK_SENSOR, "&3Typhfun", "", "&a> Click to open") );

        SubItemGroup cheesy_bites = new SubItemGroup( new NamespacedKey(this, "cheesy_bites"), typhon_category, new CustomItemStack(Material.ORANGE_DYE, "&6Chessy Bites") );
        SubItemGroup cheesy_power = new SubItemGroup( new NamespacedKey(this, "cheesy_bites"), typhon_category, new CustomItemStack(Material.ORANGE_CONCRETE, "&6Cheesy Power") );
        SubItemGroup cheesy_events = new SubItemGroup( new NamespacedKey(this, "cheesy_bites"), typhon_category, new CustomItemStack(Material.ORANGE_STAINED_GLASS, "&6Event Items ") );

        log.info("Added Typhfun itemGroup to Slimefun Guide (with sub-Groups)");

        //Add items to subcategories
        /*Cheesy Bites*/ {
            items.add( new SlimefunItem(cheesy_bites, Items.SMITHING_PRESS, RecipeType.MULTIBLOCK, Recipes.SMITHING_PRESS) );
            items.add( new SlimefunItem(cheesy_bites, Items.ENDER_MAILBOX, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ENDER_MAILBOX) );
            items.add( new SlimefunItem(cheesy_bites, Items.ELECTURN, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ELECTURN) );
            items.add( new SlimefunItem(cheesy_bites, Items.VEXAL_VEIL, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.VEXAL_VEIL, new SlimefunItemStack(Items.VEXAL_VEIL, 8) )  );
            items.add( new SlimefunItem(cheesy_bites, Items.GREEN_WARP_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.GREEN_WARP_PIPE, new SlimefunItemStack(Items.GREEN_WARP_PIPE, 2) )  );
            items.add( new SlimefunItem(cheesy_bites, Items.WRENCH_OF_WARPING, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.WRENCH_OF_WARPING) );
            items.add( new SlimefunItem(cheesy_bites, Items.GREEN_VEXAL_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.GREEN_VEXAL_PIPE, new SlimefunItemStack(Items.GREEN_VEXAL_PIPE, 32) )  );
            items.add( new SlimefunItem(cheesy_bites, Items.DISPLAY_CASE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.DISPLAY_CASE) );
            items.add( new SlimefunItem(cheesy_bites, Items.SLIME_BUCKET, RecipeType.NULL, Recipes.SLIME_BUCKET) ); //RecipeType.INTERACT has Maven-related bug

            items.add( new SlimefunItem(cheesy_bites, Items.BOW_OF_MIMICRY, RecipeType.MAGIC_WORKBENCH, Recipes.BOW_OF_MIMICRY) );
            items.add( new SlimefunItem(cheesy_bites, Items.WOODEN_FLUID_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.WOODEN_FLUID_TANK) );
            items.add( new SlimefunItem(cheesy_bites, Items.STONE_FLUID_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.STONE_FLUID_TANK) );
            items.add( new SlimefunItem(cheesy_bites, Items.BLACKSTONE_FLUID_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.BLACKSTONE_FLUID_TANK) );
            items.add( new SlimefunItem(cheesy_bites, Items.OBSIDIAN_FLUID_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.OBSIDIAN_FLUID_TANK) );
            items.add( new SlimefunItem(cheesy_bites, Items.FROSTY_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.FROSTY_TANK) );
            items.add( new SlimefunItem(cheesy_bites, Items.FISH_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.FISH_TANK) );
            items.add( new SlimefunItem(cheesy_bites, Items.AXOLOTL_TANK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.AXOLOTL_TANK) );
            items.add( new SlimefunItem(cheesy_bites, Items.SPONGE_STAFF, RecipeType.MOB_DROP, Recipes.SPONGE_STAFF) );

            items.add( new SlimefunItem(cheesy_bites, Items.INFUSED_FLUTE, RecipeType.MOB_DROP, Recipes.INFUSED_FLUTE) );
            items.add( new SlimefunItem(cheesy_bites, Items.SLUDGE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SLUDGE, new SlimefunItemStack(Items.SLUDGE, 2) )  );
            items.add( new SlimefunItem(cheesy_bites, Items.POISON_SHOT, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.POISON_SHOT) );
            items.add( new SlimefunItem(cheesy_bites, Items.SQUID_SHOT, RecipeType.MOB_DROP, Recipes.SQUID_SHOT) );
            items.add( new SlimefunItem(cheesy_bites, Items.INK_PHAIL, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.INK_PHAIL, new SlimefunItemStack(Items.INK_PHAIL, 3) )  );
            items.add( new SlimefunItem(cheesy_bites, Items.DRINK_MIXER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.DRINK_MIXER) );
            items.add( new SlimefunItem(cheesy_bites, Items.SPIKED_MILK, RecipeType.NULL, Recipes.SPIKED_MILK) ); // <--- RecipeType.DRINK_MIXER
            items.add( new SlimefunItem(cheesy_bites, Items.SPIKED_HONEY, RecipeType.NULL, Recipes.SPIKED_HONEY) ); // <--- RecipeType.DRINK_MIXER
            items.add( new SlimefunItem(cheesy_bites, Items.PRISTINE_PRISMARINE_SHARD, RecipeType.MOB_DROP, Recipes.PRISTINE_PRISMARINE_SHARD) );

            items.add( new SlimefunItem(cheesy_bites, Items.PRISMARINE_PRISM, RecipeType.MAGIC_WORKBENCH, Recipes.PRISMARINE_PRISM) );
            items.add( new SlimefunItem(cheesy_bites, Items.PRISM_PICKAXE, RecipeType.MAGIC_WORKBENCH, Recipes.PRISM_PICKAXE) );
            items.add( new SlimefunItem(cheesy_bites, Items.PRISM_SHOVEL, RecipeType.MAGIC_WORKBENCH, Recipes.PRISM_SHOVEL) );
            items.add( new SlimefunItem(cheesy_bites, Items.MIRROR_BLADE, RecipeType.MAGIC_WORKBENCH, Recipes.MIRROR_BLADE) );
            items.add( new SlimefunItem(cheesy_bites, Items.HURRICANE_BLASTER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.HURRICANE_BLASTER) );
            items.add( new SlimefunItem(cheesy_bites, Items.PAINTERS_POLISH, RecipeType.NULL, Recipes.PAINTERS_POLISH) ); // <--- RecipeType.SMITHING_PRESS
            items.add( new SlimefunItem(cheesy_bites, Items.PAINTERS_BRICKS, RecipeType.NULL, Recipes.PAINTERS_BRICKS) ); // <--- RecipeType.SMITHING_PRESS
            items.add( new SlimefunItem(cheesy_bites, Items.SENSOR_COMPONENT_ONE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SENSOR_COMPONENT_ONE) );
            items.add( new SlimefunItem(cheesy_bites, Items.SENSOR_COMPONENT_TWO, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SENSOR_COMPONENT_TWO) );

            items.add( new SlimefunItem(cheesy_bites, Items.MOB_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.MOB_SENSOR) );
            items.add( new SlimefunItem(cheesy_bites, Items.PLAYER_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.PLAYER_SENSOR) );
            items.add( new SlimefunItem(cheesy_bites, Items.ITEM_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ITEM_SENSOR) );
            items.add( new SlimefunItem(cheesy_bites, Items.ADVANCED_PLAYER_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ADVANCED_PLAYER_SENSOR) );
            items.add( new SlimefunItem(cheesy_bites, Items.ADVANCED_ITEM_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ADVANCED_ITEM_SENSOR) );
            items.add( new SlimefunItem(cheesy_bites, Items.HOSTILITY_SENSOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.HOSTILITY_SENSOR) );
            items.add( new SlimefunItem(cheesy_bites, Items.LASAGNA, RecipeType.NULL, Recipes.LASAGNA) ); //<--- RecipeType.CUSTOM_MOB_DROP
            items.add( new SlimefunItem(cheesy_bites, Items.IMPASTA, RecipeType.NULL, Recipes.IMPASTA, new SlimefunItemStack(Items.IMPASTA, 6) )  ); //<--- RecipeType.CUSTOM_MOB_DROP
            items.add( new SlimefunItem(cheesy_bites, Items.LINGUINE_LANCE, RecipeType.NULL, Recipes.LINGUINE_LANCE) ); //<--- RecipeType.CUSTOM_MOB_DROP

            items.add( new SlimefunItem(cheesy_bites, Items.PASTA_POWER, RecipeType.NULL, Recipes.PASTA_POWER) ); //<--- RecipeType.CUSTOM_MOB_DROP
            items.add( new SlimefunItem(cheesy_bites, Items.PASTAXE, RecipeType.NULL, Recipes.PASTAXE) ); //<--- RecipeType.CUSTOM_MOB_DROP
            items.add( new SlimefunItem(cheesy_bites, Items.SAUCE_SPADE, RecipeType.NULL, Recipes.SAUCE_SPADE) ); //<--- RecipeType.CUSTOM_MOB_DROP
            items.add( new SlimefunItem(cheesy_bites, Items.INFINIBURNER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.INFINIBURNER) );
            items.add( new SlimefunItem(cheesy_bites, Items.PRISMATIC_DRAGON_WINGS, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.PRISMATIC_DRAGON_WINGS) );
            items.add( new SlimefunItem(cheesy_bites, Items.WHITE_WARP_PIPE, RecipeType.MAGIC_WORKBENCH, Recipes.WHITE_WARP_PIPE) );
            items.add( new SlimefunItem(cheesy_bites, Items.RED_WARP_PIPE, RecipeType.MAGIC_WORKBENCH, Recipes.RED_WARP_PIPE) );
            items.add( new SlimefunItem(cheesy_bites, Items.CYAN_WARP_PIPE, RecipeType.MAGIC_WORKBENCH, Recipes.CYAN_WARP_PIPE) );
            items.add( new SlimefunItem(cheesy_bites, Items.WHITE_VEXAL_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.WHITE_VEXAL_PIPE) );

            items.add( new SlimefunItem(cheesy_bites, Items.RED_VEXAL_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.RED_VEXAL_PIPE) );
            items.add( new SlimefunItem(cheesy_bites, Items.CYAN_VEXAL_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.CYAN_VEXAL_PIPE) );
            items.add( new SlimefunItem(cheesy_bites, Items.VEXAL_CORK, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.VEXAL_CORK) );
            items.add( new SlimefunItem(cheesy_bites, Items.MYSTICAL_PATINA, RecipeType.NULL, Recipes.MYSTICAL_PATINA) ); //<--- RecipeType.OXIDIZER
            items.add( new SlimefunItem(cheesy_bites, Items.SCALDING_STAFF, RecipeType.NULL, Recipes.SCALDING_STAFF) ); // <--- RecipeType.SMITHING_PRESS
            items.add( new SlimefunItem(cheesy_bites, Items.FLUTE_OF_WARPING, RecipeType.NULL, Recipes.FLUTE_OF_WARPING) ); // <--- RecipeType.SMITHING_PRESS
            items.add( new SlimefunItem(cheesy_bites, Items.SHOCK_SHIELD, RecipeType.NULL, Recipes.SHOCK_SHIELD) ); // <--- RecipeType.SMITHING_PRESS
            items.add( new SlimefunItem(cheesy_bites, Items.MINE_SWEEPER, RecipeType.MAGIC_WORKBENCH, Recipes.MINE_SWEEPER) );
            items.add( new SlimefunItem(cheesy_bites, Items.SCULK_SPINE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SCULK_SPINE) );

            items.add( new SlimefunItem(cheesy_bites, Items.SCULK_BOX, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SCULK_BOX) );
            items.add( new SlimefunItem(cheesy_bites, Items.EXPERIMENT_116, RecipeType.NULL, Recipes.EXPERIMENT_116) ); // <--- RecipeType.STRUCTURE_LOOT
            items.add( new SlimefunItem(cheesy_bites, Items.HISSING_FELT, RecipeType.NULL, Recipes.HISSING_FELT) ); // <--- RecipeType.CUSTOM_MOB_DROP
            items.add( new SlimefunItem(cheesy_bites, Items.WONDER_PIPE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.WONDER_PIPE) );
            items.add( new SlimefunItem(cheesy_bites, Items.PRISM_AXE, RecipeType.MAGIC_WORKBENCH, Recipes.PRISM_AXE) );
            items.add( new SlimefunItem(cheesy_bites, Items.PRISM_HOE, RecipeType.MAGIC_WORKBENCH, Recipes.PRISM_HOE) );
            items.add( new SlimefunItem(cheesy_bites, Items.PRISM_BREAKER, RecipeType.MAGIC_WORKBENCH, Recipes.PRISM_BREAKER) );
            items.add( new SlimefunItem(cheesy_bites, Items.NETHERITE_MULTITOOL, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.NETHERITE_MULTITOOL) );
            items.add( new SlimefunItem(cheesy_bites, Items.PAINTERS_PALLET, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.PAINTERS_PALLET) );

            log.info("Completed adding Bites subGroup to Typhfun itemGroup in Slimefun Guide");
        }
        SlimefunItem random_name;
        /*Cheesy Power*/ {
            items.add( new SlimefunItem(cheesy_power, Items.POWER_BANK_I, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.POWER_BANK_I) );
            items.add( new SlimefunItem(cheesy_power, Items.POWER_BANK_II, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.POWER_BANK_II) );
            items.add( new SlimefunItem(cheesy_power, Items.SEARING_ENGINE, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SEARING_ENGINE) );
            items.add( new SlimefunItem(cheesy_power, Items.TIDE_POOL_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.TIDE_POOL_GENERATOR) );
            items.add( new SlimefunItem(cheesy_power, Items.MOSS_MANAGER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.MOSS_MANAGER) );
            items.add( new SlimefunItem(cheesy_power, Items.RAINBOW_DYNAMO, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.RAINBOW_DYNAMO) );
            items.add( new SlimefunItem(cheesy_power, Items.DRINK_BLENDER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.DRINK_BLENDER) );
            items.add( new SlimefunItem(cheesy_power, Items.JUICE_PRESS, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.JUICE_PRESS) );
            items.add( new SlimefunItem(cheesy_power, Items.SMOOTHIE_MAKER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SMOOTHIE_MAKER) );

            items.add( new SlimefunItem(cheesy_power, Items.ELECTRIC_REFURBISHER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ELECTRIC_REFURBISHER) );
            items.add( new SlimefunItem(cheesy_power, Items.ELECTRIC_OXIDIZER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ELECTRIC_OXIDIZER) );
            items.add( new SlimefunItem(cheesy_power, Items.ELECTRIC_STUDIO, RecipeType.NULL, Recipes.ELECTRIC_STUDIO) ); //<--- RecipeType.SHOP
            items.add( new SlimefunItem(cheesy_power, Items.SLAUGHTER_BOX, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SLAUGHTER_BOX) );
            items.add( new SlimefunItem(cheesy_power, Items.SUPER_MAGNET, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.SUPER_MAGNET) );
            items.add( new SlimefunItem(cheesy_power, Items.ELECTRIC_ENCHANTER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ELECTRIC_ENCHANTER) );
            items.add( new SlimefunItem(cheesy_power, Items.ELECTRIC_DISENCHANTER, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ELECTRIC_DISENCHANTER) );
            items.add( new SlimefunItem(cheesy_power, Items.REDSTONE_ACTIVATION_MOD, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.REDSTONE_ACTIVATION_MOD) );
            items.add( new SlimefunItem(cheesy_power, Items.REDSTONE_SWITCH_MOD, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.REDSTONE_SWITCH_MOD) );

            items.add( new SlimefunItem(cheesy_power, Items.HOPPER_MOD, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.HOPPER_MOD) );
            items.add( new SlimefunItem(cheesy_power, Items.FUNNEL_MOD, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.FUNNEL_MOD) );
            items.add( new SlimefunItem(cheesy_power, Items.DISRUPTION_MOD, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.DISRUPTION_MOD) );
            items.add( new SlimefunItem(cheesy_power, Items.MAGMATIC_MOD, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.MAGMATIC_MOD) );
            items.add( new SlimefunItem(cheesy_power, Items.ECHOLOMATIC_MOD, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.ECHOLOMATIC_MOD) );
            items.add( new SlimefunItem(cheesy_power, Items.WARDSTATIC_MOD, RecipeType.ENHANCED_CRAFTING_TABLE, Recipes.WARDSTATIC_MOD) );

            log.info("Completed adding Power subGroup to Typhfun itemGroup in Slimefun Guide");
        }
        /*Cheesy Events*/ {

            //more
            //items.add( new SlimefunItem(cheesy_events, Items., RecipeType., Recipes.) );

            log.info("Completed adding Events subGroup to Typhfun itemGroup in Slimefun Guide");
        }
        /*Register all items*/ {
            for(SlimefunItem current_item : items) {
                current_item.register(this);
                mapping.put( current_item.getId(), current_item );
            }
        }

        log.info("Initialization complete");
    }

    @Override
    public void onDisable() {}

    @NotNull
    @Override
    public JavaPlugin getJavaPlugin() { return this; }

    @Nullable
    @Override
    public String getBugTrackerURL() { return null; }

    public static String CURRENCY;
    private static void reloadRecipe(SlimefunItem item, String setting_path, String seller) {
        item.setRecipe( new ItemStack[] {
                null, null,                                                                                          null,
                null, getCustomItem(Material.PLAYER_HEAD, seller, settings.getString(setting_path)+CURRENCY), null,
                null, null,                                                                                          null
        } );
    }
    public static void reload(boolean includeRecipes) {
        instance.reloadConfig();
        settings = instance.getConfig();

        CURRENCY = settings.getString("currency-symbol");

        if(includeRecipes) {
            reloadRecipe(mapping.get("ELECTRIC_STUDIO"), "prices.Electric-Studio","Painter");
            //...
        }
    }
}
