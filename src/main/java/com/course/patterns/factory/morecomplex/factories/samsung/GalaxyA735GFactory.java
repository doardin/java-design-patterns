package com.course.patterns.factory.morecomplex.factories.samsung;

import com.course.patterns.factory.model.Device;
import com.course.patterns.factory.model.samsung.GalaxyA735G;
import com.course.patterns.factory.morecomplex.factories.DeviceFactory;

public class GalaxyA735GFactory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new GalaxyA735G();
    }

}
