package com.course.parterns.factory.halfsimple.factories;

import com.course.parterns.factory.model.Device;

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
