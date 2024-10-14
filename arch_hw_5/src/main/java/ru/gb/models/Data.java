package ru.gb.models;

import java.util.Date;

public abstract class Data {
    private Double value;
    private Date date;

    public Data(Double value, Date date) {
        this.value = value;
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                ", date=" + date +
                '}';
    }
}
