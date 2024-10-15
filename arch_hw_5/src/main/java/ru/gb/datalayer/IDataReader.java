package ru.gb.datalayer;

import ru.gb.common.IPAddress;

public interface IDataReader {
    public String getSensorsData(IPAddress ipAddress, int port);
    public boolean isServerAvailable(IPAddress ipAddress, int port);
    public IPAddress getIPAddress();
    public int getPort();
}
