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

    public static SlimefunItemStack BOW_OF_MIMICRY = new SlimefunItemStack("BOW_OF_MIMICRY", Material.BOW, format("<gradient:#ff9d00:#ff0000>Bow of Mimicry"), "&7Damage: &c+15","","&6Item Ability&7: &cS&6k&ei&al&9l &5T&co&6r&en&aa&9d&bo","&aRight Click&7 to open a menu for extra bows,","&7upon shooting, a random bow is used.","","&6Item Ability&7: &cRocket Roundabout","&7If no extra bows are in the menu,","&7arrows shoot as fireworks.","&8(Firework Damage: -7)");
    public static SlimefunItemStack WOODEN_FLUID_TANK = new SlimefunItemStack("WOODEN_FLUID_TANK", Material.ACACIA_WOOD, "&bWooden Fluid Tank", "&7Stores Water, Milk, or Honey.");
    public static SlimefunItemStack STONE_FLUID_TANK = new SlimefunItemStack("STONE_FLUID_TANK", Material.SMOOTH_STONE, "&7Stone Fluid Tank", "&7Stores Water, Milk, or Honey.");
    public static SlimefunItemStack BLACKSTONE_FLUID_TANK = new SlimefunItemStack("BLACKSTONE_FLUID_TANK", Material.POLISHED_BLACKSTONE, "&8Blackstone Fluid Tank", "&7Stores Water, Milk, Honey, or Lava!");
    public static SlimefunItemStack OBSIDIAN_FLUID_TANK = new SlimefunItemStack("OBSIDIAN_FLUID_TANK", Material.OBSIDIAN, "&5Obsidian Fluid Tank", "&7Stores Water, Milk, Honey, or Lava!");
    public static SlimefunItemStack FROSTY_TANK = new SlimefunItemStack("FROSTY_TANK", Material.BLUE_ICE, "&1Frosty Tank", "&7Stores Powdered Snow.");
    public static SlimefunItemStack FISH_TANK = new SlimefunItemStack("FISH_TANK", Material.BLUE_STAINED_GLASS, "&1Fish Tank", "&7Stores Fish, for transport.");
    public static SlimefunItemStack AXOLOTL_TANK = new SlimefunItemStack("AXOLOTL_TANK", Material.PINK_STAINED_GLASS, "&dAxolotl Tank", "&7Stores Axolotl(s), for transport.");
    public static SlimefunItemStack SPONGE_STAFF = new SlimefunItemStack("SPONGE_STAFF", Material.BLAZE_ROD, "&aSponge Staff", "&f0/1 Buckets Filled","","&6Item Ability&7: &6Absorption","&aRight Click&7 on a water source to store in staffs' buckets","","&6Item Ability&7: &6Jet Propulsion","&aLeft Click&7 to place stored water","","&6Item Ability&7: &3Modular Storage","&7Place a bucket onto staff to increase storage by one.","&8(Compatible with Fluid Tanks)");

    public static SlimefunItemStack INFUSED_FLUTE = new SlimefunItemStack("INFUSED_FLUTE",Material.BAMBOO,"&bInfused Flute","&6Item Ability&7: &6Teleportation Tune","&7Play the correct tune to teleport, randomly, nearby","&8(1h cooldown)");
    public static SlimefunItemStack SLUDGE = new SlimefunItemStack("SLUDGE",Material.SLIME_BALL,"&5Sludge");
    public static SlimefunItemStack POISON_SHOT = new SlimefunItemStack("POISON_SHOT",Material.BOW,"&2Poison Shot","&7Damage: &c+10","","&6Item Ability&7: &aPiercing Toxins","&7Poisonous Arrows add 50% base damage");
    public static SlimefunItemStack SQUID_SHOT = new SlimefunItemStack("SQUID_SHOT",Material.BOW,format("<gradient:#0000AA:#55FFFF>Squidshot"),"&7Damage: &c+4","","&6Item Ability&7: "+format("<gradient:#0000AA:#55FFFF>Ink Frenzy"),"&7Applies arrow effects based on inks used","&7May use up to two unique inks at once","&8(5s cooldown)");
    public static SlimefunItemStack INK_PHAIL = new SlimefunItemStack("INK_PHAIL",Material.PLAYER_HEAD,"&7Ink Phail","","&fSmells nasty");
    public static SlimefunItemStack DRINK_MIXER = new SlimefunItemStack("DRINK_MIXER",Material.ITEM_FRAME,"&dDrink Mixer","&8The future is now, old man!","","&7Mix drinks with points and more");
    public static SlimefunItemStack SPIKED_MILK = new SlimefunItemStack("SPIKED_MILK",Material.MILK_BUCKET,"&cSpiked Milk","","&6Item Ability&7: &cSpiked","&7This drink is spiked with potion effects,","&7effects apply when drank.");
    public static SlimefunItemStack SPIKED_HONEY = new SlimefunItemStack("SPIKED_HONEY",Material.HONEY_BOTTLE,"&cSpiked Honey","","&6Item Ability&7: &cSpiked","&7This drink is spiked with potion effects,","&7effects apply when drank.");
    public static SlimefunItemStack PRISTINE_PRISMARINE_SHARD = new SlimefunItemStack("PRISTINE_PRISMARINE_SHARD",Material.PRISMARINE_SHARD,format("<gradient:#55FFFF:#FFFFFF:#FF5555>Pristine Prismarine Shard"),"&7So pure, it reflects!");

    public static SlimefunItemStack PRISTINE_PRISM = new SlimefunItemStack("PRISTINE_PRISM",Material.PRISMARINE_SHARD,format("<gradient:#FF55FF:#FFFF55>Pristine Prism"),"&8Crafting Material");
    public static SlimefunItemStack PRISM_PICKAXE = new SlimefunItemStack("PRISM_PICKAXE",Material.DIAMOND_PICKAXE,format("<gradient:#0000AA:#FFFFFF:#AA0000>Prism Pickaxe"),"","&6Mining Ability&7: &bBeam Breaker","&750% chance to break adjacent blocks");
    public static SlimefunItemStack PRISM_SHOVEL = new SlimefunItemStack("PRISM_SHOVEL",Material.DIAMOND_SHOVEL,format("<gradient:#AA0000:#FFFFFF:#AA00AA>Prism Shovel"),"","&6Mining Ability&7: &bBeam Breaker","&750% chance to break adjacent blocks");
    public static SlimefunItemStack MIRROR_BLADE = new SlimefunItemStack("MIRROR_BLADE",Material.IRON_SWORD,format("<gradient:#00AAAA:#55FFFF>Mirror Blade"),"&7Damage: &c+1","","&6Item Ability&7: &bMirrored","&7Permanently mirrors the properties of","&7the first sword it contacts.","&8Swap, in inventory, to mirror.");
    public static SlimefunItemStack HURRICANE_BLASTER = new SlimefunItemStack("HURRICANE_BLASTER",Material.DIAMOND_HORSE_ARMOR,format("<gradient:#0000AA:#55FFFF>Hurricane Blaster"),"&f0/5 Buckets Filled","","&6Item Ability&7: "+format("<gradient:#0000AA:#55FFFF>Jet Propulsion"),"&7Absorbs rain or swimming water to later","&7Propell oneself upwards.");
    public static SlimefunItemStack PAINTERS_POLISH = new SlimefunItemStack("PAINTERS_POLISH",Material.TIPPED_ARROW,"&FPainters' Polish","&8Dye-able");
    public static SlimefunItemStack PAINTERS_BRICKS = new SlimefunItemStack("PAINTERS_BRICKS",Material.TIPPED_ARROW,"Painters' Bricks","&8Dye-able");
    public static SlimefunItemStack SENSOR_COMPONENT_ONE = new SlimefunItemStack("SENSOR_COMPONENT_ONE",Material.OXIDIZED_COPPER,"&fSensor Component I","&8Crafting Material");
    public static SlimefunItemStack SENSOR_COMPONENT_TWO = new SlimefunItemStack("SENSOR_COMPONENT_TWO",Material.OXIDIZED_COPPER,"&fSensor Component II","&8Crafting Material");

    //more
    //public static SlimefunItemStack = new SlimefunItemStack("",Material.,"","");


}