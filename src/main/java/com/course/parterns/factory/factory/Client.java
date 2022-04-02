package com.course.parterns.factory.factory;

import com.course.parterns.factory.factory.factories.samsung.GalaxyA32Factory;
import com.course.parterns.factory.factory.factories.samsung.GalaxyA735GFactory;
import com.course.parterns.factory.factory.factories.xiaomi.RedmiNote11Factory;
import com.course.parterns.factory.factory.factories.xiaomi.RedmiNote8Factory;

public class Client {
    public static void main(String[] args) {
        RedmiNote8Factory redmiNote8Factory = new RedmiNote8Factory();
        redmiNote8Factory.orderDevice();

        RedmiNote11Factory redmiNote11Factory = new RedmiNote11Factory();
        redmiNote11Factory.orderDevice();

        GalaxyA32Factory galaxyA32Factory = new GalaxyA32Factory();
        galaxyA32Factory.orderDevice();

        GalaxyA735GFactory galaxyA735GFactory = new GalaxyA735GFactory();
        galaxyA735GFactory.orderDevice();
    }
}
