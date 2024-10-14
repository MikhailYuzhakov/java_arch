package ru.gb.presentationlayer;

import ru.gb.applicationlayer.IReportCollector;
import ru.gb.models.Metric;

public class ReportViewer implements IReportViewer {
    private IReportCollector reportCollector;

    @Override
    public void buildReport() {
        System.out.println("buildReport");
        Metric metric = reportCollector.calculateMetrics();
        System.out.println(metric);
    }
}
