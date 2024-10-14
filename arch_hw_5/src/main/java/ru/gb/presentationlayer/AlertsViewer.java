package ru.gb.presentationlayer;

import ru.gb.applicationlayer.IEventListener;
import ru.gb.models.Alert;

public class AlertsViewer implements IAlertsViewer{
    private IEventListener eventListener;

    @Override
    public void action() {
        System.out.println("actionEventListener");
        Alert alert = eventListener.alertSituationMonitoring();
        System.out.println(alert);
    }
}
