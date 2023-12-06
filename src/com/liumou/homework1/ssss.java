package com.liumou.homework1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ssss {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }
}
