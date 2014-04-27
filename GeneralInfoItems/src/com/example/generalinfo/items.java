package com.example.generalinfo;

import java.util.Random;


public class items {

	public String name; 
	//removed iconUrl
	public String availability;
	public String tier;
	public String stats;
	public String passive1;
	public String passive2;
	public String passive3;
	public String passive4;
	public String passive5;
	public String menu;
	public String itemCost;
	public String sellValue;
	public static items[] itemsArray = new items[100];
	
	
	//Method to get random boots. High must be 1 higher than the desired index
	//VALID INDEXES ARE 0 TO 6
	public static int getBoots(){
		Random r = new Random();
		int Low = 0;
		int High = 7;
		int R = r.nextInt(High-Low) + Low;
		return R;
	}
	
	//Method to get random items (not boots). High must be 1 higher than desired index
	//VALID INDEXES ARE 7 TO 67
	public static int getItems(){
		Random r = new Random();
		int Low = 7;
		int High = 68;
		int R = r.nextInt(High-Low) + Low;
		return R;
		
	}
	
	//Method to get a random item for Viktor (hexcore upgrades). High must be 1 higher than desired index
	//VALID INDEXES ARE 0 TO 2
	public static int getViktorItem(){
		Random r = new Random();
		int Low = 0;
		int High = 3;
		int R = r.nextInt(High-Low) + Low;
		return R;
		
	}
	
	//Constructor, removed iconUrl
	public items(String a, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m){
		name = a;
		//removed iconUrl
		availability = c;
		tier = d;
		stats = e;
		passive1 = f;
		passive2 = g;
		passive3 = h;
		passive4 = i;
		passive5 = j;
		menu = k;
		itemCost = l;
		sellValue = m;
	}
	
