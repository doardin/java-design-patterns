package com.course.parterns.factory.morecomplex.factories.samsung;

import com.course.parterns.factory.model.Device;
import com.course.parterns.factory.model.samsung.GalaxyA735G;
import com.course.parterns.factory.morecomplex.factories.DeviceFactory;

public class GalaxyA735GFactory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new GalaxyA735G();
    }

}
