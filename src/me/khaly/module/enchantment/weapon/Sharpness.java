package me.khaly.module.enchantment.weapon;

import org.bukkit.event.entity.EntityDamageByEntityEvent;

import me.khaly.core.enchantment.ItemEnchantment;
import me.khaly.core.enums.EnchantCastType;
import me.khaly.core.enums.EnchantmentCategory;
import me.khaly.core.enums.ItemType;
import me.khaly.core.util.MathUtils;

public class Sharpness extends ItemEnchantment {

	public Sharpness() {
		super("sharpness", "Filo", 101, EnchantCastType.ON_DAMAGE);
		
		this.setMaxLevel(5);
		this.addAllowedTypes(ItemType.WEAPON, ItemType.WAND);
		this.setCategory(EnchantmentCategory.WEAPON);
		
		this.setFunction((user, function) -> {
			EntityDamageByEntityEvent event = (EntityDamageByEntityEvent) function.getEvent();
			double damage = event.getDamage();
			int level = function.getLevel();
			double percentage = (0.573 * level);
			double result = MathUtils.increaseByPercentage(damage, percentage);
			event.setDamage(result);
			//user.sendMessage("&cResult: &f"+(int) result + " &e["+ (int) percentage +"%]");
		});
	}

}

