package net.typhonmc.typhfun.additions;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Material;

import static net.typhonmc.typhfun.helpers.Formatter.*;

public class Items {
    //Credit to Apeiros from [AlchimiaVitae](https://github.com/Apeiros-46B/AlchimiaVitae) for MiniMessage (modified), LegacyComponentSerializer, and format()
    private static final MiniMessage MINI_MESSAGE = MiniMessage.builder()
            .tags(  TagResolver.builder()
                    .resolver( StandardTags.color() )
                    .resolver( StandardTags.rainbow() )
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

    public static SlimefunItemStack SMITHING_PRESS = new SlimefunItemStack("SMITHING_PRESS", Material.PLAYER_HEAD, "&fSmithing Press", fixLore(true, "&7Combine Items by dropping recipe items between piston and table.","&7Power the piston to activate.") );
    public static SlimefunItemStack ENDER_MAILBOX = new SlimefunItemStack("ENDER_MAILBOX", Material.PURPUR_BLOCK, "&5Ender Mailbox", fixLore(true, "&7Send/Recieve from to/from others","&7Create mail and Receive mail monthly.") );
    public static SlimefunItemStack ELECTURN = new SlimefunItemStack("ELECTURN", Material.LECTERN, "&fElecturn", fixLore(false, "&7Campaign for President!","&7Vote for president during the first 48hours of every fourth year.") );
    public static SlimefunItemStack VEXAL_VEIL = new SlimefunItemStack("VEXAL_VEIL", Material.PURPLE_DYE, format("<gradient:green:white>Vexal Veil"), fixLore(true, ability("&fCamouflage","&7Consumable, changes Vexal Pipe appearance to block in off-hand.") ) );
    public static SlimefunItemStack GREEN_WARP_PIPE = new SlimefunItemStack("GREEN_WARP_PIPE", Material.PLAYER_HEAD, "&aWarp Pipe", fixLore(true, "&7Teleports you to another discovered &agreen&7 warp pipe in your current dimension.") );
    public static SlimefunItemStack WRENCH_OF_WARPING = new SlimefunItemStack("WRENCH_OF_WARPING", Material.WARPED_ROOTS, "&3Wrench of Warping", fixLore(true, ability("&3Minus World",RIGHT+"&7to forget a warp pipe until used again.\nMay break on use.") ) );
    public static SlimefunItemStack GREEN_VEXAL_PIPE = new SlimefunItemStack("GREEN_VEXAL_PIPE", Material.LIME_STAINED_GLASS, "&aVexal Pipe", fixLore(true, "&7Transports you from one end to another; pipe must be continuous.\nIf multiple end-points are present, a random one is selected upon use.") );
    public static SlimefunItemStack DISPLAY_CASE = new SlimefunItemStack("DISPLAY_CASE", Material.GLASS, "&6Display Case", fixLore(true, "&7Shows item as dropped item.\nNamed items have name displayed.") );
    public static SlimefunItemStack SLIME_BUCKET = new SlimefunItemStack("SLIME_BUCKET", Material.MILK_BUCKET, "&aSlime Bucket", fixLore(true, ability("&aFamily Reunion","&7Gets excited when in slime chunk.") )  );

    public static SlimefunItemStack BOW_OF_MIMICRY = new SlimefunItemStack("BOW_OF_MIMICRY", Material.BOW, format("<gradient:#ff9d00:#ff0000>Bow of Mimicry"), fixLore(false, "&7Damage: &c+15", ability("&cS&6k&ei&al&9l &5T&co&6r&en&aa&9d&bo","&aRight Click&7 to open a menu for extra bows, upon shooting, a random bow is used."), ability("&cRocket Roundabout","&7If no bows are in the menu, arrows are shoot as fireworks.\n&8(Firework Damage: -7)") )  );
    public static SlimefunItemStack WOODEN_FLUID_TANK = new SlimefunItemStack("WOODEN_FLUID_TANK", Material.ACACIA_WOOD, "&bWooden Fluid Tank", fixLore(false, "&7Stores Water, Milk, or Honey.") );
    public static SlimefunItemStack STONE_FLUID_TANK = new SlimefunItemStack("STONE_FLUID_TANK", Material.SMOOTH_STONE, "&7Stone Fluid Tank", fixLore(false, "&7Stores Water, Milk, or Honey.") );
    public static SlimefunItemStack BLACKSTONE_FLUID_TANK = new SlimefunItemStack("BLACKSTONE_FLUID_TANK", Material.POLISHED_BLACKSTONE, "&8Blackstone Fluid Tank", fixLore(false, "&7Stores Water, Milk, Honey, or Lava!") );
    public static SlimefunItemStack OBSIDIAN_FLUID_TANK = new SlimefunItemStack("OBSIDIAN_FLUID_TANK", Material.OBSIDIAN, "&5Obsidian Fluid Tank", fixLore(false, "&7Stores Water, Milk, Honey, or Lava!") );
    public static SlimefunItemStack FROSTY_TANK = new SlimefunItemStack("FROSTY_TANK", Material.BLUE_ICE, "&1Frosty Tank", fixLore(false, "&7Stores Powdered Snow.") );
    public static SlimefunItemStack FISH_TANK = new SlimefunItemStack("FISH_TANK", Material.BLUE_STAINED_GLASS, "&1Fish Tank", fixLore(false, "&7Stores Fish, for transport.") );
    public static SlimefunItemStack AXOLOTL_TANK = new SlimefunItemStack("AXOLOTL_TANK", Material.PINK_STAINED_GLASS, "&dAxolotl Tank", fixLore(false, "&7Stores Axolotl(s) for transport.") );
    public static SlimefunItemStack SPONGE_STAFF = new SlimefunItemStack("SPONGE_STAFF", Material.BLAZE_ROD, "&aSponge Staff", fixLore(false, "&f0/1 Buckets Filled", ability("&6Absorption",RIGHT+"&7on a water source to store in staffs' buckets"), ability("&6Jet Propulsion",LEFT+"&7to place stored water"), ability("&3Modular Storage","&7Place a bucket onto staff to increase storage by one.\n&8(Compatible with Fluid Tanks)") )  );

    public static SlimefunItemStack INFUSED_FLUTE = new SlimefunItemStack("INFUSED_FLUTE",Material.BAMBOO,"&bInfused Flute",fixLore(true, ability("&6Teleportation Tune","&7Play the correct tune to randomly teleport nearby\n&8(1h cooldown)") )  );
    public static SlimefunItemStack SLUDGE = new SlimefunItemStack("SLUDGE",Material.SLIME_BALL,"&5Sludge", fixLore(false, "&8Crafting Material") );
    public static SlimefunItemStack POISON_SHOT = new SlimefunItemStack("POISON_SHOT",Material.BOW,"&2Poison Shot",fixLore(false, "&7Damage: &c+10", ability("&aPiercing Toxins","&7Poisonous Arrows add 50% base damage") )  );
    public static SlimefunItemStack SQUID_SHOT = new SlimefunItemStack("SQUID_SHOT",Material.BOW,format("<gradient:#0000AA:#55FFFF>Squidshot"),fixLore(false, "&7Damage: &c+4", ability(format("<gradient:#0000AA:#55FFFF>Ink Frenzy"),"&7Applies arrow effects based on inks used. May use up to two unique inks at once\n&8(5s cooldown)") )  );
    public static SlimefunItemStack INK_PHAIL = new SlimefunItemStack("INK_PHAIL",Material.PLAYER_HEAD,"&7Ink Phail",fixLore(false, "&8Projectile") );
    public static SlimefunItemStack DRINK_MIXER = new SlimefunItemStack("DRINK_MIXER",Material.ITEM_FRAME,"&dDrink Mixer",fixLore(false, "&8The future is now, old man!","&7Mix drinks with points and more") );
    public static SlimefunItemStack SPIKED_MILK = new SlimefunItemStack("SPIKED_MILK",Material.MILK_BUCKET,"&cSpiked Milk",fixLore(true, ability("&cSpiked","&7This drink is spiked with potion effects; effects apply when drank.") )  );
    public static SlimefunItemStack SPIKED_HONEY = new SlimefunItemStack("SPIKED_HONEY",Material.HONEY_BOTTLE,"&cSpiked Honey",fixLore(true, ability("&cSpiked","&7This drink is spiked with potion effects; effects apply when drank.") )  );
    public static SlimefunItemStack PRISTINE_PRISMARINE_SHARD = new SlimefunItemStack("PRISTINE_PRISMARINE_SHARD",Material.PRISMARINE_SHARD,format("<gradient:#55FFFF:#FFFFFF:#FF5555>Pristine Prismarine Shard"),fixLore(false, "&7So pure, it reflects!") );

    public static SlimefunItemStack PRISMARINE_PRISM = new SlimefunItemStack("PRISMARINE_PRISM",Material.PRISMARINE_SHARD,format("<gradient:#FF55FF:#FFFF55>Prismarine Prism"),fixLore(false, "&8Crafting Material") );
    public static SlimefunItemStack PRISM_PICKAXE = new SlimefunItemStack("PRISM_PICKAXE",Material.DIAMOND_PICKAXE,format("<gradient:#0000AA:#FFFFFF:#AA0000>Prism Pickaxe"),fixLore(true, ability("&bBeam Breaker","&750% chance to break adjacent blocks") ) );
    public static SlimefunItemStack PRISM_SHOVEL = new SlimefunItemStack("PRISM_SHOVEL",Material.DIAMOND_SHOVEL,format("<gradient:#AA0000:#FFFFFF:#AA00AA>Prism Shovel"),fixLore(true, ability("&bBeam Breaker","&750% chance to break adjacent blocks") ) );
    public static SlimefunItemStack MIRROR_BLADE = new SlimefunItemStack("MIRROR_BLADE",Material.IRON_SWORD,format("<gradient:#00AAAA:#55FFFF>Mirror Blade"),fixLore(false, "&7Damage: &c+1",ability("&bMirrored","&7Permanently mirrors the properties of the first sword it contacts\n&8Swap, in inventory, to mirror.") ) );
    public static SlimefunItemStack HURRICANE_BLASTER = new SlimefunItemStack("HURRICANE_BLASTER",Material.DIAMOND_HORSE_ARMOR,format("<gradient:#0000AA:#55FFFF>Hurricane Blaster"),fixLore(false, "&f0/5 Buckets Filled",ability(format("<gradient:#0000AA:#55FFFF>Jet Propulsion"),"&7Absorbs rain or swimming water to later. Propels oneself upwards.") ) );
    public static SlimefunItemStack PAINTERS_POLISH = new SlimefunItemStack("PAINTERS_POLISH",Material.TIPPED_ARROW,"&FPainters' Polish",fixLore(false, "&8Dye-able") );
    public static SlimefunItemStack PAINTERS_BRICKS = new SlimefunItemStack("PAINTERS_BRICKS",Material.TIPPED_ARROW,"Painters' Bricks",fixLore(false, "&8Dye-able") );
    public static SlimefunItemStack SENSOR_COMPONENT_ONE = new SlimefunItemStack("SENSOR_COMPONENT_ONE",Material.OXIDIZED_COPPER,"&fSensor Component I",fixLore(false, "&8Crafting Material") );
    public static SlimefunItemStack SENSOR_COMPONENT_TWO = new SlimefunItemStack("SENSOR_COMPONENT_TWO",Material.OXIDIZED_COPPER,"&fSensor Component II",fixLore(false, "&8Crafting Material") );

    public static SlimefunItemStack MOB_SENSOR = new SlimefunItemStack("MOB_SENSOR",Material.DARK_PRISMARINE,"&bMob Sensor",fixLore(false, "&7Senses nearby mobs",RIGHT_OR_LEFT+"to change radius\n&8(Maximum radius of 10m)") );
    public static SlimefunItemStack PLAYER_SENSOR = new SlimefunItemStack("PLAYER_SENSOR ",Material.LIGHT_BLUE_WOOL,"&bPlayer Sensor",fixLore(false, "&7Senses nearby players",RIGHT_OR_LEFT+"to change radius\n&8(Maximum radius of 10m)") );
    public static SlimefunItemStack ITEM_SENSOR = new SlimefunItemStack("ITEM_SENSOR",Material.LIGHT_BLUE_CONCRETE,"&bItem Sensor",fixLore(false, "&7Senses nearby items",RIGHT_OR_LEFT+"to change radius\n&8(Maximum radius of 10m)") );
    public static SlimefunItemStack ADVANCED_PLAYER_SENSOR = new SlimefunItemStack("ADVANCED_PLAYER_SENSOR",Material.BLUE_WOOL,"&bAdvanced Player Sensor",fixLore(false, "&7Senses nearby players",RIGHT_OR_LEFT+"to change radius\n&8(Maximum radius of 15m)",SHIFT_RIGHT+"to toggle mode") );
    public static SlimefunItemStack ADVANCED_ITEM_SENSOR = new SlimefunItemStack("ADVANCED_ITEM_SENSOR",Material.BLUE_CONCRETE,"&bAdvanced Item Sensor",fixLore(false, "&7Senses nearby items","",RIGHT_OR_LEFT+"to change radius\n&8(Maximum radius of 15m)",SHIFT_RIGHT+"to toggle mode") );
    public static SlimefunItemStack HOSTILITY_SENSOR = new SlimefunItemStack("HOSTILITY_SENSOR",Material.CHISELED_DEEPSLATE,"&4Hostility Sensor",fixLore(false, "&7Senses nearby combat",RIGHT_OR_LEFT+"to change radius\n&8(Maximum radius of 30m)",SHIFT_RIGHT+"to toggle mode") );
    public static SlimefunItemStack LASAGNA = new SlimefunItemStack("TYPHON_LASAGNA",Material.PLAYER_HEAD,format("<gradient:#FFAA00:#FFFF55>Lasagna"),fixLore(false, "&a+4&7 Saturation","&8Consumed on use") );
    public static SlimefunItemStack IMPASTA = new SlimefunItemStack("IMPASTA",Material.NAUTILUS_SHELL,"&eImpasta",fixLore(false, "&8Smithing Ingredient",ability(format("<gradient:#FFAA00:#FFFF55>When the Impasta is sauce!"),"&7When wearing any armor with this applied, ones' death message will differ.") )  );
    public static SlimefunItemStack LINGUINE_LANCE = new SlimefunItemStack("LINGUINE_LANCE",Material.IRON_SWORD,format("<gradient:#FFAA00:#FFFF55>Linguine Lance"),fixLore(false, "&7Damage: &c+7",ability(format("<gradient:#FFAA00:#FFFF55>I have the Pasta!"),RIGHT+"&7to activate 2x damage against Lasagnaughts\n&8Lasts 30s\n\n&7Once skill activation ends, bonus &aexp &7is awarded.") )  );

    public static SlimefunItemStack PASTA_POWER = new SlimefunItemStack("PASTA_POWER",Material.IRON_AXE,format("<gradient:#FFAA00:#FFFF55>Pasta Power"),fixLore(false, "&7Damage: &c+10",ability(format("<gradient:#FFAA00:#FFFF55>I have the Pasta!"),RIGHT+"&7to activate 2x damage against Lasagnaughts\n&8Lasts 30s\n\n&7Once skill activation ends, bonus &aexp &7is awarded.") )  );
    public static SlimefunItemStack PASTAXE = new SlimefunItemStack("PASTAXE",Material.IRON_PICKAXE,format("<gradient:#FFAA00:#FFFF55>Pastaxe"),fixLore(true, ability(format("gradient<#FF0000:#AAAA00>Raviolo Repair"),"&7For every worn &aImpasta&7, increases the probability of keeping the current durability by 25%.") )  );
    public static SlimefunItemStack SAUCE_SPADE = new SlimefunItemStack("SAUCE_SPADE",Material.IRON_SHOVEL,format("<gradient:#AA0000:#FFAA00>Sauce Spade"),fixLore(true, ability(format("gradient<#FF0000:#AAAA00>Raviolo Repair"),"&7For every worn &aImpasta&7, increases the probability of keeping the current durability by 25%.") )  );
    public static SlimefunItemStack INFINIBURNER = new SlimefunItemStack("INFINIBURNER",Material.FIREWORK_ROCKET,"&fInfiniburner",fixLore(true, ability("&fInfinite Launch","&7Using this rocket does not expend the rocket"),"&7Soulbound") );
    public static SlimefunItemStack PRISMATIC_DRAGON_WINGS = new SlimefunItemStack("PRISMATIC_DRAGON_WINGS",Material.ELYTRA,format("<rainbow:!1>Prismatic Dragon Wings</rainbow>"),fixLore(true, ability("&fSugar Rush","&7The longer you fly, the larger a boost upon landing") )  );
    public static SlimefunItemStack WHITE_WARP_PIPE = new SlimefunItemStack("WHITE_WARP_PIPE", Material.PLAYER_HEAD, "&fWarp Pipe", fixLore(false, "&7Teleports you to another discovered, &fwhite&7 warp pipe in your current dimension.") );
    public static SlimefunItemStack RED_WARP_PIPE = new SlimefunItemStack("RED_WARP_PIPE", Material.PLAYER_HEAD, "&4Warp Pipe", fixLore(false, "&7Teleports you to another discovered, &4red&7 warp pipe in your current dimension.") );
    public static SlimefunItemStack CYAN_WARP_PIPE = new SlimefunItemStack("CYAN_WARP_PIPE", Material.PLAYER_HEAD, "&3Warp Pipe",fixLore(false, "&7Teleports you to another discovered, &3cyan&7 warp pipe in your current dimension.") );
    public static SlimefunItemStack WHITE_VEXAL_PIPE = new SlimefunItemStack("WHITE_VEXAL_PIPE",Material.WHITE_STAINED_GLASS,"&fVexal Pipe",fixLore(false, "&7Teleports players from one end to another, if multiple ends are present: a random one is chosen") );

    public static SlimefunItemStack RED_VEXAL_PIPE = new SlimefunItemStack("RED_VEXAL_PIPE",Material.RED_STAINED_GLASS,"&4Vexal Pipe",fixLore(false, "&7Teleports players from one end to another, if multiple ends are present, a random one is chosen") );
    public static SlimefunItemStack CYAN_VEXAL_PIPE = new SlimefunItemStack("CYAN_VEXAL_PIPE",Material.CYAN_STAINED_GLASS,"&3Vexal Pipe",fixLore(false, "&7Teleports players from one end to another, if multiple ends are present, a random one is chosen") );
    public static SlimefunItemStack VEXAL_CORK = new SlimefunItemStack("VEXAL_CORK",Material.MANGROVE_PLANKS,"&fVexal Cork",fixLore(false, "&7When next to a Vexal Pipe end and powered by &credstone&7, disables the pipe end-point") );
    public static SlimefunItemStack MYSTICAL_PATINA = new SlimefunItemStack("MYSTICAL_PATINA",Material.PRISMARINE_CRYSTALS,format("<gradient:#55FF55:#55FFFF>Mystical Patina"),fixLore(false, "&8Crafting Material") );
    public static SlimefunItemStack SCALDING_STAFF = new SlimefunItemStack("SCALDING_STAFF",Material.BLAZE_ROD,format("<gradient:#FF0000:#FFAA00>Scalding Staff"), fixLore(false, "&f0/1 Buckets Filled", ability("&6Absorption",RIGHT+"&7on a water source to store in staffs' buckets"), ability("&6Jet Propulsion",LEFT+"&7to place stored water"), ability("&4Modular Storage","&7Place a bucket onto staff to increase storage by one.\n&8(Compatible with Fluid Tanks)") )  );
    public static SlimefunItemStack FLUTE_OF_WARPING = new SlimefunItemStack("FLUTE_OF_WARPING",Material.BAMBOO,"&aFlute of Warping",fixLore(true, ability("&6Super Tune","&7Play the correct tune to any random, visited, warp-pipe"),"&8(10m cooldown)") );
    public static SlimefunItemStack SHOCK_SHIELD = new SlimefunItemStack("SHOCK_SHIELD",Material.SHIELD,"&fShock Shield",fixLore(true, ability("&fShock Absorption",RIGHT+"&7 to store attacks as CC"),ability("&fSelf-Repair","&aSneak&7 to use stored CC for shield repair"),"&70/800 CC") );
    public static SlimefunItemStack MINE_SWEEPER = new SlimefunItemStack("MINE_SWEEPER",Material.DIAMOND_SWORD,format("<gradient:#55FF55:#55FFFF>Mine Sweeper"),fixLore(false, "&7Damage: &c+9",ability(format("<gradient:#55FF55:#55FFFF>Target Lock"),"&7Mobs hit by sweep will fly further\nCompatible with Sweeping Edge and Knockback") )  );
    public static SlimefunItemStack SCULK_SPINE = new SlimefunItemStack("SCULK_SPINE",Material.BONE_BLOCK,"&3Sculk Spine",fixLore(true, "&7Record songs onto Echo Shards","&7Start recording with &credstone &7power: Records nearby note-blocks\n&8(100m radius)") );

    public static SlimefunItemStack SCULK_BOX = new SlimefunItemStack("SCULK_BOX",Material.NOTE_BLOCK,"&3Sculk Box",fixLore(false, RIGHT+"&7with an Etched Echo Shard to play the record.","&7When powered by &credstone&7, the record will repeat.","&8(48m radius)") );
    public static SlimefunItemStack EXPERIMENT_116 = new SlimefunItemStack("EXPERIMENT_116",Material.BREAD,"&fExperiment 116",fixLore(true, ability("&fEchos of Twilight","&7When consumed, gives Sonic Boom immunity for 60s") )  );
    public static SlimefunItemStack HISSING_FELT = new SlimefunItemStack("HISSING_FELT",Material.PLAYER_HEAD,format("<gradient:#00AA00:#005D5D>Hissing Felt"),fixLore(false, "&8Crafting Material") );
    public static SlimefunItemStack WONDER_PIPE = new SlimefunItemStack("WONDER_PIPE",Material.PLAYER_HEAD,"&fWonder Pipe",fixLore(false, "&7Teleports you to a random pipe in any dimension") );
    public static SlimefunItemStack PRISM_AXE = new SlimefunItemStack("PRISM_AXE",Material.DIAMOND_AXE,format("<gradient:#55FF55:#FFFFFF:#5555FF>Prism Axe"),fixLore(true, ability("&bBeam Breaker","&750% chance to break adjacent blocks") ) );
    public static SlimefunItemStack PRISM_HOE = new SlimefunItemStack("PRISM_HOE",Material.DIAMOND_HOE,format("<gradient:#00AA00:#FFFFFF:#00FF00>Prism Hoe"),fixLore(true, ability("&bBeam Breaker","&750% chance to break adjacent blocks") ) );
    public static SlimefunItemStack PRISM_BREAKER = new SlimefunItemStack("PRISM_BREAKER",Material.NETHERITE_HOE,format("<gradient:#AA00AA:#FFFFFF:#55FF55>Prism Breaker"),fixLore(true, ability("&bBeam Breaker","&780% chance to break adjacent blocks") )  );
    public static SlimefunItemStack NETHERITE_MULTITOOL = new SlimefunItemStack("NETHERITE_MULTITOOL",Material.NETHERITE_PICKAXE,"&fNetherite Multitool",fixLore(true, ability("&fMultitasker",RIGHT+"&7to morph tool into clicked-block appropriate tool"),ability("&bBeam Breaker","&780% chance to break adjacent blocks"),"&8From crafting, tools keep enchants when used.") );
    public static SlimefunItemStack PAINTERS_PALLET = new SlimefunItemStack("PAINTERS_PALLET",Material.LEATHER_HORSE_ARMOR,"&fPainters' Pallet",fixLore(false, RIGHT+"&7to dye a painters block with current dye.") );


    private static final String CHEDDAR_CHARGE = "&6CC&r";
    private static String wattage(int cheddar_charge) { return "&e⚡ &7"+ cheddar_charge+CHEDDAR_CHARGE+"&7/s"; }
    private static String delta_cheddar(int cheddar_charge) { return "&e⚡ &7"+ cheddar_charge+CHEDDAR_CHARGE+"&7/item"; }
    private static String delta_cheddar(int cheddar_charge,String denominator_unit) { return "&e⚡ &7"+ cheddar_charge+CHEDDAR_CHARGE+"&7/"+denominator_unit; }
    private static String capacity(int cheddar_charge) { return "&a⚡ &7"+ cheddar_charge+CHEDDAR_CHARGE; }
    private static String radius(int distance) { return "&f⚡ &7"+ distance+"&8m&7 range"; }

    public static SlimefunItemStack POWER_BANK_I = new SlimefunItemStack("POWER_BANK_I",Material.GILDED_BLACKSTONE,"&6Power Bank I",fixLore(false, "&7Stores nearby, generated "+CHEDDAR_CHARGE+"&7.",capacity(800)+"\n"+radius(8) )  );
    public static SlimefunItemStack POWER_BANK_II = new SlimefunItemStack("POWER_BANK_II",Material.GILDED_BLACKSTONE,"&6Power Bank II",fixLore(false, "&7Stores nearby, generated "+CHEDDAR_CHARGE+"&7.",capacity(2000)+"\n"+radius(16) )  );
    public static SlimefunItemStack SEARING_ENGINE = new SlimefunItemStack("SEARING_ENGINE",Material.PLAYER_HEAD,"&fSearing Engine",fixLore(false, "&7Creates "+CHEDDAR_CHARGE+"&7 by burning &4Lava&7.", wattage(3) )  );
    public static SlimefunItemStack TIDE_POOL_GENERATOR = new SlimefunItemStack("TIDE_POOL_GENERATOR",Material.DARK_PRISMARINE,format("<gradient:#0000AA:#FFFFFF>Tide Pool Generator"),fixLore(false, "&7Generates "+CHEDDAR_CHARGE+"&7 from flowing water.\n&8Flowing water must be immediately above generator.",wattage(2) ) );
    public static SlimefunItemStack MOSS_MANAGER = new SlimefunItemStack("MOSS_MANAGER",Material.MOSS_BLOCK,"&2Moss Manager",fixLore(false,format("<gradient:#00AA00:#555555>Demossifies")+"&7 &2Moss&7-related blocks.",delta_cheddar(8) )  );
    public static SlimefunItemStack RAINBOW_DYNAMO = new SlimefunItemStack("RAINBOW_DYNAMO",Material.PLAYER_HEAD,format("<rainbow:!1>Rainbow Dynamo</rainbow>"),fixLore(false, "&7Desaturates colored blocks.", delta_cheddar(5) )  );
    public static SlimefunItemStack DRINK_BLENDER = new SlimefunItemStack("DRINK_BLENDER",Material.PRISMARINE,format("<gradient:#00AAAA:#0000AA>Drink Blender"),fixLore(false, "&7Modifiable drink mixer", delta_cheddar(10) )  );
    public static SlimefunItemStack JUICE_PRESS = new SlimefunItemStack("JUICE_PRESS",Material.MAGENTA_TERRACOTTA,"&aJuice Press",fixLore(false, "&7Turns produce into juices", delta_cheddar(5) )  );
    public static SlimefunItemStack SMOOTHIE_MAKER = new SlimefunItemStack("SMOOTHIE_MAKER",Material.PURPLE_TERRACOTTA,"&bSmoothie Maker",fixLore(false, "&7Turns produce into smoothies", delta_cheddar(5) )  );

    public static SlimefunItemStack ELECTRIC_REFURBISHER = new SlimefunItemStack("ELECTRIC_REFURBISHER",Material.WAXED_COPPER_BLOCK,format("<gradient:#44DD44:#FFAA00>Electric Refurbisher"),fixLore(false, "&7Strips Logs and Wood,\nDecrements oxidation stage of Copper Blocks",delta_cheddar(2) )  );
    public static SlimefunItemStack ELECTRIC_OXIDIZER = new SlimefunItemStack("ELECTRIC_OXIDIZER",Material.WAXED_OXIDIZED_COPPER,format("<gradient:#FFAA00:#44DD44>Electric Oxidizer"),fixLore(false, "&7Increments oxidation stage of Copper Blocks.",delta_cheddar(3) )  );
    public static SlimefunItemStack ELECTRIC_STUDIO = new SlimefunItemStack("ELECTRIC_STUDIO",Material.PAPER,"&fElectric Studio",fixLore(false, "&7All-in-one painting station!",delta_cheddar(2) )  );
    public static SlimefunItemStack SLAUGHTER_BOX = new SlimefunItemStack("SLAUGHTER_BOX",Material.PLAYER_HEAD,"&4Slaughterbox",fixLore(false, "&7Damages most nearby entities.\n&82 Attack Damage",wattage(2)+"\n"+radius(10) )  );
    public static SlimefunItemStack SUPER_MAGNET = new SlimefunItemStack("SUPER_MAGNET",Material.PLAYER_HEAD,"&fSuper Magnet",fixLore(false,"&7Pulls items to magnet.",delta_cheddar(1,"itemStack")+"\n"+radius(10) )  );
    public static SlimefunItemStack ELECTRIC_ENCHANTER = new SlimefunItemStack("ELECTRIC_ENCHANTER",Material.PINK_TERRACOTTA,"&fElectric Enchanter",fixLore(false, "&7Moves enchants from a book to a tool.",delta_cheddar(20,"enchant_level") )  );
    public static SlimefunItemStack ELECTRIC_DISENCHANTER = new SlimefunItemStack("ELECTRIC_DISENCHANTER",Material.LIGHT_BLUE_TERRACOTTA,"&fElectric Disenchanter",fixLore(false, "&7Moves enchants from a tool to a book.",delta_cheddar(25,"enchant_level") )  );
    public static SlimefunItemStack REDSTONE_ACTIVATION_MOD = new SlimefunItemStack("REDSTONE_ACTIVATION_MOD",Material.COMPARATOR,"&cRedstone Activation&7 Mod",fixLore(false, "&7Changes machine to only be active when powered by &credstone") );
    public static SlimefunItemStack REDSTONE_SWITCH_MOD = new SlimefunItemStack("REDSTONE_SWITCH_MOD",Material.COMPARATOR,"&cRedstone Switch&7 Mod",fixLore(false, "&7Changes machine to only be active when not powered by &credstone") );

    public static SlimefunItemStack HOPPER_MOD = new SlimefunItemStack("HOPPER_MOD",Material.HOPPER,"&fHopper Mod",fixLore(false, "&7Adds Hopper-interaction") );
    public static SlimefunItemStack FUNNEL_MOD = new SlimefunItemStack("FUNNEL_MOD",Material.HOPPER,"&fFunnel Mod","&7Adds Hopper-interaction,\nbut only moves full slots");
    public static SlimefunItemStack DISRUPTION_MOD = new SlimefunItemStack("DISRUPTION_MOD",Material.SHULKER_SHELL,"&dDisruption&f Mod",fixLore(false, "&7Adds disruption to nearby power signals") );
    public static SlimefunItemStack MAGMATIC_MOD = new SlimefunItemStack("MAGMATIC_MOD",Material.MAGMA_CREAM,"&6Magmatic&f Mod",fixLore(false, "&7Adds Combustible-item-interaction") );
    public static SlimefunItemStack ECHOLOMATIC_MOD = new SlimefunItemStack("ECHOLOMATIC_MOD",Material.ECHO_SHARD,format("<gradient:#5555FF:#55FFFF>Echolomatic</gradient>&f Mod"),fixLore(false, "&7Adds sound emissions") );
    public static SlimefunItemStack WARDSTATIC_MOD = new SlimefunItemStack("WARDSTATIC_MOD",Material.SCULK,format("<gradient:#5555FF:#55FFFF>Wardstatic</gradient>&f Mod"),fixLore(false, "&7Adds recipe-use maximum;\nresets by placing Sculk-Block adjacent",RIGHT+"&7to set use-count") );

    //more
    //public static SlimefunItemStack = new SlimefunItemStack("",Material.,"","");

}