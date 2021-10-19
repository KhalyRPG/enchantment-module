package me.khaly.module.enchantment;

import me.khaly.core.module.Module;

public class EnchantmentModule extends Module {

	public EnchantmentModule() {
		super("Enchantment", "enchantment", 0.1F);
	}

	@Override
	public void load() {
		log("Loaded");
	}

	@Override
	public void unload() {
		log("Unloaded");
	}

}
