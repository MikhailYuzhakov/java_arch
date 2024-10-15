package ru.gb.applicationlayer;

import ru.gb.datalayer.DataReader;
import ru.gb.datalayer.DataRepository;
import ru.gb.models.Alert;

public class EventListener implements IEventListener {
    private final IDataProcessor processor;

    public EventListener() {
        processor = new DataProcessor(DataRepository.getInstance(), DataReader.getInstance());
    }

    @Override
    public Alert alertSituationMonitoring() {
        processor.getData(); //что-то делаем с данными
        System.out.println("alertSituationMonitoring");
        return new Alert("Test alert");
    }
}
