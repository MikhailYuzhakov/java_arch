package ru.gb.applicationlayer;

import ru.gb.common.IPAddress;
import ru.gb.datalayer.IDataReader;
import ru.gb.datalayer.IDataRepository;
import ru.gb.models.Data;
import ru.gb.models.Temperature;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataProcessor implements IDataProcessor {
    private final IDataRepository repository;
    private final IDataReader dataReader;
    private final List<Data> data;

    public DataProcessor(IDataRepository repository, IDataReader dataReader) {
        this.repository = repository;
        this.dataReader = dataReader;
        data = new ArrayList<>();
    }

    @Override
    public List<Data> convertStringToData(IPAddress ipAddress, int port) {
        dataReader.getSensorsData(ipAddress, port);
        Data data1 = new Temperature(25.42, new Date());
        data.add(data1);
        return data;
    }

    @Override
    public void saveData() {
        for (Data d : data) {
            repository.save(d);
        }
    }

    @Override
    public Graphics2D processGraphData() {
        System.out.println("Process graph data");
        return null;
    }

    @Override
    public List<Data> processTableData() {
        System.out.println("Process table data");
        return null;
    }

    @Override
    public List<Data> getData() {
        return this.data;
    }
}
