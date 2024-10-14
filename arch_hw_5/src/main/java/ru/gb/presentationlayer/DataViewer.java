package ru.gb.presentationlayer;

import ru.gb.applicationlayer.IDataProcessor;
import ru.gb.models.Data;

import java.awt.*;
import java.util.List;

public class DataViewer implements IDataViewer {
    private IDataProcessor dataProcessor;

    @Override
    public void buildTable() {
        System.out.println("buildTable");
        List<Data> tableData = dataProcessor.processTableData();
        System.out.println("TABLE\n==========================================\n\n==========================================");
        for (Data d : tableData)
            System.out.println(d);
    }

    @Override
    public void buildGraph() {
        System.out.println("buildGraph");
        Graphics2D graphics2D = dataProcessor.processGraphData();
        graphics2D.drawString("GRAPH", 0, 0);
    }
}
