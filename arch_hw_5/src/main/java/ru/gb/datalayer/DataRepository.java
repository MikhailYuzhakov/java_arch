package ru.gb.datalayer;

import ru.gb.models.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DataRepository implements IDataRepository {
    private final List<Data> data = new ArrayList<>();

    private DataRepository() {
        data.add(new Temperature(25.63, Calendar.getInstance().getTime()));
        data.add(new Pressure(768.13, Calendar.getInstance().getTime()));
        data.add(new RawMaterial(10.0, Calendar.getInstance().getTime()));
        data.add(new Beer(15.0, Calendar.getInstance().getTime()));
    }

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

    private static class RepositoryHolder {
        public static final DataRepository HOLDER_INSTANCE = new DataRepository();
    }

    public static DataRepository getInstance() {
        return RepositoryHolder.HOLDER_INSTANCE;
    }
}
