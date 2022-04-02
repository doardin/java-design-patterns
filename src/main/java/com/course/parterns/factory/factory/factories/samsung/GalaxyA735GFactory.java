package com.course.parterns.factory.factory.factories.samsung;

import com.course.parterns.factory.factory.factories.DeviceFactory;
import com.course.parterns.factory.model.Device;
import com.course.parterns.factory.model.samsung.GalaxyA735G;

public class GalaxyA735GFactory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new GalaxyA735G();
    }

}
