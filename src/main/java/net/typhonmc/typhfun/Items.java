package net.typhonmc.typhfun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Material;

public class Items {
    //Credit to AlchimiaVitae from [addon](https://github.com/Apeiros-46B/AlchimiaVitae)
    private static MiniMessage MINI_MESSAGE;
    private static LegacyComponentSerializer SERIALIZER;

    public static String format(String sentence) {
        return SERIALIZER.serialize( MINI_MESSAGE.deserialize(sentence) );
    }

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

    public static SlimefunItemStack SMITHING_PRESS = new SlimefunItemStack("SMITHING_PRESS", Material.BOW, format("<#FFFFFF>Smithing Press"), "LORE");

    public static SlimefunItemStack BOW_OF_MIMICRY = new SlimefunItemStack("TYF_ABILIBOW_MIMICRY", Material.BOW, format("<gradient:#ff9d00:red>Bow of Mimicry"), "&c+20% Coolness");
}
