package com.course.patterns.factory.morecomplex.factories;

import com.course.patterns.factory.model.Device;

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
