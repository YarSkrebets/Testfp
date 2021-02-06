package ru.sonicxd2.testfp.paladin;

public enum PaladinStatus {
    ВОЗРОДИЛСЯ(new SayAndWaitPaladinStatusHandler("УРА Я ВОЗРОДИЛСЯ", 20)),
    ПОНЫТЬ_ПРО_ПУЛ(new SayAndWaitPaladinStatusHandler("НУ ВОТ КТО ЭТО СПУЛЛИЛ СУКИ", 10)),
    БАБЛ(new SayAndWaitPaladinStatusHandler("БЛЯТЬ ЖМУ БАБЛ ПИЗДЕЦ КОМАНДА ПИДОРАСОВ", 40)),
    ПОКИНУЛ_ТЕЛО(new SayAndWaitPaladinStatusHandler("ОЙ ИДИТЕ НАХУЙ Я ЛЕТЧИК", 10));

    private PaladinStatusHandler statusHandler;
    PaladinStatus(PaladinStatusHandler paladinStatusHandler) {
        this.statusHandler = paladinStatusHandler;
    }

    public PaladinStatusHandler getStatusHandler() {
        return statusHandler;
    }
}
