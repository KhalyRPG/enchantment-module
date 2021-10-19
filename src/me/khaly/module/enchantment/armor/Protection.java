package me.khaly.module.enchantment.armor;

import me.khaly.core.enchantment.object.ItemEnchantment;
import me.khaly.core.enums.EnchantCastType;
import me.khaly.core.enums.EnchantmentCategory;
import me.khaly.core.enums.ItemType;

public class Protection extends ItemEnchantment {

	public Protection() {
		super("protection", "Protección", 501, EnchantCastType.ON_DAMAGE);
		
		this.setMaxLevel(5);
		this.addAllowedTypes(ItemType.ARMOR);
		this.setCategory(EnchantmentCategory.ARMOR);
		
		this.setFunction((user, function) -> {
			user.sendMessage("§cVOALÁH");
		});
	}

}