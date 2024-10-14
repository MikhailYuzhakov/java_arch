package ru.gb.applicationlayer;

import ru.gb.datalayer.IDataRepository;
import ru.gb.models.Metric;

public class ReportCollector implements IReportCollector {
    private IDataRepository repository;
    @Override
    public Metric calculateMetrics() {
        System.out.println("calculateMetrics");
        return new Metric();
    }
}
