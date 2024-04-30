package com.teamabnormals.upgrade_aquatic.core.other.tags;

import com.teamabnormals.blueprint.core.util.TagUtil;
import com.teamabnormals.upgrade_aquatic.core.UpgradeAquatic;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class UABiomeTags {
	public static final TagKey<Biome> HAS_NAUTILUS = biomeTag("has_spawn/nautilus");
	public static final TagKey<Biome> HAS_LIONFISH = biomeTag("has_spawn/lionfish");
	public static final TagKey<Biome> HAS_PIKE = biomeTag("has_spawn/pike");
	public static final TagKey<Biome> HAS_PERCH = biomeTag("has_spawn/perch");
	public static final TagKey<Biome> HAS_SQUID = biomeTag("has_spawn/squid");

	public static final TagKey<Biome> HAS_JELLYFISH = biomeTag("has_spawn/jellyfish");
	public static final TagKey<Biome> HAS_CASSIOPEA_JELLYFISH = biomeTag("has_spawn/cassiopea_jellyfish");

	public static final TagKey<Biome> HAS_THRASHER = biomeTag("has_spawn/thrasher");
	public static final TagKey<Biome> HAS_GREAT_THRASHER = biomeTag("has_spawn/great_thrasher");

	public static final TagKey<Biome> HAS_BEACHGRASS = biomeTag("has_feature/beachgrass");
	public static final TagKey<Biome> HAS_SEAROCKET = biomeTag("has_feature/searocket");
	public static final TagKey<Biome> HAS_RIVER_TREE = biomeTag("has_feature/river_tree");
	public static final TagKey<Biome> HAS_FLOWERING_RUSH = biomeTag("has_feature/flowering_rush");
	public static final TagKey<Biome> HAS_PRISMARINE_CORAL = biomeTag("has_feature/prismarine_coral");
	public static final TagKey<Biome> HAS_AMMONITE_ORE = biomeTag("has_feature/ammonite_ore");

	public static final TagKey<Biome> HAS_PICKERELWEED = biomeTag("has_feature/pickerelweed");
	public static final TagKey<Biome> HAS_EXTRA_PICKERELWEED = biomeTag("has_feature/pickerelweed_extra");

	public static final TagKey<Biome> HAS_DRIFTWOOD = biomeTag("has_feature/driftwood");
	public static final TagKey<Biome> HAS_BEACH_DRIFTWOOD = biomeTag("has_feature/driftwood_beach");
	public static final TagKey<Biome> HAS_RIVER_DRIFTWOOD = biomeTag("has_feature/driftwood_river");
	public static final TagKey<Biome> HAS_SWAMP_DRIFTWOOD = biomeTag("has_feature/driftwood_swamp");
	public static final TagKey<Biome> HAS_EXTRA_DRIFTWOOD = biomeTag("has_feature/driftwood_extra");

	public static final TagKey<Biome> HAS_UNDERWATER_CANYON = biomeTag("has_carver/underwater_canyon");

	private static TagKey<Biome> biomeTag(String name) {
		return TagUtil.biomeTag(UpgradeAquatic.MOD_ID, name);
	}
}
