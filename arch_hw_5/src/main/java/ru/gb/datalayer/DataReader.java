package ru.gb.datalayer;

import com.sun.source.tree.BreakTree;
import netscape.javascript.JSObject;
import ru.gb.common.IPAddress;
import ru.gb.presentationlayer.DataViewer;

import javax.print.DocFlavor;
import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataReader implements IDataReader {
    private final IPAddress ipAddress;
    private final int port;

    private DataReader() {
        this.ipAddress = new IPAddress("192.168.10.90");
        this.port = 9846;
    }

    @Override
    public IPAddress getIPAddress() {
        return ipAddress;
    }

    @Override
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

    private static class ReaderHolder {
        public static final DataReader READER_HOLDER = new DataReader();
    }

    public static DataReader getInstance() {
        return ReaderHolder.READER_HOLDER;
    }
}
