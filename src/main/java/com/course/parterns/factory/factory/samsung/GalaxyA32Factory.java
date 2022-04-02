package com.course.parterns.factory.factory.samsung;

import com.course.parterns.factory.factory.DeviceFactory;
import com.course.parterns.factory.model.Device;
import com.course.parterns.factory.model.samsung.GalaxyA32;

public class GalaxyA32Factory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new GalaxyA32();
    }

}
