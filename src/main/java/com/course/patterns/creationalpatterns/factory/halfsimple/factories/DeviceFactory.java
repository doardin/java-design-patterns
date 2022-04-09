package com.course.patterns.creationalpatterns.factory.halfsimple.factories;

import com.course.patterns.creationalpatterns.factory.model.Device;

public abstract class DeviceFactory {

    public Device orderDevice(String level){
        Device device = null;

        device = createDevice(level);

        device.assemble();
        device.certificates();
        device.pack();
        device.getHardware();

        return device;
    }

    public abstract Device createDevice(String level);

}
