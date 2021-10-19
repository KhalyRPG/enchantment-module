package me.khaly.module.enchantment;

import java.util.Map;

import me.khaly.core.enchantment.object.ItemEnchantment;
import me.khaly.core.module.Module;
import me.khaly.module.enchantment.armor.Adrenaline;
import me.khaly.module.enchantment.armor.Protection;
import me.khaly.module.enchantment.weapon.Sharpness;

public class EnchantmentModule extends Module {

	public EnchantmentModule() {
		super("Enchantment", "enchantment", 0.1F);
	}

	@Override
	public void load() {
		loadEnchantment(
				// Weapons
				new Sharpness(),
				
				// Armor
				new Protection(),
				new Adrenaline()
				);
	}

	@Override
	public void unload() {
		Map<String, ItemEnchantment> cache = this.getProvider().getServices().getCache().getEnchantments();
		cache.clear();
	}
	
	private void loadEnchantment(ItemEnchantment...enchants) {
		Map<String, ItemEnchantment> cache = this.getProvider().getServices().getCache().getEnchantments();
		for(ItemEnchantment enchant : enchants) {
			cache.put(enchant.getID(), enchant);
		}
	}
	
}
