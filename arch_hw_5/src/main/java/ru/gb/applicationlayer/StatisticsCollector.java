package ru.gb.applicationlayer;

import ru.gb.datalayer.IDataRepository;
import ru.gb.models.Statistic;

public class StatisticsCollector implements IStatisticCollector {
    private IDataRepository repository;
    @Override
    public Statistic calculateStatistics() {
        System.out.println("calculateStatistics");
        return new Statistic();
    }
}
