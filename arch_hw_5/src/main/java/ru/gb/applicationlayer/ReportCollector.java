package ru.gb.applicationlayer;

import ru.gb.datalayer.DataRepository;
import ru.gb.datalayer.IDataRepository;
import ru.gb.models.Metric;

public class ReportCollector implements IReportCollector {
    private final IDataRepository repository;

    public ReportCollector() {
        repository = DataRepository.getInstance();
    }

    @Override
    public Metric calculateMetrics() {
        repository.readAll();
        Metric metric = new Metric();
        System.out.println("calculateMetrics");
        return metric;
    }
}
