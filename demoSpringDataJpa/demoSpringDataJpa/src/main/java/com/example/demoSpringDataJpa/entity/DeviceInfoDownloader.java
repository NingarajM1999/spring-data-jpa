package com.example.demoSpringDataJpa.entity;

public class DeviceInfoDownloader {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");
        String deviceName = System.getProperty("user.name");

        System.out.println("Operating System: " + osName);
        System.out.println("Operating System Version: " + osVersion);
        System.out.println("Operating System Architecture: " + osArch);
        System.out.println("Device Name: " + deviceName);
    }
}
