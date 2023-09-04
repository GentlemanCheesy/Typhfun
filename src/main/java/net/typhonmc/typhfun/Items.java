package net.typhonmc.typhfun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Material;

public class Items {
    //Credit to AlchimiaVitae from [addon](https://github.com/Apeiros-46B/AlchimiaVitae) for MiniMessage, LegacyComponentSerializer, and format()
    private static final MiniMessage MINI_MESSAGE = MiniMessage.builder()
            .tags(  TagResolver.builder()
                    .resolver( StandardTags.color() )
                    .resolver( StandardTags.decorations() )
                    .resolver( StandardTags.gradient() )
                    .resolver( StandardTags.reset() )
                    .build()
            ).build();
    private static final LegacyComponentSerializer SERIALIZER = LegacyComponentSerializer.builder()
            .hexColors()
            .useUnusualXRepeatedCharacterHexFormat()
            .build();
    public static String format(String sentence) {
        return SERIALIZER.serialize( MINI_MESSAGE.deserialize(sentence) );
    }

    public static SlimefunItemStack SMITHING_PRESS = new SlimefunItemStack("SMITHING_PRESS", Material.PLAYER_HEAD, "&fSmithing Press", "&7Combine Items by dropping recipe items", "&7between piston and table.", "", "&7Power the piston to activate." );
    public static SlimefunItemStack ENDER_MAILBOX = new SlimefunItemStack("ENDER_MAILBOX", Material.PURPUR_BLOCK, "&5Ender Mailbox", "&7Send/Recieve from to/from others", "&7Create mail and Receive mail monthly.");
    public static SlimefunItemStack ELECTURN = new SlimefunItemStack("ELECTURN", Material.LECTERN, "&fElecturn", "&7Campaign for President!","","&7Vote for president during","&7the first 48hours of every fourth year.");
    public static SlimefunItemStack VEXAL_VEIL = new SlimefunItemStack("VEXAL_VEIL", Material.PURPLE_DYE, format("<gradient:green:white>Vexal Veil"), "&6Item Ability&7: &fCamouflage","","&7Consumable, changes Vexal Pipe appearence","&7to block in off-hand.");
    public static SlimefunItemStack GREEN_WARP_PIPE = new SlimefunItemStack("GREEN_WARP_PIPE", Material.PLAYER_HEAD, "&aWarp Pipe", "&7Teleports you to another discovered","&agreen&7 warp pipe in your current dimension.");
    public static SlimefunItemStack WRENCH_OF_WARPING = new SlimefunItemStack("WRENCH_OF_WARPING", Material.WARPED_ROOTS, "&3Wrench of Warping", "&6Item Ability&7: &3Minus World","","&e&bRight Click&r&7 to forget","&7a warp pipe, until used again.","","&7May break on use.");
    public static SlimefunItemStack VEXAL_PIPE = new SlimefunItemStack("VEXAL_PIPE", Material.LIME_STAINED_GLASS, "&aVexal Pipe", "&7Transports you from one end to another,","&7pipe must be continuous.","","&7If multiple end-points are present,","&7a random one is selected upon use.");
    public static SlimefunItemStack DISPLAY_CASE = new SlimefunItemStack("DISPLAY_CASE", Material.GLASS, "&6Display Case", "&7Shows item as dropped item.","&7Named items have name displayed.");
    public static SlimefunItemStack SLIME_BUCKET = new SlimefunItemStack("SLIME_BUCKET", Material.MILK_BUCKET, "&aSlime Bucket", "&6Item Ability&7: &aFamily Reunion","","&7Portable Friend!","&7Gets excited when in slime chunk.");

    public static SlimefunItemStack BOW_OF_MIMICRY = new SlimefunItemStack("BOW_OF_MIMICRY", Material.BOW, format("<gradient:#ff9d00:red>Bow of Mimicry"), "&7Damage: &c+15","","&6Item Ability&7: &cS&6k&ei&al&9l &5T&co&6r&en&aa&9d&bo","&aRight Click&7 to open a menu for extra bows,","&7upon shooting, a random bow is used.","","&6Item Ability&7: &cRocket Roundabout","&7If no extra bows are in the menu,","&7arrows shoot as fireworks.","&8(Firework Damage: -7)");
    public static SlimefunItemStack WOODEN_FLUID_TANK = new SlimefunItemStack("WOODEN_FLUID_TANK", Material.ACACIA_WOOD, "&bWooden Fluid Tank", "&7Stores Water, Milk, or Honey.");
    public static SlimefunItemStack STONE_FLUID_TANK = new SlimefunItemStack("STONE_FLUID_TANK", Material.SMOOTH_STONE, "&7Stone Fluid Tank", "&7Stores Water, Milk, or Honey.");
    public static SlimefunItemStack BLACKSTONE_FLUID_TANK = new SlimefunItemStack("BLACKSTONE_FLUID_TANK", Material.POLISHED_BLACKSTONE, "&8Blackstone Fluid Tank", "&7Stores Water, Milk, Honey, or Lava!");
    public static SlimefunItemStack OBSIDIAN_FLUID_TANK = new SlimefunItemStack("OBSIDIAN_FLUID_TANK", Material.OBSIDIAN, "&5Obsidian Fluid Tank", "&7Stores Water, Milk, Honey, or Lava!");
    public static SlimefunItemStack FROSTY_TANK = new SlimefunItemStack("FROSTY_TANK", Material.BLUE_ICE, "&1Frosty Tank", "&7Stores Powdered Snow.");
    public static SlimefunItemStack FISH_TANK = new SlimefunItemStack("FISH_TANK", Material.BLUE_STAINED_GLASS, "&1Fish Tank", "&7Stores Fish, for transport.");
    public static SlimefunItemStack AXOLOTL_TANK = new SlimefunItemStack("AXOLOTL_TANK", Material.PINK_STAINED_GLASS, "&dAxolotl Tank", "&7Stores Axolotl(s), for transport.");
    public static SlimefunItemStack SPONGE_STAFF = new SlimefunItemStack("SPONGE_STAFF", Material.BLAZE_ROD, "&aSponge Staff", "&f0/1 Buckets Filled","","&6Item Ability&7: &6Absorption","&aRight Click&7 on a water source to store in staffs' buckets","","&6Item Ability&7: &6Jet Propulsion","&aLeft Click&7 to place stored water","","&6Item Ability&7: &3Modular Storage","&7Place a bucket onto staff to increase storage by one.","&8(Compatible with Fluid Tanks)");

}
