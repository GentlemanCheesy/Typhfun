package net.typhonmc.typhfun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;

import static io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem.getById;

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
    public static ItemStack[] VEXAL_PIPE = {
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

    //more here


    public static ItemStack[] BOW_OF_MIMICRY = {
            new ItemStack(Material.EMERALD), null,                            new ItemStack(Material.EMERALD),
            null,                            new ItemStack(Material.DIAMOND), null,
            new ItemStack(Material.EMERALD), null,                            new ItemStack(Material.EMERALD)
    };

    private static ItemStack getCustomItem(Material appearance, String name, String... lores) {
        ItemStack current = new ItemStack(appearance);

        ItemMeta metadata = current.getItemMeta(); metadata.setDisplayName(name);
        List<String> lore = new ArrayList<String>(); for(String line : lores) { lore.add(line); }
        metadata.setLore(lore);

        current.setItemMeta( metadata );
        return current;
    }
}
