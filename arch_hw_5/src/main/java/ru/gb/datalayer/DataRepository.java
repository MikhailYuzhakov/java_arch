package ru.gb.datalayer;

import ru.gb.models.Data;

import java.util.ArrayList;
import java.util.List;

public class DataRepository implements IDataRepository {
    private final List<Data> data = new ArrayList<>();

    @Override
    public List<Data> readAll() {
        return data;
    }

    @Override
    public void delete(int id) {
        this.data.remove(id);
    }

    @Override
    public void update(Data data, int id) {
        this.data.add(id, data);
    }

    @Override
    public void save(Data data) {
        this.data.add(data);
    }
}
