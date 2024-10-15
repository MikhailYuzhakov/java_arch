package ru.gb.applicationlayer;

import ru.gb.common.IPAddress;
import ru.gb.models.Data;

import java.awt.*;
import java.util.List;

public interface IDataProcessor {
    public void saveData();
    public Graphics2D processGraphData();
    public List<Data> processTableData();
    public List<Data> getData();
}
