package net.typhonmc.typhfun;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;

import static io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem.getById;
import static net.typhonmc.typhfun.Items.format;

public class Recipes {

    public static ItemStack[] SMITHING_PRESS = {
            null, getCustomItem( Material.PISTON, "Piston (Facing Down)" ) , null,
            null, null, null,
            null, new ItemStack(Material.SMITHING_TABLE), null
    };
    public static ItemStack[] ENDER_MAILBOX = {
            new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE),
            new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.ENDER_EYE),    new ItemStack(Material.SMOOTH_STONE),
            new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE)
    };
    public static ItemStack[] ELECTURN = {
            null,                          null,                            null,
            new ItemStack(Material.CLOCK), new ItemStack(Material.LECTERN), new ItemStack(Material.CLOCK),
            null,                          null,                            null
    };
    public static ItemStack[] VEXAL_VEIL = {
            new ItemStack(Material.AMETHYST_SHARD),  getById("STRANGE_NETHER_GOO").getItem(), new ItemStack(Material.AMETHYST_SHARD),
            getById("STRANGE_NETHER_GOO").getItem(), new ItemStack(Material.TINTED_GLASS),    getById("STRANGE_NETHER_GOO").getItem(),
            new ItemStack(Material.AMETHYST_SHARD),  getById("STRANGE_NETHER_GOO").getItem(), new ItemStack(Material.AMETHYST_SHARD)
    };
    public static ItemStack[] GREEN_WARP_PIPE = {
            new ItemStack(Material.LIME_CONCRETE), null,                                    new ItemStack(Material.LIME_CONCRETE),
            new ItemStack(Material.LIME_CONCRETE), getById("ANCIENT_RUNE_ENDER").getItem(), new ItemStack(Material.LIME_CONCRETE),
            new ItemStack(Material.LIME_CONCRETE), getById("SYNTHETIC_EMERALD").getItem(),  new ItemStack(Material.LIME_CONCRETE)
    };
    public static ItemStack[] WRENCH_OF_WARPING = {
            null,                                 new ItemStack(Material.COPPER_INGOT), getById("ANCIENT_RUNE_ENDER").getItem(),
            null,                                 new ItemStack(Material.COPPER_INGOT), new ItemStack(Material.COPPER_INGOT),
            new ItemStack(Material.COPPER_INGOT), null,                                 null
    };
    public static ItemStack[] GREEN_VEXAL_PIPE = {
            new ItemStack(Material.TINTED_GLASS), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.TINTED_GLASS), Items.GREEN_WARP_PIPE,                  new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.TINTED_GLASS), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.TINTED_GLASS)
    };
    public static ItemStack[] DISPLAY_CASE = {
            new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
            new ItemStack(Material.GLASS), null,                          new ItemStack(Material.GLASS),
            new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
    };
    public static ItemStack[] SLIME_BUCKET = {
            null, null,                           null,
            null, new ItemStack(Material.BUCKET), null,
            null, null,                           null
    };

    public static ItemStack[] BOW_OF_MIMICRY = {
            new ItemStack(Material.AMETHYST_SHARD),   new ItemStack(Material.NETHER_STAR),     new ItemStack(Material.AMETHYST_SHARD),
            getById("MAGICAL_GLASS").getItem(),       new ItemStack(Material.BOW),             getById("MAGICAL_GLASS").getItem(),
            new ItemStack(Material.ENCHANTING_TABLE), getById("STRANGE_NETHER_GOO").getItem(), new ItemStack(Material.ENCHANTING_TABLE)
    };
    public static ItemStack[] WOODEN_FLUID_TANK = {
            new ItemStack(Material.OAK_WOOD), new ItemStack(Material.HOPPER), new ItemStack(Material.OAK_WOOD),
            new ItemStack(Material.GLASS),    new ItemStack(Material.BARREL), new ItemStack(Material.GLASS),
            new ItemStack(Material.OAK_WOOD), new ItemStack(Material.BUCKET), new ItemStack(Material.OAK_WOOD)
    };
    public static ItemStack[] STONE_FLUID_TANK = {
            new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.HOPPER), new ItemStack(Material.SMOOTH_STONE),
            new ItemStack(Material.IRON_INGOT),   Items.WOODEN_FLUID_TANK,        new ItemStack(Material.IRON_INGOT),
            new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.BUCKET), new ItemStack(Material.SMOOTH_STONE)
    };
    public static ItemStack[] BLACKSTONE_FLUID_TANK = {
            new ItemStack(Material.POLISHED_BLACKSTONE), new ItemStack(Material.HOPPER), new ItemStack(Material.POLISHED_BLACKSTONE),
            new ItemStack(Material.GOLD_INGOT),          Items.STONE_FLUID_TANK,         new ItemStack(Material.GOLD_INGOT),
            new ItemStack(Material.POLISHED_BLACKSTONE), new ItemStack(Material.BUCKET), new ItemStack(Material.POLISHED_BLACKSTONE)
    };
    public static ItemStack[] OBSIDIAN_FLUID_TANK = {
            new ItemStack(Material.OBSIDIAN), new ItemStack(Material.HOPPER), new ItemStack(Material.OBSIDIAN),
            new ItemStack(Material.DIAMOND),  Items.BLACKSTONE_FLUID_TANK,    new ItemStack(Material.DIAMOND),
            new ItemStack(Material.OBSIDIAN), new ItemStack(Material.BUCKET), new ItemStack(Material.OBSIDIAN)
    };
    public static ItemStack[] FROSTY_TANK = {
            new ItemStack(Material.OXIDIZED_COPPER), new ItemStack(Material.TINTED_GLASS),  new ItemStack(Material.OXIDIZED_COPPER),
            new ItemStack(Material.TINTED_GLASS),    getById("ANCIENT_RUNE_AIR").getItem(), new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.BARREL),          new ItemStack(Material.BLUE_ICE),      new ItemStack(Material.BARREL)
    };
    public static ItemStack[] FISH_TANK = {
            new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.TINTED_GLASS),     new ItemStack(Material.COPPER_BLOCK),
            new ItemStack(Material.TINTED_GLASS), getById("ANCIENT_RUNE_WATER").getItem(),  new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.BARREL),       new ItemStack(Material.DRIED_KELP_BLOCK), new ItemStack(Material.BARREL)
    };
    public static ItemStack[] AXOLOTL_TANK = {
            new ItemStack(Material.COPPER_BLOCK), new ItemStack(Material.TINTED_GLASS),    new ItemStack(Material.COPPER_BLOCK),
            new ItemStack(Material.TINTED_GLASS), getById("ANCIENT_RUNE_WATER").getItem(), new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.BARREL),       new ItemStack(Material.MOSS_BLOCK),      new ItemStack(Material.BARREL)
    };
    public static ItemStack[] SPONGE_STAFF = {
            null, null,                                                                     null,
            null, getCustomItem(Material.PLAYER_HEAD, "Elder Guardian","50%"), null,
            null, null,                                                                     null
    };

    public static ItemStack[] INFUSED_FLUTE = {
            null, null, null,
            null, getCustomItem(Material.PLAYER_HEAD, "Wandering Trader","10%"), null,
            null, null, null
    };
    public static ItemStack[] SLUDGE = {
            new ItemStack(Material.WARPED_FUNGUS),    new ItemStack(Material.SLIME_BALL),       new ItemStack(Material.FERMENTED_SPIDER_EYE),
            new ItemStack(Material.POISONOUS_POTATO), new ItemStack(Material.POISONOUS_POTATO), new ItemStack(Material.POISONOUS_POTATO),
            new ItemStack(Material.GLOW_INK_SAC),     new ItemStack(Material.MAGMA_CREAM),      new ItemStack(Material.NETHER_WART)
    };
    public static ItemStack[] POISON_SHOT = {
            new ItemStack(Material.COPPER_INGOT), new ItemStack(Material.VINE), Items.SLUDGE,
            new ItemStack(Material.VINE),         new ItemStack(Material.BOW),  Items.SLUDGE,
            new ItemStack(Material.COPPER_INGOT), new ItemStack(Material.VINE), Items.SLUDGE
    };
    public static ItemStack[] SQUID_SHOT = {
            null, null,                                                                 null,
            null, getCustomItem(Material.PLAYER_HEAD, "Glow Squid","10%"), null,
            null, null,                                                                 null
    };
    public static ItemStack[] INK_PHAIL = {
            new ItemStack(Material.INK_SAC), new ItemStack(Material.GLASS_BOTTLE), new ItemStack(Material.GLOW_INK_SAC),
            null,                            null,                                 null,
            null,                            null,                                 null
    };
    public static ItemStack[] DRINK_MIXER = {
            null,                                        null,                                 null,
            new ItemStack(Material.END_ROD),             new ItemStack(Material.END_STONE),    new ItemStack(Material.END_ROD),
            new ItemStack(Material.POPPED_CHORUS_FRUIT), new ItemStack(Material.PURPUR_BLOCK), new ItemStack(Material.POPPED_CHORUS_FRUIT)
    };
    public static ItemStack[] SPIKED_MILK = {
            new ItemStack(Material.MILK_BUCKET), getCustomItem(Material.POTION,"&f&lAny&r &fPotion"), null,
            null,                                null,                                                      null,
            null,                                null,                                                      null
    };
    public static ItemStack[] SPIKED_HONEY = {
            new ItemStack(Material.HONEY_BOTTLE), getCustomItem(Material.POTION,"&f&lAny&r &fPotion"), null,
            null,                                 null,                                                      null,
            null,                                 null,                                                      null
    };
    public static ItemStack[] PRISTINE_PRISMARINE_SHARD = {
            null, null,                                                              null,
            null, getCustomItem(Material.PLAYER_HEAD, "Guardian","5%"), null,
            null, null,                                                              null
    };

    public static ItemStack[] PRISTINE_PRISM = {
            null,                            Items.PRISTINE_PRISMARINE_SHARD,      null,
            Items.PRISTINE_PRISMARINE_SHARD, new ItemStack(Material.TINTED_GLASS), Items.PRISTINE_PRISMARINE_SHARD,
            null,                            Items.PRISTINE_PRISMARINE_SHARD,      null
    };
    public static ItemStack[] PRISM_PICKAXE = {
            getById("HARDENED_GLASS").getItem(), Items.PRISTINE_PRISM,             getById("HARDENED_GLASS").getItem(),
            null,                                getById("GILDED_IRON").getItem(), null,
            null,                                getById("GILDED_IRON").getItem(), null
    };
    public static ItemStack[] PRISM_SHOVEL = {
            null, Items.PRISTINE_PRISM,             null,
            null, getById("GILDED_IRON").getItem(), null,
            null, getById("GILDED_IRON").getItem(), null
    };
    public static ItemStack[] MIRROR_BLADE = {
            null, getById("HARDENED_GLASS").getItem(), null,
            null, getById("HARDENED_GLASS").getItem(), null,
            null, Items.PRISTINE_PRISM,                null
    };
    public static ItemStack[] HURRICANE_BLASTER = {
            null,                                Items.PRISTINE_PRISMARINE_SHARD,         null,
            Items.PRISTINE_PRISMARINE_SHARD,     getById("ANCIENT_RUNE_WATER").getItem(), Items.PRISTINE_PRISMARINE_SHARD,
            getById("HARDENED_GLASS").getItem(), Items.STONE_FLUID_TANK,                  getById("HARDENED_GLASS").getItem()
    };
    public static ItemStack[] PAINTERS_POLISH = {
            null, null,                            null,
            null, new ItemStack(Material.CALCITE), null,
            null, null,                            null
    };
    public static ItemStack[] PAINTERS_BRICKS = {
            null, null,                  null,
            null, Items.PAINTERS_POLISH, null,
            null, null,                  null
    };
    public static ItemStack[] SENSOR_COMPONENT_ONE = {
            Items.PRISTINE_PRISMARINE_SHARD,         new ItemStack(Material.SCULK_SENSOR),     Items.PRISTINE_PRISMARINE_SHARD,
            new ItemStack(Material.TINTED_GLASS),    new ItemStack(Material.ENDER_EYE),        new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.OXIDIZED_COPPER), getById("BASIC_CIRCUIT_BOARD").getItem(), new ItemStack(Material.OXIDIZED_COPPER)
    };
    public static ItemStack[] SENSOR_COMPONENT_TWO = {
            getById("COBALT_INGOT").getItem(),        new ItemStack(Material.TINTED_GLASS), getById("COBALT_INGOT").getItem(),
            getById("ANDROID_MEMORY_CORE").getItem(), Items.SENSOR_COMPONENT_ONE,           getById("ANDROID_MEMORY_CORE").getItem(),
            getById("SILICON").getItem(),             getById("SILICON").getItem(),         getById("SILICON").getItem()
    };

    public static ItemStack[] MOB_SENSOR = {
            null,                            new ItemStack(Material.LEATHER), null,
            new ItemStack(Material.LEATHER), Items.SENSOR_COMPONENT_ONE,      new ItemStack(Material.LEATHER),
            null,                            new ItemStack(Material.LEATHER), null
    };
    public static ItemStack[] PLAYER_SENSOR = {
            null,                            new ItemStack(Material.DIAMOND), null,
            new ItemStack(Material.DIAMOND), Items.SENSOR_COMPONENT_ONE,      new ItemStack(Material.DIAMOND),
            null,                            new ItemStack(Material.DIAMOND), null
    };
    public static ItemStack[] ITEM_SENSOR = {
            null,                           new ItemStack(Material.HOPPER), null,
            new ItemStack(Material.HOPPER), Items.SENSOR_COMPONENT_ONE,     new ItemStack(Material.HOPPER),
            null,                           new ItemStack(Material.HOPPER), null
    };
    public static ItemStack[] ADVANCED_PLAYER_SENSOR = {
            null,                            new ItemStack(Material.DIAMOND), null,
            new ItemStack(Material.DIAMOND), Items.SENSOR_COMPONENT_TWO,      new ItemStack(Material.DIAMOND),
            null,                            new ItemStack(Material.DIAMOND), null
    };
    public static ItemStack[] ADVANCED_ITEM_SENSOR = {
            null,                           new ItemStack(Material.HOPPER), null,
            new ItemStack(Material.HOPPER), Items.SENSOR_COMPONENT_TWO,     new ItemStack(Material.HOPPER),
            null,                           new ItemStack(Material.HOPPER), null
    };
    public static ItemStack[] HOSTILITY_SENSOR = {
            null,                        new ItemStack(Material.TNT), null,
            new ItemStack(Material.TNT), Items.SENSOR_COMPONENT_TWO,  new ItemStack(Material.TNT),
            null,                        new ItemStack(Material.TNT), null
    };
    public static ItemStack[] LASAGNA = {
            null, null,                                                                                      null,
            null, getCustomItem(Material.PLAYER_HEAD, format("<gradient:#FFAA00:#FFFF55>Lasagnaught"),"4-8"), null,
            null, null,                                                                                        null
    };
    public static ItemStack[] IMPASTA = {
            null, null,                                                                                       null,
            null, getCustomItem(Material.PLAYER_HEAD, format("<gradient:#FFAA00:#FFFF55>Lasagnaught"),"2.5%"), null,
            null, null,                                                                                        null
    };
    public static ItemStack[] LINGUINE_LANCE = {
            null, null,                                                                                     null,
            null, getCustomItem(Material.PLAYER_HEAD, format("<gradient:#FFAA00:#FFFF55>Lasagnaught"),"5%"), null,
            null, null,                                                                                       null
    };

    public static ItemStack[] PASTA_POWER = {
            null, null,                                                                                     null,
            null, getCustomItem(Material.PLAYER_HEAD, format("<gradient:#FFAA00:#FFFF55>Lasagnaught"),"5%"), null,
            null, null,                                                                                       null
    };
    public static ItemStack[] PASTAXE = {
        null, null,                                                                                       null,
        null, getCustomItem(Material.PLAYER_HEAD, format("<gradient:#FFAA00:#FFFF55>Lasagnaught"),"2.5%"), null,
        null, null,                                                                                         null
    };
    public static ItemStack[] SAUCE_SPADE = {
        null, null,                                                                                     null,
        null, getCustomItem(Material.PLAYER_HEAD, format("<gradient:#FFAA00:#FFFF55>Lasagnaught"),"5%"), null,
        null, null,                                                                                       null
    };
    public static ItemStack[] INFINIBURNER = {
            getById("STEEL_THRUSTER").getItem(), getById("STEEL_THRUSTER").getItem(),         getById("STEEL_THRUSTER").getItem(),
            getById("ANCIENT_RUNE_SOULBOUND").getItem(), getById("MAGNESIUM_DUST").getItem(), getById("ANCIENT_RUNE_SOULBOUND").getItem(),
            getById("STEEL_THRUSTER").getItem(), getById("STEEL_THRUSTER").getItem(),         getById("STEEL_THRUSTER").getItem()
    };
    public static ItemStack[] PRISMATIC_DRAGON_WINGS = {
            new ItemStack(Material.RED_DYE),    new ItemStack(Material.YELLOW_DYE), new ItemStack(Material.LIME_DYE),
            new ItemStack(Material.PURPLE_DYE), new ItemStack(Material.ELYTRA),     new ItemStack(Material.LIGHT_BLUE_DYE),
            getById("MAGIC_SUGAR").getItem(),   Items.PRISTINE_PRISM,               getById("MAGIC_SUGAR").getItem()
    };
    public static ItemStack[] WHITE_WARP_PIPE = {
            new ItemStack(Material.WHITE_CONCRETE), null,                                    new ItemStack(Material.WHITE_CONCRETE),
            new ItemStack(Material.WHITE_CONCRETE), getById("ANCIENT_RUNE_ENDER").getItem(), new ItemStack(Material.WHITE_CONCRETE),
            new ItemStack(Material.WHITE_CONCRETE), getById("SYNTHETIC_EMERALD").getItem(),  new ItemStack(Material.WHITE_CONCRETE)
    };
    public static ItemStack[] RED_WARP_PIPE = {
            new ItemStack(Material.RED_CONCRETE), null,                                    new ItemStack(Material.RED_CONCRETE),
            new ItemStack(Material.RED_CONCRETE), getById("ANCIENT_RUNE_ENDER").getItem(), new ItemStack(Material.RED_CONCRETE),
            new ItemStack(Material.RED_CONCRETE), getById("SYNTHETIC_EMERALD").getItem(),  new ItemStack(Material.RED_CONCRETE)
    };
    public static ItemStack[] CYAN_WARP_PIPE = {
            new ItemStack(Material.CYAN_CONCRETE), null,                                    new ItemStack(Material.CYAN_CONCRETE),
            new ItemStack(Material.CYAN_CONCRETE), getById("ANCIENT_RUNE_ENDER").getItem(), new ItemStack(Material.CYAN_CONCRETE),
            new ItemStack(Material.CYAN_CONCRETE), getById("SYNTHETIC_EMERALD").getItem(),  new ItemStack(Material.CYAN_CONCRETE)
    };
    public static ItemStack[] WHITE_VEXAL_PIPE = {
            new ItemStack(Material.TINTED_GLASS), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.TINTED_GLASS), Items.WHITE_WARP_PIPE,                  new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.TINTED_GLASS), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.TINTED_GLASS)
    };

    public static ItemStack[] RED_VEXAL_PIPE = {
            new ItemStack(Material.TINTED_GLASS), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.TINTED_GLASS), Items.RED_WARP_PIPE,                    new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.TINTED_GLASS), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.TINTED_GLASS)
    };
    public static ItemStack[] CYAN_VEXAL_PIPE = {
            new ItemStack(Material.TINTED_GLASS), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.TINTED_GLASS), Items.CYAN_WARP_PIPE,                   new ItemStack(Material.TINTED_GLASS),
            new ItemStack(Material.TINTED_GLASS), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.TINTED_GLASS)
    };
    public static ItemStack[] VEXAL_CORK = {
            new ItemStack(Material.MANGROVE_PLANKS), null, new ItemStack(Material.MANGROVE_PLANKS),
            Items.MYSTICAL_PATINA, Items.REDSTONE_ACTIVATION_MOD, Items.MYSTICAL_PATINA,
            new ItemStack(Material.MANGROVE_PLANKS), getById("REDSTONE_ALLOY").getItem(), new ItemStack(Material.MANGROVE_PLANKS)
    };
    public static ItemStack[] MYSTICAL_PATINA = {
            null, null,                                     null,
            null, new ItemStack(Material.WEATHERED_COPPER), null,
            null, null,                                     null
    };
    public static ItemStack[] SCALDING_STAFF = {
            new ItemStack(Items.MYSTICAL_PATINA.getType(), 10), Items.SPONGE_STAFF, null,
            null,                                                       null,               null,
            null,                                                       null,               null
    };
    public static ItemStack[] FLUTE_OF_WARPING = {
            new ItemStack(Items.MYSTICAL_PATINA.getType(), 10), Items.INFUSED_FLUTE, null,
            null,                                                       null,                null,
            null,                                                       null,                null
    };
    public static ItemStack[] SHOCK_SHIELD = {
            new ItemStack(Items.MYSTICAL_PATINA.getType(), 10), new ItemStack(Material.SHIELD), null,
            null,                                                       null,                           null,
            null,                                                       null,                           null
    };
    public static ItemStack[] MINE_SWEEPER = {
            new ItemStack(Material.PISTON),          new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.PISTON),
            Items.MYSTICAL_PATINA,                   new ItemStack(Material.DIAMOND_SWORD),  Items.MYSTICAL_PATINA,
            new ItemStack(Material.NETHERITE_SCRAP), new ItemStack(Material.AMETHYST_SHARD), new ItemStack(Material.NETHERITE_SCRAP)
    };
    public static ItemStack[] SCULK_SPINE = {
            new ItemStack(Material.SCULK), new ItemStack(Material.SCULK),      new ItemStack(Material.SCULK),
            new ItemStack(Material.SCULK), new ItemStack(Material.BONE_BLOCK), new ItemStack(Material.SCULK),
            new ItemStack(Material.SCULK), new ItemStack(Material.SCULK),      new ItemStack(Material.SCULK)
    };

    //more here

    private static ItemStack getCustomItem(Material appearance, String name, String... lores) {
        ItemStack current = new ItemStack(appearance);

        ItemMeta metadata = current.getItemMeta(); metadata.setDisplayName( name.replace('&','§') );
        List<String> lore = new ArrayList<String>(); for(String line : lores) { lore.add(line); }
        metadata.setLore(lore);

        current.setItemMeta( metadata );
        return current;
    }
}
