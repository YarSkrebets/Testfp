package ru.sonicxd2.testfp.paladin;

public interface PaladinStatusHandler {
    void onEnable(PaladinStatusStateMachine machine);

    void onDisable(PaladinStatusStateMachine machine);
}
