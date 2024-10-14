package ru.gb.datalayer;

import ru.gb.models.Data;

import java.util.List;

public interface IDataRepository {
    public List<Data> readAll();
    public void delete(int id);
    public void update(Data data, int id);
    public void save(Data data);
}
