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
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
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
        /*Create name creators*/ {
            MINI_MESSAGE = MiniMessage.builder()
                    .tags(  TagResolver.builder()
                            .resolver( StandardTags.color() )
                            .resolver( StandardTags.decorations() )
                            .resolver( StandardTags.gradient() )
                            .resolver( StandardTags.reset() )
                            .build()
                    ).build();
            SERIALIZER = LegacyComponentSerializer.builder()
                    .hexColors()
                    .useUnusualXRepeatedCharacterHexFormat()
                    .build();
        }

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
        new SlimefunItem(cheesy_bites, new SlimefunItemStack("TEST", Material.TURTLE_EGG,  "Test","Secret"), RecipeType.NULL , new ItemStack[]{null,null,null,null,null,null,null,null,null} ).register(this);
        new SlimefunItem(cheesy_bites, Items.BOW_OF_MIMICRY, RecipeType.NULL , Recipe.BOW_OF_MIMICRY ).register(this);

        //new SlimefunItem(cheesy_bites, Items.SMITHING_PRESS, RecipeType.NULL , Recipe.SMITHING_PRESS).register(this);

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
