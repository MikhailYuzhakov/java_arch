package ru.gb.applicationlayer;

import ru.gb.models.Alert;

public interface IEventListener {
    public Alert alertSituationMonitoring();
}
