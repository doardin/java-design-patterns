package com.course.parterns.factory.factory;

import com.course.parterns.factory.factory.samsung.GalaxyA32Factory;
import com.course.parterns.factory.factory.samsung.GalaxyA735GFactory;
import com.course.parterns.factory.factory.xiaomi.RedmiNote11Factory;
import com.course.parterns.factory.factory.xiaomi.RedmiNote8Factory;
import com.course.parterns.factory.model.samsung.GalaxyA32;
import com.course.parterns.factory.model.samsung.GalaxyA735G;
import com.course.parterns.factory.model.xiaomi.RedmiNote11;
import com.course.parterns.factory.model.xiaomi.RedmiNote8;

public class Client {
    public static void main(String[] args) {
        RedmiNote8Factory redmiNote8Factory = new RedmiNote8Factory();
        RedmiNote8 redmiNote8 = (RedmiNote8) redmiNote8Factory.createDevice();
        redmiNote8.getHardware();

        RedmiNote11Factory redmiNote11Factory = new RedmiNote11Factory();
        RedmiNote11 redmiNote11 = (RedmiNote11) redmiNote11Factory.createDevice();
        redmiNote11.getHardware();

        GalaxyA32Factory galaxyA32Factory = new GalaxyA32Factory();
        GalaxyA32 galaxyA32 = (GalaxyA32) galaxyA32Factory.createDevice();
        galaxyA32.getHardware();

        GalaxyA735GFactory galaxyA735GFactory = new GalaxyA735GFactory();
        GalaxyA735G galaxyA735G = (GalaxyA735G) galaxyA735GFactory.createDevice();
        galaxyA735G.getHardware();
    }
}
