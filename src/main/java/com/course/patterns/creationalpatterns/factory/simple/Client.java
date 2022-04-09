package com.course.patterns.creationalpatterns.factory.simple;

import com.course.patterns.creationalpatterns.factory.simple.factories.DeviceFactory;

public class Client {
    public static void main(String[] args) {
        DeviceFactory.orderDevice("Samsung", "standard");
        DeviceFactory.orderDevice("Samsung", "high-end");

        DeviceFactory.orderDevice("Xiaomi", "standard");
        DeviceFactory.orderDevice("Xiaomi", "high-end");
    }
}
