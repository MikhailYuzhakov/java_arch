package ru.gb.models;

/**
 * Тут показатели: производительность, брак и пр.
 */
public class Metric {
    private String metricData = "Some metric data";
    public Metric() {}

    public Metric(String metricData) {
        this.metricData = metricData;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "metricData='" + metricData + '\'' +
                '}';
    }
}
