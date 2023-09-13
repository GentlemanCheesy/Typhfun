package net.typhonmc.typhfun.implementations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class CraftingMaterials implements Listener {
    //remove click-ability entirely from certain items
    @EventHandler
    public void clickEvent(PlayerInteractEvent event) {
        //unimplemented
    }
}
