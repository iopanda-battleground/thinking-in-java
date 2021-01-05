package com.iopanda.battleground.cp21.h05;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) throws SocketException {
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        Enumeration<NetworkInterface> ni = NetworkInterface.getNetworkInterfaces();

        while(ni.hasMoreElements()){
            NetworkInterface n = ni.nextElement();
            System.out.print(n.getName() + "\t");
            System.out.print(n.getDisplayName() + "\t");
            System.out.print(n.getInetAddresses() + "\t");
            System.out.println(n.getInterfaceAddresses());
        }
    }
}
