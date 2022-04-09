package com.course.patterns.factory.simple.factories;

import com.course.patterns.factory.model.Device;
import com.course.patterns.factory.model.samsung.GalaxyA32;
import com.course.patterns.factory.model.samsung.GalaxyA735G;
import com.course.patterns.factory.model.xiaomi.RedmiNote11;
import com.course.patterns.factory.model.xiaomi.RedmiNote8;

public class DeviceFactory {

    public static Device orderDevice(String brand, String level){
        Device device = null;

        if(brand.equals("Samsung")){
            if(level.equals("standard")) {
                device = new GalaxyA32();
            }

            if(level.equals("high-end")) {
                device = new GalaxyA735G();
            }
        }

        if(brand.equals("Xiaomi")){
            if(level.equals("standard")) {
                device = new RedmiNote8();
            }

            if(level.equals("high-end")) {
                device = new RedmiNote11();
            }
        }

        device.assemble();
        device.certificates();
        device.pack();
        device.getHardware();

        return device;
    }

}
