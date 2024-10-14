package ru.gb.common;

import java.util.Arrays;

public class IPAddress {
    private int[] ipAddress;
    private final int LENGTH = 4;

    public IPAddress(String sIPAddress) {
        ipAddress = new int[LENGTH];
        ipAddress[0] = 192;
        ipAddress[1] = 168;
        ipAddress[2] = 10;
        ipAddress[3] = 173;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            sb.append(ipAddress[i]).append(".");
        }
        sb.deleteCharAt(sb.length());
        return sb.toString();
    }
}
