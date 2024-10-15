package ru.gb.presentationlayer;

import ru.gb.applicationlayer.IReportCollector;
import ru.gb.applicationlayer.ReportCollector;
import ru.gb.models.Metric;

public class ReportViewer implements IReportViewer {
    private final IReportCollector reportCollector;

    public ReportViewer() {
        reportCollector = new ReportCollector();
    }

    @Override
    public void buildReport() {
        System.out.println("buildReport");
        Metric metric = reportCollector.calculateMetrics();
        System.out.println(metric);
    }
}
