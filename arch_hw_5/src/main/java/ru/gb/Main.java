package ru.gb;

import ru.gb.presentationlayer.*;

public class Main {
    public static void main(String[] args) {
        IReportViewer viewer = new ReportViewer();
        viewer.buildReport();

        IAlertsViewer alertsViewer = new AlertsViewer();
        alertsViewer.action();

        IDataViewer dataViewer = new DataViewer();
        dataViewer.buildGraph();
        dataViewer.buildTable();
    }
}