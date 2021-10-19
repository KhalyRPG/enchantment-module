package me.khaly.module.enchantment.armor;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.khaly.core.enchantment.object.ItemEnchantment;
import me.khaly.core.enums.EnchantCastType;
import me.khaly.core.enums.EnchantmentCategory;
import me.khaly.core.enums.ItemType;

public class Adrenaline extends ItemEnchantment {

	public Adrenaline() {
		super("adrenaline", "Adrenalina", 495, EnchantCastType.ON_DAMAGE);
		
		this.setMaxLevel(3);
		this.addAllowedTypes(ItemType.ARMOR);
		this.setCategory(EnchantmentCategory.ARMOR);
		
		this.setFunction((user, function) -> {
			Player player = user.getBukkitPlayer();
			int effectLevel = (int) (2.7 * function.getLevel());
			if(!player.hasPotionEffect(PotionEffectType.REGENERATION)) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 5 * 20, effectLevel));
			}
		});
	}

}
