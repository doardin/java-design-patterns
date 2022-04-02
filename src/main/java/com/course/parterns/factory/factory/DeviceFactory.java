package com.course.parterns.factory.factory;

import com.course.parterns.factory.model.Device;

public abstract class DeviceFactory {

    public Device orderDevice(){
        Device device = null;

        device = createDevice();

        device.assemble();
        device.certificates();
        device.pack();
        device.getHardware();

        return device;
    }

    public abstract Device createDevice();

}
