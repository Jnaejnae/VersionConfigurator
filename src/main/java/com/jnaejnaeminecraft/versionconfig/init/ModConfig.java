/**
    Copyright (C) 2017 by jabelar

    This file is part of jabelar's Minecraft Forge modding examples; as such,
    you can redistribute it and/or modify it under the terms of the GNU
    General Public License as published by the Free Software Foundation,
    either version 3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    For a copy of the GNU General Public License see <http://www.gnu.org/licenses/>.
*/
package com.jnaejnaeminecraft.versionconfig.init;

import java.io.File;

import com.jnaejnaeminecraft.versionconfig.MainMod;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// TODO: Auto-generated Javadoc
public class ModConfig
{
	public static final String CATEGORY_1_12_X = "Configure Version 1.12.x";
	public static final String CATEGORY_1_11_X = "Configure Version 1.11.x";
	public static final String CATEGORY_1_10_X = "Configure Version 1.10.x";
	public static final String CATEGORY_1_9_X = "Configure Version 1.9.x";
	public static final String CATEGORY_1_8_X = "Configure Version 1.8.x";
	public static final String CATEGORY_1_7_X = "Configure Version 1.7.x";
	public static final String CATEGORY_1_6_X = "Configure Version 1.6.x";
	public static final String CATEGORY_1_5_X = "Configure Version 1.5.x";
	public static final String CATEGORY_1_4_X = "Configure Version 1.4.x";
	public static final String CATEGORY_1_3_X = "Configure Version 1.3.x";
	public static final String CATEGORY_1_2_X = "Configure Version 1.2.x";
	public static final String CATEGORY_B_1_8_X = "Configure Version Beta 1.8.x";
	public static final String CATEGORY_A_1_2_X = "Configure Version Alpha 1.2.x";
    // set up configuration properties (will be read from config file in preInit)
    public static File configFile;
    public static Configuration config;
//    public static boolean allowDeconstructUnrealistic = false;
//    public static boolean allowDeconstructEnchantedBooks = true;
//    public static boolean allowHorseArmorCrafting = true;
//    public static boolean allowPartialDeconstructing = true;
    // Mob Toggles
    // public static boolean allowSpawnZombie = true;
    public static boolean allowSpawnPigZombie = true;
    public static boolean allowExperience = true;
    public static boolean allowSpawnZombieVillager = true;
    public static boolean allowSpawnHorse = true;
    public static boolean allowBabyZombie = true;
    public static boolean allowBabyPigZombie = true;
    public static boolean allowBabyZombieVillager  = true;
    public static boolean allowSpawnEndermite = true;
    public static boolean allowSpawnElderGuardian = true;
    public static boolean allowSpawnGuardian = true;
    public static boolean allowSpawnRabbit = true;
    public static boolean allowSpawnShulker = true;
    public static boolean allowSpawnStray = true;
    public static boolean allowSpawnHusk = true;
    public static boolean allowBabyHusk  = true;
    public static boolean allowSpawnEnderman = true;
    public static boolean allowSpawnPolarBear = true;
    public static boolean allowSpawnVindicator = true;
    public static boolean allowSpawnEvoker = true;
    public static boolean allowSpawnLlama = true;
    public static boolean allowSpawnParrot = true;
    public static boolean allowSpawnVex = true;
    
    /**
     * Process the configuration.
     *
     * @param event
     *            the event
     */
    public static void initConfig(FMLPreInitializationEvent event)
    {
        // might need to use suggestedConfigFile (event.getSuggestedConfigFile) location to publish
        configFile = event.getSuggestedConfigurationFile();
        // DEBUG
        System.out.println(MainMod.MODNAME + " config path = " + configFile.getAbsolutePath());
        System.out.println("Config file exists = " + configFile.canRead());

        config = new Configuration(configFile);

        syncConfig();
    }

