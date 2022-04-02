package com.course.parterns.factory.factory.factories.samsung;

import com.course.parterns.factory.factory.factories.DeviceFactory;
import com.course.parterns.factory.model.Device;
import com.course.parterns.factory.model.samsung.GalaxyA32;

public class GalaxyA32Factory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new GalaxyA32();
    }

}
