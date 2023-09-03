package me.gentlemancheesy.typhfun;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class TyphfunAddon extends JavaPlugin implements SlimefunAddon {

    // Credit to AlchimiaVitae for these
    private static final MiniMessage MM = MiniMessage.builder()
            .tags(TagResolver.builder()
                    .resolver(StandardTags.color())
                    .resolver(StandardTags.decorations())
                    .resolver(StandardTags.gradient())
                    .resolver(StandardTags.reset())
                    .build())
            .build();

    // Serializer
    private static final LegacyComponentSerializer LCS = LegacyComponentSerializer.builder()
            .hexColors()
            .useUnusualXRepeatedCharacterHexFormat()
            .build();

    public static String format(String s) {
        return LCS.serialize(MM.deserialize(s));
    }

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        /*
         * 1. Creating a new Category
         * This Category will use the following ItemStack
         */
        ItemStack itemGroupItem = new CustomItemStack(Material.SCULK_SENSOR, "&3Typhfun", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey itemGroupId = new NamespacedKey(this, "typhfun_category");
        ItemGroup itemGroup = new ItemGroup(itemGroupId, itemGroupItem);

        /*
         * 2. Create a new SlimefunItemStack
         * This class has many constructors, it is very important
         * that you give each item a unique id.
         */
        SlimefunItemStack slimefunItem = new SlimefunItemStack("TYF_ABILIBOW_MIMICRY", Material.BOW, format("Abilibow of Mimicry"), "&c+20% Coolness");

        /*
         * 3. Creating a Recipe
         * The Recipe is an ItemStack Array with a length of 9.
         * It represents a Shaped Recipe in a 3x3 crafting grid.
         * The machine in which this recipe is crafted in is specified
         * further down as the RecipeType.
         */
        ItemStack[] recipe = { new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.DIAMOND), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD) };

        /*
         * 4. Registering the Item
         * Now you just have to register the item.
         * RecipeType.ENHANCED_CRAFTING_TABLE refers to the machine in
         * which this item is crafted in.
         * Recipe Types from Slimefun itself will automatically add the recipe to that machine.
         */
        SlimefunItem item = new SlimefunItem(itemGroup, slimefunItem, RecipeType.NULL , recipe);
        item.register(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public @NotNull JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
