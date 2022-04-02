package com.course.parterns.factory.simple;

import com.course.parterns.factory.simple.factories.DeviceFactory;

public class Client {
    public static void main(String[] args) {
        DeviceFactory.orderDevice("Samsung", "standard");
        DeviceFactory.orderDevice("Samsung", "high-end");

        DeviceFactory.orderDevice("Xiaomi", "standard");
        DeviceFactory.orderDevice("Xiaomi", "high-end");
    }
}
