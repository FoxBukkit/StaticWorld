package de.doridian.staticworld;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class StaticWorld extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onPhysics(BlockPhysicsEvent event) {
		event.setCancelled(true);
	}

	@EventHandler
	public void onLeavesDecay(LeavesDecayEvent event) {
		event.setCancelled(true);
	}

	@EventHandler
	public void onBlockFade(BlockFadeEvent event) {
		event.setCancelled(true);
	}

	@EventHandler
	public void onBlockGrow(BlockGrowEvent event) {
		event.setCancelled(true);
	}

	@EventHandler
	public void onBlockFromTo(BlockFromToEvent event) {
		event.setCancelled(true);
	}

	@EventHandler
	public void onBlockBurnEvent(BlockBurnEvent event) {
		event.setCancelled(true);
	}

	@EventHandler
	public void onBlockIgniteEvent(BlockIgniteEvent event) {
		event.setCancelled(true);
	}

	@EventHandler
	public void onItemDropEvent(PlayerDropItemEvent event) {
		event.setCancelled(true);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.getInventory().clear();
		player.setGameMode(GameMode.ADVENTURE);
	}

	@EventHandler
	public void onPlayerDamage(EntityDamageByEntityEvent event) {
		event.setCancelled(true);
		event.setDamage(0);
	}
}
