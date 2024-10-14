package ru.gb.datalayer;

import netscape.javascript.JSObject;
import ru.gb.common.IPAddress;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataReader implements IDataReader {
    private final IPAddress ipAddress;
    private final int port;

    public DataReader(IPAddress ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public IPAddress getIpAddress() {
        return ipAddress;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String getSensorsData(IPAddress ipAddress, int port) {
        return "{\"temp\" : 24.54, \"pressure\" : 768.3}";
    }

    @Override
    public boolean isServerAvailable(IPAddress ipAddress, int port) {
        return true;
    }
}
