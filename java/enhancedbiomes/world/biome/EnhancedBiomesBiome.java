package enhancedbiomes.world.biome;

import static net.minecraftforge.common.BiomeDictionary.registerBiomeType;
import static enhancedbiomes.world.biome.EnhancedBiomesArchipelago.*;
import static enhancedbiomes.world.biome.EnhancedBiomesGrass.*;
import static enhancedbiomes.world.biome.EnhancedBiomesPlains.*;
import static enhancedbiomes.world.biome.EnhancedBiomesRock.*;
import static enhancedbiomes.world.biome.EnhancedBiomesSand.*;
import static enhancedbiomes.world.biome.EnhancedBiomesSandstone.*;
import static enhancedbiomes.world.biome.EnhancedBiomesSnow.*;
import static enhancedbiomes.world.biome.EnhancedBiomesTropical.*;
import static enhancedbiomes.world.biome.EnhancedBiomesWetland.*;
import static enhancedbiomes.world.biome.EnhancedBiomesWoodland.*;
import static enhancedbiomes.helpers.EBHeights.*;

import java.io.File;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.BiomeDictionary.Type;
import enhancedbiomes.blocks.EnhancedBiomesBlocks;
import enhancedbiomes.world.biome.base.BiomeGenEBBase;
import enhancedbiomes.world.biome.base.BiomeGenRiparianZone;
import enhancedbiomes.world.biomestats.BiomeIDs;
import enhancedbiomes.world.biomestats.BiomeWoods;

public class EnhancedBiomesBiome 
{	
	public static boolean volcanoGen;
	
	public static void config() {
		File configFile = new File("config/Enhanced Biomes/Biomes.cfg");
		Configuration config = new Configuration(configFile);
		config.load();

		volcanoGen = config.get(config.CATEGORY_GENERAL, "Generate Volcanoes throughout the world", true).getBoolean(true);
		
		config.save();
		
		EnhancedBiomesArchipelago.config();
		EnhancedBiomesGrass.config();
		EnhancedBiomesSand.config();
		EnhancedBiomesSnow.config();
		EnhancedBiomesWasteland.config();
		EnhancedBiomesWetland.config();
		EnhancedBiomesWoodland.config();
	}
	
	public static void load() {
		EnhancedBiomesArchipelago.load();
		EnhancedBiomesGrass.load();
		EnhancedBiomesSand.load();
		EnhancedBiomesSnow.load();
		EnhancedBiomesWasteland.load();
		EnhancedBiomesWetland.load();
		EnhancedBiomesWoodland.load();
	}
}
