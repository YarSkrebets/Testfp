package ru.sonicxd2.testfp;

import org.bukkit.entity.Player;

public interface PlayerAction {
    void apply(Player player);

    static PlayerAction KILL = player -> player.damage(20);
    static PlayerAction GLADITB = player -> player.sendMessage("МУРРР");

}