    /**
     * Sync config.
     */
    /*
     * sync the configuration want it public so you can handle case of changes made in-game
     */
    public static void syncConfig()
    {
        config.load();
//        allowDeconstructUnrealistic = config.get(Configuration.CATEGORY_GENERAL, "All Craftables Can Deconstruct", false,
//                "Allow unrealistic deconstruction like pumpkins back from pumpkin seeds").getBoolean(false);
        // DEBUG
//        System.out.println("Allow unrealistic deconstruction = " + allowDeconstructUnrealistic);
//        allowHorseArmorCrafting = config
//                .get(Configuration.CATEGORY_GENERAL, "Can Craft Horse Armor", true, "Allow crafting of horse armor and SADDLEs").getBoolean(true);
//        // DEBUG
//        System.out.println("Allow horse armor crafting = " + allowHorseArmorCrafting);
//        allowDeconstructEnchantedBooks = config
//                .get(Configuration.CATEGORY_GENERAL, "Can Deconstruct Enchanted Books", true, "Allow enchanted books to deconstruct like a regular book")
//                .getBoolean(true);
//        // DEBUG
//        System.out.println("Allow enchanted book deconstruction = " + allowDeconstructEnchantedBooks);
//        allowPartialDeconstructing = config
//                .get(Configuration.CATEGORY_GENERAL, "Allow Partial Deconstruction", true, "Allow deconstruction of stacks that are less than crafting output")
//                .getBoolean(true);
//        // DEBUG
//        System.out.println("Allow partial deconstruction = " + allowPartialDeconstructing);
        
        // Zombie Pigman
        allowSpawnPigZombie = config
                .get(CATEGORY_A_1_2_X, "Allow Zombie Pigman Spawning", true, "Allows Zombie Pigman Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Zombie Pigman Spawning = " + allowSpawnPigZombie);
        
        // Experience
        allowExperience = config
                .get(CATEGORY_B_1_8_X, "Allow Experience Mechanic", true, "Allows XP Orbs and Leveling Up")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Experience Mechanic = " + allowExperience);
        
        // Enderman
        allowSpawnEnderman = config
                .get(CATEGORY_B_1_8_X, "Allow Enderman", true, "Allows Enderman")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Enderman Spawning = " + allowSpawnEnderman);
        
        // Zombie Villager
        allowSpawnZombieVillager = config
                .get(CATEGORY_1_4_X, "Allow Zombie Villager Spawning", true, "Allows Zombie Villager Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Zombie Villager Spawning = " + allowSpawnZombieVillager);
        
        // Horse
        allowSpawnHorse = config
                .get(CATEGORY_1_6_X, "Allow Horse Spawning", true, "Allows Horse Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Horse Spawning = " + allowSpawnHorse);
        
        // Zombie Villager Baby
        allowBabyZombieVillager = config
                .get(CATEGORY_1_6_X, "Allow Zombie Villager Baby", true, "Convert Baby Zombie Villager To Adults")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Zombie Villager Baby = " + allowBabyZombieVillager);
        
        // Zombie Baby        
        allowBabyZombie = config
                .get(CATEGORY_1_6_X, "Allow Zombie Baby", true, "Convert Baby Zombie To Adults")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Zombie Baby = " + allowBabyZombie);
        
        // Zombie Pigman Baby
        allowBabyPigZombie = config
                .get(CATEGORY_1_6_X, "Allow Zombie Pigman Baby", true, "Convert Baby Zombie Pigman To Adults")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Zombie Pigman Baby = " + allowBabyPigZombie);
        
        // Endermite
        allowSpawnEndermite = config
                .get(CATEGORY_1_8_X, "Allow Endermite Spawning", true, "Allows Endermite Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Endermite Spawning = " + allowSpawnEndermite);
        
        // Elder Guardian
        allowSpawnElderGuardian = config
                .get(CATEGORY_1_8_X, "Allow Guardian Elder Spawning", true, "Allows Elder Guardian Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Guardian Elder Spawning = " + allowSpawnElderGuardian);
        
        // Guardian
        allowSpawnGuardian = config
                .get(CATEGORY_1_8_X, "Allow Guardian Spawning", true, "Allows Guardian Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Guardian Spawning = " + allowSpawnGuardian);
        
        // Rabbit
        allowSpawnRabbit = config
                .get(CATEGORY_1_8_X, "Allow Rabbit Spawning", true, "Allows Rabbit Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Rabbit Spawning = " + allowSpawnRabbit);
        
        // Shulker
        allowSpawnShulker = config
                .get(CATEGORY_1_9_X, "Allow Shulker Spawning", true, "Allows Shulker Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Shulker Spawning = " + allowSpawnShulker);
        
        // Stray
        allowSpawnStray = config
                .get(CATEGORY_1_10_X, "Allow Stray Spawning", true, "Allows Stray Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Stray Spawning = " + allowSpawnStray);
        
        // Husk
        allowSpawnHusk = config
                .get(CATEGORY_1_10_X, "Allow Husk Spawning", true, "Allows Husk Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Husk Spawning = " + allowSpawnHusk);
        
        // Husk Baby
        allowBabyHusk = config
                .get(CATEGORY_1_10_X, "Allow Husk Baby", true, "Convert Baby Husk To Adults")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Baby Husk = " + allowBabyHusk);
        
        // PolarBear
        allowSpawnPolarBear = config
                .get(CATEGORY_1_10_X, "Allow PolarBear Spawning", true, "Allow PolarBear Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow PolarBear Spawning = " + allowSpawnPolarBear);
        
        // Vindicator
        allowSpawnVindicator = config
                .get(CATEGORY_1_11_X, "Allow Vindicator Spawning", true, "Allow Vindicator Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Vindicator Spawning = " + allowSpawnVindicator);
        
        // Evoker
        allowSpawnEvoker = config
                .get(CATEGORY_1_11_X, "Allow Evoker Spawning", true, "Allow Evoker Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Evoker Spawning = " + allowSpawnEvoker);
        
        // Vex
        allowSpawnVex = config
                .get(CATEGORY_1_11_X, "Allow Vex Spawning", true, "Allow Vex Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Vex Spawning = " + allowSpawnVex);
        
        // Llama
        allowSpawnLlama = config
                .get(CATEGORY_1_11_X, "Allow Llama Spawning", true, "Allow Llama Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Llama Spawning = " + allowSpawnLlama);
        
        // Parrot
        allowSpawnParrot = config
                .get(CATEGORY_1_12_X, "Allow Parrot Spawning", true, "Allow Parrot Spawning")
                .getBoolean(true);
        // DEBUG
        System.out.println("Allow Parrot Spawning = " + allowSpawnParrot);
        
        // save is useful for the first run where config might not exist, and doesn't hurt
        config.save();
    }
}
