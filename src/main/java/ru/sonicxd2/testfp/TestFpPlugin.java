package ru.sonicxd2.testfp;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestFpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        PlayerCustomActionManager customActionManager = new PlayerCustomActionManager();
        customActionManager.init(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
