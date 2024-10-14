package ru.gb.models;

public class Alert {
    private String message;

    public Alert(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "message='" + message + '\'' +
                '}';
    }
}
