package ru.gb.applicationlayer;

import ru.gb.models.Alert;

public class EventListener implements IEventListener {
    private IDataProcessor processor;
    @Override
    public Alert alertSituationMonitoring() {
        processor.getData(); //что-то делаем с данными
        System.out.println("alertSituationMonitoring");
        return new Alert("Test alert");
    }
}
