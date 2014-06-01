/**
 * This file is part of StaticWorld.
 *
 * StaticWorld is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * StaticWorld is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with StaticWorld.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.foxelbox.staticworld;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class StaticWorld extends JavaPlugin implements Listener {
	@Override public void onEnable() { Bukkit.getServer().getPluginManager().registerEvents(this, this); }

	@EventHandler public void onPhysics(BlockPhysicsEvent event) { event.setCancelled(true); }
	@EventHandler public void onLeavesDecay(LeavesDecayEvent event) { event.setCancelled(true); }
	@EventHandler public void onBlockFade(BlockFadeEvent event) { event.setCancelled(true); }
	@EventHandler public void onBlockGrow(BlockGrowEvent event) { event.setCancelled(true); }
	@EventHandler public void onBlockFromTo(BlockFromToEvent event) { event.setCancelled(true); }
	@EventHandler public void onBlockBurnEvent(BlockBurnEvent event) { event.setCancelled(true); }
	@EventHandler public void onBlockIgniteEvent(BlockIgniteEvent event) { event.setCancelled(true); }
	@EventHandler public void onItemDropEvent(PlayerDropItemEvent event) { event.setCancelled(true); }
    @EventHandler public void onPlayerBucketEmpty(PlayerBucketEmptyEvent event) { event.setCancelled(true); }
    @EventHandler public void onPlayerBucketFill(PlayerBucketFillEvent event) { event.setCancelled(true); }
    @EventHandler public void onBlockPlace(BlockPlaceEvent event) { event.setCancelled(true); }
    @EventHandler public void onBlockBreak(BlockBreakEvent event) { event.setCancelled(true); }

	@EventHandler public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.getInventory().clear();
		player.setGameMode(GameMode.ADVENTURE);
	}

	@EventHandler public void onPlayerDamage(EntityDamageByEntityEvent event) {
		event.setCancelled(true);
		event.setDamage(0);
	}
}
