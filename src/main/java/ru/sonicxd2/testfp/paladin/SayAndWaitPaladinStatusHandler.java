package ru.sonicxd2.testfp.paladin;

import org.bukkit.Bukkit;

public class SayAndWaitPaladinStatusHandler implements PaladinStatusHandler {
    private String message;
    private int ticksToWait;

    public SayAndWaitPaladinStatusHandler(String message, int ticksToWait) {
        this.message = message;
        this.ticksToWait = ticksToWait;
    }

    @Override
    public void onEnable(PaladinStatusStateMachine machine) {
        Bukkit.broadcastMessage(message);
        Bukkit.getScheduler().runTaskLater(machine.getPlugin(), machine::nextStatus, ticksToWait);
    }

    @Override
    public void onDisable(PaladinStatusStateMachine machine) {

    }
}
