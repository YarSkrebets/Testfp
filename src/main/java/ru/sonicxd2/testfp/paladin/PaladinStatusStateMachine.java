package ru.sonicxd2.testfp.paladin;

import org.bukkit.plugin.java.JavaPlugin;

public class PaladinStatusStateMachine {
    private JavaPlugin plugin;
    private int currentStatus;
    private PaladinStatus[] values = PaladinStatus.values();

    public PaladinStatusStateMachine(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public void nextStatus() {
        values[currentStatus].getStatusHandler().onDisable(this);
        currentStatus = ++currentStatus % values.length;
        PaladinStatus value = values[currentStatus];
        value.getStatusHandler().onEnable(this);
    }
}