	//Methods to return Strings for items
	public static String getName(items a){
		return a.name;
	}
	//removed getIconUrl();
	public static String getAvailability(items a){
		return a.availability;
	}
	public static String getTier(items a){
		return a.tier;
	}
	public static String getStats(items a){
		return a.stats;
	}
	public static String getPassive1(items a){
		return a.passive1;
	}
	public static String getPassive2(items a){
		return a.passive2;
	}
	public static String getPassive3(items a){
		return a.passive3;
	}
	public static String getPassive4(items a){
		return a.passive4;
	}
	public static String getPassive5(items a){
		return a.passive5;
	}
	public static String getMenu(items a){
		return a.menu;
	}
	public static String getItemCost(items a){
		return a.itemCost;
	}
	public static String getSellValue(items a){
		return a.sellValue;
	}

	
	public static void runMain(){
		
		itemsArray[0] = new items("Abyssal Scepter", "Common", "Advanced", "+70 ability power \n+45 magic resistance", "Unique: Reduces the magic resist of nearby enemies by 20 (700 range).", "", "", "", "", "Defense > Magic Resist \nMagic > Ability Power", "2560g (980g)", "1792g");
		itemsArray[1] = new items("Aegis of the Legion", "Common", "Advanced", "+200 health \n+200 magic resistance", "Unique Aura - Legion: Nearby allied champions gain +20 magic resist and +10 heath regen per 5 seconds. (110 range)", "","","","", "Defense > Health \nDefense > Health Regen \nDefense > Magic Resist", "1900g (600g)", "1330g");
		itemsArray[2] = new items("Aether Wisp", "Common", "Advanced", "+30 ability power", "Unique Passive: +5% movement speed", "","","","", "Magic > Ability Power \nMovement > Other Movement Items", "950g (515g)", "665g");
		itemsArray[3] = new items("Amplifying Tome", "Common", "Basic", "+20 ability power", "","","","","", "Magic > Ability Power", "435g", "305g");
		itemsArray[4] = new items("Ancient Coin", "Common", "Basic", "+3 mana regeneration", "Unique Passive - Favor: Being near a minion death without granting the killing blow grants 2 gold and heals for 5 health. You may only be in possession of 1 Gold Income item.", "", "", "", "", "Magic > Mana Regen", "365g", "146g");
		itemsArray[5] = new items("Archangel's Staff", "Common", "Legendary", "+250 mana \n+60 ability power \n+10 mana regen", "Unqiue Passive - Insight: Gain ability power equal to 3% of your maximum mana", "Unique Passive - Mana Charge: Grants +8 maximum mana (max +750 mana) for each spell cast and mana expenditure (occurs up to 2 times every 6 seconds).", "Transforms into Seraph's Embrace at +750 mana.", "", "", "Magic > Ability Power \nMagic > Mana \nMagic > Mana Regen", "2700g (1140g)", "1890g");
		itemsArray[6] = new items("Athene's Unholy Grail", "Common", "Legendary", "+60 ability power \n+40 magic resistance \n+15 mana regeneration \n+20% cooldown reduction", "Unique Passive - Mana Font: Increases your mana regeneration by 1% per 1% mana you are missing.", "Unique Passive: Restores 12% of your max mana on kill or assist", "", "", "", "Defense > Magic Resist \nMagic < Ability Power \nMagic > Mana Regen \nMagic > Cooldown Reduction", "2600g (900g)", "1820g");
		itemsArray[7] = new items("Atma's Impaler", "Common", "Legendary", "+45 armor \n+15% critical strike chance", "Unique Passive: You gain attack damage equal to 1.5% of your maximum health.", "", "", "", "", "Attack > Attack Damage \nAttack > Critical Strike \nDefense > Armor", "2300g (780g)", "1610g");		
		itemsArray[8] = new items("Augment: Death", "The item now grants him +3 ability power per level, +220 health and +6 health regeneration per 5 seconds. Also,  Power Transfer increases Viktor's movement speed by 30% for 3 seconds.", "", "", "", "", "", "", "", "", "1000g", "Cannot be sold.");
		itemsArray[9] = new items("Augment: Gravity", "The item now grants him +3 ability power per level, +200 mana, +10% cooldown reduction and +5 mana regeneration per 5 seconds. Also,  Gravity Field's cast range is increased by 30%.", "", "", "", "", "", "", "", "", "1000g", "Cannot be sold.");
		itemsArray[10] = new items("Augment: Power", "The item now grants him +3 ability power per level and +45 ability power. Also,  Death Ray sets fire to enemies, dealing 30% additional magic damage over 4 seconds.", "", "", "", "", "", "", "", "", "1000g", "Cannot be sold.");
		itemsArray[11] = new items("B.F. Sword", "Summoner's Rift \nHowling Abyss", "Basic", "+45 attack damage", "", "", "", "", "", "Attack > Damage", "1550g", "1085g");
		itemsArray[12] = new items("Banner of Command", "Common", "Legendary", "+80 ability power \n+20% cooldown reduction", "Unique Aura - Valor: Nearby allied minions have 15% increased attack damage and ability power.", "Unique Active - Promote: Transforms a nearby siege minion to a more powerful unit. You gain all the gold this unit earns. 180 second cooldown.", "", "", "", "Magic > Ability Power \nMagic > Cooldown Reduction", "2400g (720g)", "1680g");
		itemsArray[13] = new items("Banshee's Veil", "Summoner's Rift \nTwisted Treeline \nHowling Abyss", "Legendary", "+450 health \n+55 magic resistance", "Unique: Grants a spell shield that blocks the next enemy ability. This shield refreshes after no damage is taken from enemy champions for 25 seconds.", "Unique: Grants 45 health regen for up to 10 seconds after taking damage from an enemy champion or when the spell shield breaks.", "", "", "", "Defense > Health \nDefense > Magic Resist", "2750g (950g)", "1925g");
		itemsArray[14] = new items("Berserker's Greaves", "Common", "Advanced", "+20% atttack speed", "Unique - Enhanced Movement: +45 movement speed", "", "", "", "", "Attack > Attack Speed \nMovement", "900g (175g)", "630g");
		itemsArray[15] = new items("Bilgewater Cutlass", "Common", "Legendary", "+25 attack damage \n+12% life steal", "Unique Active: Deals 100 magic damage and slows the target enemy champion's movement speed by 25% for 2 seconds. 90 second cooldown. (500 range)", "", "", "", "", "Attack > Damage \nAttack > Life Steal", "1400g (240g)", "980g");
		itemsArray[16] = new items("Blackfire Torch", "Twisted Treeline \n Crystal Scar", "Legendary", "+80 ability power \n+10% cooldown reduction", "Unique Active: Deals 20% of target champion's maximum Health in magic damage over 4 seconds and increases all subsequent magic damage taken by target by 20% (60 second cooldown)", "", "", "", "", "Defense > Health \nMagic > Ability Power \nMagic > Cooldown Reduction", "2650g (970g)", "1855g");
		itemsArray[17] = new items("Blade of the Ruined King", "Common", "Mythical", "+25 attack damage \n+15% life steal \n+40% attack speed", "Unique Passive: Your attacks deal 5% of the target's current health in physical damage (60 max vs minions and monsters).", "Unique Active: Drains target champion, dealing 15% of the champion's maximum health in physical damage (min. 100) and healing you for the damage dealt. Additionally you steal 30% of their movement speed for 3 seconds. 90 second cooldown. (450 range)", "", "", "", "Attack > Attack Damage \nAttack > Attack Speed \nAttack > Life Steal", "3200g (1000g)", "1995");
		itemsArray[18] = new items("Blasting Wand", "Common", "Basic", "+40 ability power", "", "", "", "", "", "Magic > Ability Power", "860g", "602g");
		itemsArray[19] = new items("Bonetooth Necklace (Blue)", "Common", "", "", "Rengar's Trinket", "Unique Passive - Mementos of the Hunt: Rengar collects trophies when killing champions and gains bonus effects based on how many trophies he has. Rengar gains one Trophy whenever he scores a kill or assist. 3 Trophies - Rengar gains flat movement speed while out of combat or while in brush. 6 Trophies -  Unseen Predator's range is increased by 125. 12 Trophies -  Thrill of the Hunt stealth duration is increased. 20 Trophies -  Thrill of the Hunt's bonus movement speed is doubled.", "Unique Active - Scrying Orb: Reveals small location within 2500 / 3500 / 4000 range for 1 second (120 second cooldown). Enemy champions hit will be revealed for 5 seconds. This does not affect stealth champions.", "", "", "", "", "");
		itemsArray[20] = new items("Bonetooth Necklace (Green)","Common", "", "", "Rengar's Trinket", "Unique Passive - Mementos of the Hunt: Rengar collects trophies when killing champions and gains bonus effects based on how many trophies he has. Rengar gains one Trophy whenever he scores a kill or assist. 3 Trophies - Rengar gains flat movement speed while out of combat or while in brush. 6 Trophies -  Unseen Predator's range is increased by 125. 12 Trophies -  Thrill of the Hunt stealth duration is increased. 20 Trophies -  Thrill of the Hunt's bonus movement speed is doubled.", "", "", "", "", "", "");
		itemsArray[21] = new items("Bonetooth Necklace (Red)", "Common", "", "", "Rengar's Trinket", "Unique Passive - Mementos of the Hunt: Rengar collects trophies when killing champions and gains bonus effects based on how many trophies he has. Rengar gains one Trophy whenever he scores a kill or assist. 3 Trophies - Rengar gains flat movement speed while out of combat or while in brush. 6 Trophies -  Unseen Predator's range is increased by 125. 12 Trophies -  Thrill of the Hunt stealth duration is increased. 20 Trophies -  Thrill of the Hunt's bonus movement speed is doubled.", "Unique Active - Sweeping Lens: Summons a drone at the target location for 4 / 6 / 10 seconds (400 / 600 range). The drone reveals and disables all invisible traps and wards within an 400 / 600 unit radius. (90 second cooldown). At 20 Trophies, you also gain true sight for 8 seconds.", "", "", "", "", "");
		itemsArray[22] = new items("Bonetooth Necklace (Yellow)","Common", "", "", "Rengar's Trinket", "Unique Passive - Mementos of the Hunt: Rengar collects trophies when killing champions and gains bonus effects based on how many trophies he has. Rengar gains one Trophy whenever he scores a kill or assist. 3 Trophies - Rengar gains flat movement speed while out of combat or while in brush. 6 Trophies -  Unseen Predator's range is increased by 125. 12 Trophies -  Thrill of the Hunt stealth duration is increased. 20 Trophies -  Thrill of the Hunt's bonus movement speed is doubled.", "Unique Active - Bonetooth Totem: Places a  Stealth Ward that lasts 60 / 120 / 180 seconds. (120 second cooldown). Limit 3 Stealth Wards on the map per player.", "", "", "", "", "");
		itemsArray[23] = new items("Boots of Mobility", "Common", "Advanced", "", "Unique - Enhanced Movement: +25 movement speed. Increases to +105 movement speed when out of combat for 5 seconds.", "", "", "", "", "Movement", "800g (475g)", "560g");
		itemsArray[24] = new items("Boots of Speed", "Common", "Basic", "", "Unique Passive - Enhanced Movement: +25 movement speed", "", "", "", "", "Movement", "325g", "227g");
		itemsArray[25] = new items("Boots of Swiftness", "Common", "Advanced", "", "Unique - Enhanced Movement: +60 movement speed.", "Unique - Slow Resist: Movement slowing effects are reduced by 25%", "", "", "", "Movement", "1000g (675g)", "700g");
		itemsArray[26] = new items("Brawler's Gloves", "Common", "Basic", "+8% critical strike chance", "", "", "", "", "", "Attack > Critical Strike", "400g", "280g");
		itemsArray[27] = new items("Catalyst the Protector", "Common", "Advanced", "+200 health \n+300 mana", "Unique Passive - Valor's Reward: On leveling up, restores 150 health and 200 mana over 8 seconds.", "", "", "", "", "Defense > Health \nMagic > Mana", "1200g (400g)", "840g");
		itemsArray[28] = new items("Chain Vest", "Common", "Basic", "+40 armor", "", "", "", "", "", "Defense > Armor", "720g", "504g");
		itemsArray[29] = new items("Chalice of Harmony", "Common", "Advanced", "+25 magic resistance \n+7 mana regeneration", "Unique Passive - Mana Font: Increases your mana regeneration by 1% per 1% mana you are missing.", "", "", "", "", "Defense > Magic Resist \nMagic > Mana Regen", "880g (120g)", "616g");
		itemsArray[30] = new items("Cloak of Agility", "Common", "Basic", "+15% critical strike chance", "", "", "", "", "", "Attack > Critical Strike", "730g", "511g");
		itemsArray[31] = new items("Cloth Armor", "Common", "Basic", "+15 armor", "", "", "", "", "", "Defense > Armor", "300g", "210g");
		itemsArray[32] = new items("Crystalline Flask", "Summoner's Rift \nTwisted Treeline \nCrystal Scar", "Consumable", "", "Unique Passive: Starts with 3 charges and refills each time you stop by your shop.", "Active: Consumes a charge to restore 120 health and 60 mana over 12 seconds.", "", "", "", "Defense > Health Regen \nMagic > Mana Regen \nConsumables", "345g", "138g");
		itemsArray[33] = new items("Dagger", "Common", "Basic", "+12% attack speed", "", "", "", "", "", "Attack > Attack Speed", "400g", "280g");
		itemsArray[34] = new items("Deathfire Grasp", "Summoner's Rift \nHowling Abyss", "Legendary", "+120 ability power \n+10% cooldown reduction", "Unique Active: Deals 15% of target champion's maximum health in magic damage and applies the debuff, Doom. Doom amplifies all magic damage that champion takes by 20% for 4 seconds. 60 second cooldown (750 range).", "", "", "", "", "Magic > Ability Power \nMagic > Cooldown Reduction", "3100g (680g)", "2170g");
		itemsArray[35] = new items("Dervish Blade", "Twisted Treeline \nCrystal Scar", "Legendary", "+50% attack speed \n+45 magic resist \n+10% cooldown reduction", "Unique Active - Quicksilver: Removes all debuffs from your champion. Melee champions also gain +50% movement speed for 1 second. 90 second cooldown.", "", "", "", "", "", "3000g (200g)", "2100g");
		itemsArray[36] = new items("Doran's Blade", "Summoner's Rift \nTwisted Treeline \nHowling Abyss", "Basic", "+80 health \n+8 attack damage", "Passive: Basic Attacks restore 3 health for ranged, and 5 health for melee champions", "", "", "", "", "Attack > Damage \nDefense > Health", "440g", "176g");
		itemsArray[37] = new items("Doran's Ring", "Summoner's Rift \nTwisted Treeline \nHowling Abyss", "Basic", "+15 ability power \n+60 health \n+3 mana regeneration", "Restores 4 mana when you kill an enemy unit.", "", "", "", "", "Defense > Health \nMagic > Ability Power \nMagic > Mana Regen", "400g", "160");
		itemsArray[38] = new items("Doran's Shield", "Common", "Basic", "+80 health \n+6 health regen per 5 seconds", "Unique Passive: Blocks 8 damage from champion basic attacks.", "", "", "", "", "Defense > Health \nDefense > Health Regen", "440g", "176g");
	/*	itemsArray[39] = new items("Elixir of Brilliance",
		itemsArray[40] = new items("Elixir of Fortitude",
		itemsArray[41] = new items("Enchantment: Alacrity",
		itemsArray[42] = new items("Enchantment: Captain",
		itemsArray[43] = new items("Enchantment: Distortion",
		itemsArray[44] = new items("Enchantment: Furor",
		itemsArray[45] = new items("Enchantment: Homeguard",
		itemsArray[46] = new items("Entropy", 
		itemsArray[47] = new items("Executioner’s Calling", "Common", "Legendary", "+25 attack damage \n+20% critical strike chance", "Unique: Your basic attacks inflict Grievous Wounds on enemy champion for 1.5 seconds.", "", "", "", "", "Attack > Critical Strike \nAttack > Damage", "1900g (740g)", "1330g");
		itemsArray[48] = new items("Explorer's Ward",
		itemsArray[49] = new items("Face of the Mountain", "Common", "Legendary", "+500 health \n+20 health regeneration \n+10% cooldown reduction", "Unique Passive – Spoils of War: Melee autoattacks execute minions below 200 (+100% AD) health. Killing a minion by any means heals yourself and the nearest allied champion for 50 (+1% of your maximum health) health and grants them gold equal to the kill. These effects require a nearby allied champion and consume a charge. Recharges every 30 seconds for a maximum of 4 charges. You may only be in possession of 1 Gold Income item.", "Unique Active – Deadly Phalanx: You shield the target ally for 10% of your maximum health for 4 seconds. After 4 seconds, the shield explodes, dealing magic damage equal to (100% of target’s AD) + (30% of target’s AP), regardless of if the shield remained intact. 60 second cooldown.", "", "", "", "Defense > Health \nDefense > Health Regen \nMagic > Cooldown Reduction", "2200g (485g)", "880g");
		itemsArray[50] = new items("Faerie Charm",
		itemsArray[51] = new items("Farsight Orb",
		itemsArray[52] = new items("Feral Flare", "Summoner's Rift", "Mythical", "+35% attack speed \n+15 attack damage", "Unique Passive - Maim: Champion kills, assists and large monsters slain will grant Feral stacks. Basic attacks deal 100 (+3 per Feral stack) bonus magic damage and restore 10 (+1 per Feral stack) health. Enemy champions take 33% of the bonus magic damage.", "Unique: Gain 30% increased gold from monsters. You may only be in possession of 1 Gold Income item.", "Unique Active: Places a Stealth Ward at target location that lasts for 180 seconds. 180 second cooldown. (1000 cast range).", "", "", "Attack > Attack Speed \nAttack > Attack Damage", "1650g (This item cannot be bought)", "720g");
		itemsArray[53] = new items("Fiendish Codex",
		itemsArray[54] = new items("Forbidden Idol",
		itemsArray[55] = new items("Frost Queen’s Claim", "Common", "Legendary", "+50 ability power \n+10% cooldown reduction \n+10mana regeneration \n +4 gold per 10 seconds", "Unique Passive – Tribute: Your next damaging ability or autoattack against a champion or structure will deal 15 additional damage and grant 10 gold. You generate one charge of Tribute every 10 seconds storing up to 3.", "Unique Active – Arctic Embrace: Fire an ice lance that detonates at the target location, dealing 50 (+5 per level) magic damage to enemies and slowing them by 80%, decaying over 2 seconds. 60 second cooldown. (850 range, 225 radius).", "", "", "", "Gold Income \nMagic > Ability Power \nMagic > Cooldown Reduction \nMagic > Mana Regen", "2200g (515g)", "880g");
		itemsArray[56] = new items("Frostfang",
		itemsArray[57] = new items("Frozen Heart", "Common", "Legendary", "+100 armor \n+400 mana \n+20% cooldown reduction", "Unique: Reduces the attack speed of nearby enemies by 15%. (700 range).", "", "", "", "", "Defense > Armor \nMagic > Cooldown Reduction \nMagic > Mana", "2600g (650g)", "1820g");
		itemsArray[58] = new items("Frozen Mallet", "Common", "Advanced", "+700 health \n+30 attack damage", "Unique - Icy: Your basic attacks slow your target's Movement Speed by 40% for 1.5 seconds (30% slow for ranged attacks)", "", "", "", "", "Attack > Damage \nDefense > Health", "3300g (1025g)", "2310g");
		itemsArray[59] = new items("Giant's Belt",
		itemsArray[60] = new items("Glacial Shroud",
		itemsArray[61] = new items("Greater Stealth Totem",
		itemsArray[62] = new items("Greater Vision Totem",
		itemsArray[63] = new items("Grez's Spectral Lantern",
		itemsArray[64] = new items("Guardian Angel", "Summoner's Rift \nCrystal Scar", "Advanced", "+50 armor \n+40 magic resistance", "Unique: Revives your champion upon death, restoring 30$ of your maximum health and mana after 4 seconds of stasis. 5 minute cooldown.", "", "", "", "", "Defense > Armor \nDefense > Magic Resist", "2750g (1310g)", "1100g");
		itemsArray[65] = new items("Guardian's Horn",
		itemsArray[66] = new items("Guinsoo's Rageblade", "Common", "Advanced", "+40 ability power \n+30 attack damage", "Passive: Autoattacks (on attack) and champion abilities grant +4% attack speed and +4 ability power for 8 seconds (stacks up to 8 times).", "Unique Passive: Falling below 50% health grants +20% attack speed, +10% life steal, and 10% spell vamp until out of combat. 30 second cooldown.", "", "", "", "Attack > Damage \nAttack > Attack Speed \nMagic > Ability Power", "2600g (865g)", "1820g");
		itemsArray[67] = new items("Haunting Guise",
		itemsArray[68] = new items("Head of Kha'Zix",
		itemsArray[69] = new items("Health Potion",
		itemsArray[70] = new items("Hexdrinker",
		itemsArray[71] = new items("Hextech Gunblade", "Common", "Mythical", "+45 attack damage \n+65 ability power \n+12% life steal", "Unique Passive: +20% spell vamp", "Unique Passive - Reload: Your basic attacks and single target spells against champions reduce the cooldown of this item by 3 seconds.", "Unique Active: Deals 150 (+ 40% AP) magic damage and slow sthe target champion's movement speed by 40% for 2 seconds. 60 second cooldown. (700 range)", "", "", "Attack > Damage \nAttack > Life Steal \nMagic > Ability Power", "3400g (800g)", "2380g");
		itemsArray[72] = new items("Hextech Sweeper",
		itemsArray[73] = new items("Hunter's Machete",
		itemsArray[74] = new items("Iceborn Gauntlet", "Common", "Legendary", "+30 ability power \n+500 mana \n+60 armor \n+10% cooldown reduction", "Unique Passive – Spellblade: After using an ability, your next basic attack deals 125% base AD bonus physical damage to surrounding enemies and creates a field for 2 seconds that slows enemies inside by 30% (2 second cooldown).", "", "", "", "", "Defense > Armor \nMagic > Ability Power \nMagic > Cooldown Reduction \nMagic > Mana", "2900g (750g)", "2030g");
		itemsArray[75] = new items("Ichor of Illumination",
		itemsArray[76] = new items("Ichor of Rage",
		itemsArray[77] = new items("Infinity Edge", "Summoner's Rift", "Advanced", "+70 attack damage \n+25% critical strike chance", "Unique: +50% critical strike damage", "", "", "", "", "Attack > Critical Strike \nAttack > Damage", "3800g (645g)", "2660g");
		itemsArray[78] = new items("Ionian Boots of Lucidity",
		itemsArray[79] = new items("Kindlegem",
		itemsArray[80] = new items("Kitae's Bloodrazor",
		itemsArray[81] = new items("Last Whisper", "Common", "Advanced", "+40 attack damage", "Unique: +35% armor penetration", "", "", "", "", "Attack > Damage", "2300g (1065g)", "1610g");
		itemsArray[82] = new items("Liandry’s Torment", "Common", "Legendary", "+50 ability power \n+300 health", "Unique Passive – Eyes of Pain: +15 magic penetration", "Unique Passive: Dealing spell damage applies a damage-over-time effect that deals bonus magic damage equal to 2% of the target’s current Health per second for 3 seconds. This bonus is doubled against movement-impaired units and capped at 100 damage per second vs. monsters.", "", "", "", "Defense > Health \nMagic > Ability Power", "2900g (980g)", "2030g");
		itemsArray[83] = new items("Lich Bane", "Common", "Legendary", "+80 ability power \n+250 mana \n+5% movement speed", "Unique Passive – Spellblade: After using an ability, your next basic attack deals 75% base AD (+ 50% AP) bonus magic damage. 2 second cooldown.", "", "", "", "", "Magic >Ability Power \nMagic > Mana \nMovement > Other Movement Items", "3000g (940g)", "2100g");
		itemsArray[84] = new items("Locket of the Iron Solari", "Common", "Legendary", "+400 health \n+20 magic resistance \n+10% cooldown reduction", "Unique Aura – Legion: Nearby allied champions gain +20 magic resist and +10 health regen per 5 seconds. (1100 range).", "Unique Active: Shield yourself and nearby allied champions for 5 seconds, absorbing up to 50 (+10 per level) damage. 60 second cooldown. (600 range).", "", "", "", "Defense > Health \nDefense > Health Regen \nDefense > Magic Resist \nMagic > Cooldown Reduction", "2800g (50g)", "1960g");
		itemsArray[85] = new items("Long Sword",
		itemsArray[86] = new items("Lord Van Damm's Pillager",
		itemsArray[87] = new items("Madred's Razors",
		itemsArray[88] = new items("Mana Manipulator",
		itemsArray[89] = new items("Mana Potion",
		itemsArray[90] = new items("Manamune",
		itemsArray[91] = new items("Maw of Malmortius", "Common", "Legendary", "+60 attack damage \n+40 magic resistance", "Unique: Grants +1 attack damage for every 2% of missing health, capped at 35 Attack Damage.", "Unique Passive – Lifeline: Upon taking magic damage that would reduce health below 30%, grants a shield that absorbs 400 magic damage for 5 seconds (90 second cooldown).", "", "", "", "Defense > Magic Resistance \nAttack > Damage", "3200g (975g)", "2310g");
		itemsArray[92] = new items("Mejai's Soulstealer", "Summoner's Rift", "Advanced", "+20 ability power", "Unique: Grants +8 ability power per stack. Gains 2 stacks for a kill or 1 stack for an assist (max 20 stacks). A third of the current stacks are lost upon death. At 20 stacks, grants 15% cooldown reduction.", "", "", "", "", "Magic > Ability Power", "1235g (800g)", "865g");
		itemsArray[93] = new items("Mercurial Scimitar", "Summoner's Rift \nHowling Abyss", "Legendary", "+60 attack damage \n+45 magic resistance", "Unique Active - Quicksilver: Removes all debuffs from your champion. Melee champions also gain +50% movement speed for 1 second. 90 second cooldown.", "", "", "", "", "Defense > Magic Resist \nAttack > Attack Damage \nMovement > Other Movement Items", "3700g (600g)", "2590g");
		itemsArray[94] = new items("Mercury's Treads", "Common", "Advanced", "+25 magic resistance", "Unique - Enhanced Movement: +45 movement speed", "Unique - Tenacity: the duration of stuns, slows, taunts, fears, silences, blinds, and immobilizes are reduced by 35%.", "", "", "", "Defense > Magic Resist \nMovement", "1200g (475g)", "840g");
		itemsArray[49] = new items("Mikael’s Crucible", "Summoner’s Rift", "Legendary", "+40 magic resist \n+12 mana regeneration", "Unique Passive – Mana Font: Increases your Mana Regen by 1% per 1% Mana you are missing.", "Unique Active: Removes all stuns, roots, taunts, fears, silences, and slows on an allied champion and heals for 150 + 10% of the target’s maximum health. (180 second cooldown).", "", "", "", "Defense > Magic Resist \nMagic > Mana Regen", "1600g (720g)", "1120g");		
		itemsArray[95] = new items("Moonflair Spellblade",
		itemsArray[96] = new items("Morellonomicon", "Common", "Legendary", "+75 ability power \n+12 mana regeneration \n+20% cooldown reduction", "Unique: Dealing magic damage to an enemy champion below 40% health inflicts Grievous Wounds to them for 4 seconds.", "", "", "", "", "Magic > Ability Power \nMagic > Cooldown Reduction \nMagic > Mana Regen", "2200g (765g)", "1540g");
		itemsArray[97] = new items("Muramana", "Common", "Mythical", "+1000 mana \n+20 attack damage \n+7 mana regeneration", "Unique Passive - Awe: Gain attack damage equal to 2% of your maximum mana.", "Toggle Active: Single target spells and attacks (on hit) consume 3% of current mana to deal bonus physical damage equal to twice the amount of Mana consumed.", "", "", "", "N/A", "2100g (This item cannot be bought)", "1897g");
		itemsArray[98] = new items("Nashor’s Tooth", "Common", "Legendary", "+50% attack speed \n+60 ability power", "Unique: +20% cooldown reduction", "Unique: Basic attacks deal 15 (+ 15% AP) bonus magic damage on hit", "", "", "", "Attack > Attack Speed \nMagic > Ability Power \nMagic > Cooldown Reduction", "2920g (850g)", "2044g");
		itemsArray[99] = new items("Needlessly Large Rod",
		itemsArray[100] = new items("Negatron Cloak",
		itemsArray[101] = new items("Ninja Tabi", "Common", "Advanced", "+25 armor", "Unique - Enhanced Movement: +45 movement speed.", "Unique: Blocks 10% of the damage from basic attacks.", "", "", "", "Defense > Armor \nMovement", "1000g (375g)", "700g");
		itemsArray[102] = new items("Nomad's Medallion",
		itemsArray[103] = new items("""-Magic Mantle",
		itemsArray[104] = new items("Odyn's Veil",
		itemsArray[105] = new items("Ohmwrecker", "Summoner's Rift \nTwisted Treeline", "Advanced", "+350 health \n+50 ability power", "Unique Active: Prevents the closest enemy tower from attack for 2.5 seconds (120 second cooldown). This effect cannot be used against the same tower more than once every 7.5 seconds.", "", "", "", "", "Defense > Health \nMagic > Ability Power", "2000g (740g)", "1400g");
		itemsArray[106] = new items("Oracle's Extract",
		itemsArray[107] = new items("Oracle's Lens",
		itemsArray[108] = new items("Orb of Winter",
		itemsArray[109] = new items("Overlord's Bloodmail",
		itemsArray[110] = new items("Phage",
		itemsArray[111] = new items("Phantom Dancer", "Common", "Legendary", "+50% attack speed \n+30% critical strike chance \n+5% movement speed", "Unique: Your champion ignores unit collision", "", "", "", "", "Attack > Attack Speed \nAttack > Critical Strike \nMovement > Other Movement Items", "2800g (495g)", "1960g");
		itemsArray[112] = new items("Pickaxe",
		itemsArray[113] = new items("Poro-Snax",
		itemsArray[114] = new items("Prospector's Blade",
		itemsArray[115] = new items("Prospector's Ring",
		itemsArray[116] = new items("Quicksilver Sash",
		itemsArray[117] = new items("Rabadon's Deathcap", "Summoner's Rift \nHowling Abyss", "Advanced", "+120 ability power", "Unique: +30% ability power", "", "", "", "", "Magic > Ability Power", "3300g (840g)", "2310g");
		itemsArray[118] = new items("Randuin’s Omen", "Common", "Legendary", "+500 health \n+70 armor", "Unique Passive – Cold Steel: When hit by basic attacks, reduces the attacker’s attack speed by 15% and movement speed by 10% for 1 second.", "Unique Active: Slows the movement speed of nearby enemy units by 35% for 2 (+ 0.5% armor) (+ 0.5% magic resistance) seconds. 60 second cooldown (500 range).", "", "", "", "Defense > Armor \nDefense > Health", "3000g (1000g)", "2170g");
		itemsArray[119] = new items("Ravenous Hydra", "Common", "Legendary", "+75 attack damage \n+15 health regeneration \n+12% life steal", "Melee only.", "Passive: Damage dealt by this item benefits from life steal.", "Unique Passive – Cleave: Your attacks deal up to 60% of your Attack Damage to units around your target as physical damage (185 range), decaying down to 20% near the edge (385 range).", "Unique Active – Crescent: Deals up to 100% of your Attack Damage to units around you as physical damage, decaying down to 60% near the edge. 10 second cooldown (400 range).", "", "Attack > Attack Damage \nAttack > Life Steal \n Defense > Health Regeneration", "3300g (600g)", "2310g");
		itemsArray[120] = new items("Recurve Bow",
		itemsArray[121] = new items("Rejuvenation Bead",
		itemsArray[122] = new items("Relic Shield",
		itemsArray[123] = new items("Rod of Ages", "Common", "Legendary", "+450 health \n+450 mana \n+60 ability power", "Passive: This item gains 20 health, 20 mana, and 2 ability power every minute, up to 10 times.", "Unique Passive – Valor’s Reward: On leveling up, restores 150 health and 200 mana over 8 seconds.", "", "", "", "Defense > Health \nMagic > Ability Power \nMagic > Mana", "2800g (740g)", "1960g");
		itemsArray[124] = new items("Ruby Crystal",
		itemsArray[125] = new items("Ruby Sightstone", "Summoner's Rift", "Consumable \nLegendary", "+400 health", "Unique Passive: Ward Refresh - Holds 5 charges and refills upon visiting the shop.", "Unique Active: Ghost Ward - Consumes a charge to place a Stealth Ward that reveals the surrounding area for 3 minutes. A player may only have 3 Stealth Wards on the map at one time.", "", "", "", "Defense > Health \nConsumable", "1600g (400g)", "620g");
		itemsArray[126] = new items("Runaan's Hurricane", "Common", "Advanced", "+70% attack speed", "Ranged only: Unique Passive: your basic attacks fire minor bolts at 2 nearby targets, each dealing 10 (+50% AD) physical damage and applying on-hit effects.", "", "", "", "", "Attack > Attack Speed", "2400g (700g)", "1680g");
		itemsArray[127] = new items("Rylai's Crystal Scepter", "Common", "Advanced", "+80 ability power \n+500 health", "Unique: Dealing spell damage slows the target's movement speed by 35% for 1.5 seconds (15% for multi-target and damage-over-time spells).", "", "", "", "", "Defense > Health \nMagic > Ability Power", "2900g (605g)", "2030g");
		itemsArray[128] = new items("Sanguine Blade",
		itemsArray[129] = new items("Sapphire Crystal",
		itemsArray[130] = new items("Scrying Orb",
		itemsArray[131] = new items("Seeker's Armguard",
		itemsArray[132] = new items("Seraph's Embrace", "Common", "Mythical", "+1000 mana \n+60 ability power \n+10 mana regeneration", "Unique Passive - Insight: Gain ability power equal to 3% of your maximum mana.", "Unique Active - Mana Shield: Drains 20% of your current mana to shield yourself for an equal amount plus 150 for 3 seconds (120 second cooldown)", "", "", "", "N/A", "2700g (This item cannot be bought)", "1897g");
		itemsArray[133] = new items("Sheen",
		itemsArray[134] = new items("Sightstone",
		itemsArray[135] = new items("Sorcerer's Shoes", "Common", "Advanced", "+15 magic penetration", "Unique - Enhanced Movement: +45 movement speed.", "", "", "", "", "Movement", "1100g (775g)", "770g");
		itemsArray[136] = new items("Sepctre's Cowl",
		itemsArray[137] = new items("Spellthief's Edge",
		itemsArray[138] = new items("Spirit of the Ancient Golem", "Summoner's Rift \nTwisted Treeline \nHowling Abyss", "Legendary", "+350 health \n+10% cooldown reduction", "Unique Passive - Tenacity: The duration of stuns, slows, taunts, fears, silences, blinds, polymorphs, and immobilizes are reduced by 35%.", "Unique Passive - Butcher: Against monsters, deal 30% bonus damage and restore 6% of damage dealt to monsters as health and 3% as mana.", "Unique Passive - Conservation: You generate Conservation stacks every 1.5 seconds up to 80. Killing a large monster will consume up to 40 stacks and grant 1 bonus gold per stack consumed. You may only be in possession of 1 Gold Income item.", "", "", "Gold Income \nDefense > Health \nMagic > Cooldown Reduction", "2000g (450g)", "800g");
		itemsArray[139] = new items("Spirit of the Elder Lizard", "Summoner's Rift \nTwisted Treeline \nHowling Abyss", "Legendary", "+30 attack damage \n+10% cooldown reduction", "Unique Passive - Incinerate: Deals and additional 14 + (2 x level) bonus true damage over 3 seconds upon dealing physical damage.", "Unique Passive - Butcher: Against monsters, deal 20% bonus damage and restore 6% of damage dealt to monsters as health and 3% as mana.", "Unique Passive - Conservation: You generate Conservation stacks every 1.5 seconds up to 80. Killing a large monster will consume up to 40 stacks and grant 1 bonus gold per stack consumed. You may only be in possession of 1 Gold Income item.", "", "", "Gold Income \nDefense > Health Regen \nAttack > Damage \nMagic > Mana Regen", "2000g (580g)", "800g");
		itemsArray[140] = new items("Spirit of the Spectral Wraith", "Summoner's Rift \nTwisted Treeline \nHowling Abyss", "Legendary", "+50 ability power \n+10% cooldown reduction", "Unique Passive - Spirit Drain: Grants 2 ability power for every large monster kill (max: 15 stacks)", "Unique Passive - Butcher: Against monsters, deal 30% bonus damage and restore 6% of damage dealt to monsters as health and 3% as mana.", "Unique Passive - Conservation: You generate Conservation stacks every 1.5 seconds up to 80. Killing a large monster will consume up to 40 stacks and grant 1 bonus gold per stack consumed. You may only be in possession of 1 Gold Income item.", "", "", "Gold Income \nMagic > Ability Power \nMagic > Cooldown Reduction", "2000g (480g)", "800g");
		itemsArray[141] = new items("Spirit Stone",
		itemsArray[142] = new items("Spirit Visage", "Common", "Legendary", "+400 health \n+55 magic resistance \n+10% cooldown reduction \n+20 health regen", "Unique: Increases your self-healing, health regen, life steal and spell vamp by 20%", "", "", "", "", "Defense > Health \nDefense > Magic Resist \nMagic > Cooldown Reduction", "2750g (500g)", "1925g");
		itemsArray[143] = new items("Statikk Shiv", "Common", "Legendary", "+40% attack speed \n+20% critical strike chance \n+6% movement speed", "Unique Passive: Moving and attacking builds Static Charges. At 100 charges, your next attack expends the charges to deal 100 magic damage to up to 4 targets. This damage can critically strike.", "", "", "", "", "Attack > Critical Strike \nAttack > Attack Speed \nMovement > Other Movement Items", "2500g (525g)", "1750g");
		itemsArray[144] = new items("Stealth Ward",
		itemsArray[145] = new items("Stinger",
		itemsArray[146] = new items("Sunfire Cape", "Common", "Advanced", "+450 health \n+45 armor", "Unique passive: Deals 25 + (1 x level) magic damage per second to nearby enemies (400 range).", "", "", "", "", "Defense > Armor \nDefense > Health", "2650g (930g)", "1855g");
		itemsArray[147] = new items("Sweeping Lens",
		itemsArray[148] = new items("Sword of the Divine", "Common", "Advanced", "+45% attack speed", "Passive: This item does not grant any attack speed while on cooldown. Champion kills redue the current cooldown by 50%.", "Unique Active: You gain 100% attack speed and 100% critical strike chance for 3 seconds or 3 critical strikes. 60 second cooldown", "", "", "", "Attack > Attack Speed \nAttack > Critical Strike", "2150g (850g)", "1505g");
		itemsArray[149] = new items("Sword of the Occult", "Summoner's Rift", "Advanced", "+10 attack damage", "Unique: Grants +5 attack damage per stack. Gains 2 stacks for a kill or 1 stack for an assist (max 20 stacks). A third of the current stacks are lost upon death. At 20 stacks, grants 15% bonus movement speed.", "", "", "", "", "Attack > Damage", "1200g (840g)", "840g");
		itemsArray[150] = new items("Talisman of Ascension", "Common", "Legendary", "+20% cooldown reduction \n+10 health regeneration \n+15 mana regeneration \n+2 gold per 10 seconds", "Unique Passive - Favor: Being near a minion death without granting the killing blow grants 3 gold and heals for 10 health. You may only be in possession of 1 Gold Income item.", "Unique Active: Grants nearby allies +40% movement speed for 3 seconds. 60 second cooldown. (600 range)", "", "", "", "Gold Income \nDefense > Health Regen \nMagic > Cooldown Reduction \nMagic > Mana Regen \nMovement > Other Movement Items", "2200g (585g)", "880g");
		itemsArray[151] = new items("Targon's Brace",
		itemsArray[152] = new items("Tear of the Goddess",
		itemsArray[153] = new items("The Black Cleaver", "Common", "Legendary", "+200 health \n+50 attack damage \n+10% cooldown reduction \nUNIQUE: +10 armor penetration", "Passive: Dealing physical damage to an enemy champion reduces their armor by 5% for 4 seconds. This effect stacks up to 5 times.", "", "", "", "", "Attack > Damage \nMagic > Cooldown Reduction \nDefense > Health", "3000g (1263g)", "2100g");
		itemsArray[154] = new items("The Bloodthrister", "Summoner's Rift", "Legendary", "+70 attack damage \n+12% life steal", "Grants +1 attack damage and +0.2% life steal per stack (max +30 attack damage and +6% life steal). Half of the current stacks are lost upon death.", "", "", "", "", "Attack > Damage \nAttack > Life Steal", "3200g (850g)", "2240g");
		itemsArray[155] = new items("The Brutalizer",
		itemsArray[156] = new items("The Hex Core",
		itemsArray[157] = new items("The Lightbringer",
		itemsArray[158] = new items("Thornmail", "Summoner's Rift \nCrystal Scar \nHowling Abyss", "Advanced", "+100 armor", "Unique: On being hit by basic attacks, returns 30% of damage, before any reductions such as armor, as magic damage.", "", "", "", "", "Defense > Armor", "2200g (1180g)", "1540g");
		itemsArray[159] = new items("Tiamat",
		itemsArray[160] = new items("Total Biscuit of Rejuvenation",
		itemsArray[161] = new items("Trinity Force", "Common", "Legendary", "+30 ability power \n+30 attack damage \n+30% attack speed \n+10% critical strike chance \n+250 health \n+200 mana \n+8% movement speed", "Unique Passive - Rage: Basic attacks grant 20 movement speed for 2 seconds on hit. Minion, monster, and champion kills grant 60 movement speed for 2 seconds. The movement speed bonus is halved for ranged champions.", "Unique Passive - Spellblade: After using an ability, your next basic attack deals 200% base AD bonus physical damage. (2 second cooldown).", "", "", "", "Attack > Attack Damage \nAttack > Attack Speed \nAttack > Critical Strike \nDefense > Health \nMagic > Ability Power \nMagic > Mana \nMovement > Other Movement Items", "3703g (3g)", "2592g");
		itemsArray[162] = new items("Twin Shadows", "Common", "Legendary", "+80 ability power \n+10% cooldown reduction \n+6% movement speed", "Unique Active - Hunt: Summons 2 invulnerable ghosts for 6 seconds to seek the two nearest enemy champions. If they touch an enemy champion, they slow their movement speed by 40% and reveal them for 2.5 seconds. Ghosts that fail to find a target return to the wielder, reducing the item's cooldown by 40 seconds each. 120 second cooldown.", "", "", "", "", "Magic > Ability Power \nMagic > Cooldown Reduction \nMovement > Other Movement Items", "2400g (630g)", "1680g");
		itemsArray[163] = new items("Vampiric Scepter",
		itemsArray[164] = new items("Vision Ward",
		itemsArray[165] = new items("Void Staff", "Common", "Advanced", "+70 ability power", "Unique: +35% magic penetration", "", "", "", "", "Magic > Ability Power", "2295g (1000g)", "1607g");
		itemsArray[166] = new items("Warden's Mail",
		itemsArray[167] = new items("Warding Totem",
		itemsArray[168] = new items("Warmog's Armor", "Summoner's Rift", "Advanced", "+1000 health", "Unique Passive: You gain health regeneration equal to 1% of your maximum health.", "", "", "", "", "Defense > Health \nDefense > Health Regen", "2830g (1070g)", "1981g");
		itemsArray[169] = new items("Wicked Hatchet",
		itemsArray[170] = new items("Will of the Ancients", "Common", "Legendary", "+80 ability power \n+10% cooldown reduction", "Unique: +20% spell vamp", "", "", "", "", "Magic > Ability Power \nMagic > Cooldown Reduction", "2500g (440g)", "1400g");
		itemsArray[171] = new items("Wit's End", "Common", "Advanced", "+42% attack speed \n+25 magic resistance", "Unique: Basic attacks deal 42 bonus magic damage on hit.", "Unique: Basic attacks increase your magic resistance by 5 for 5 seconds and reduce the target's magic resistance by 5 on hit (stacks up to 5 times).", "", "", "", "Attack > Attack Speed \nDefense > Magic Resist", "2400g (700g)", "1680g");
		itemsArray[172] = new items("Wooglet's Witchcap",
		itemsArray[173] = new items("Wriggle's Lantern",
		itemsArray[174] = new items("Youmuu's Ghostblade", "Common", "Legendary", "+30 attack damage \n+15% critical strike chance \n+10% cooldown reduction", "Unique: +20 armor penetration", "Unique Active: Gain +40% attack speed and +20% movement speed for 6 seconds. 45 second cooldown", "", "", "", "Attack > Attack Speed \nAttack > Critical Strike \nAttack > Damage \nMagic > Cooldown Reduction \nMovement > Other Movement Items", "2700g (563g)", "1890g");
		itemsArray[175] = new items("Zeal",
		itemsArray[176] = new items("Zeke's Herald", "Common", "Legendary", "+250 health \n+20% cooldown reduction", "Unique Aura: Nearby allied champions gain +20 attack damage and +10% life steal. (1100 range).", "", "", "", "", "Attack > Damage \nAttack > Life Steal \nDefense > Health \nMagic > Cooldown Reduction", "2550g (900g)", "1785g");
		itemsArray[177] = new items("Zephyr", "Summoner's Rift", "Legendary", "+25 attack damage \n+50% attack speed \n+10% movement speed \n+10% cooldown reduction", "Unique Passive - Tenacity: The duration of stuns, slows, taunts, fears, silences, blinds, polymorphs, and immobilizes are reduced by 35%.", "", "", "", "", "Attack > Damage \nAttack > Attack Speed \nMagic > Cooldown Reduction \nMovement > Other Movement Items", "2850g (725g)", "1995g");
		itemsArray[178] = new items("Zhonya's Hourglass", "Summoner's Rift \nHowling Abyss", "Legendary", "+120 ability power \n+50 armor", "Unique Active - Statis: Champion becomes invulnerable and untargetable for 2.5 seconds, but is unable to move, attack, cast spells, or use items during this time (90 second cooldown).", "", "", "", "", "Magic > Abilty Power \nDefense > Armor", "3260g (500g)", "2282g");		
		*/



		
		
	}
	
	public static void main(String[] args) {
		
    //keep empty		

	}


}
