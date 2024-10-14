package ru.gb.applicationlayer;

import ru.gb.models.Metric;

public interface IReportCollector {
    public Metric calculateMetrics();
}
