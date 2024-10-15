package ru.gb.presentationlayer;

import ru.gb.models.Data;

import java.util.List;

public interface IDataViewer {
    public void buildTable();
    public void buildGraph();
    public void saveData(List<Data> data);
}
