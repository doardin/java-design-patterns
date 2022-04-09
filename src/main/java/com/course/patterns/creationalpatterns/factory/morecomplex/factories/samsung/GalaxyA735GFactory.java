package com.course.patterns.creationalpatterns.factory.morecomplex.factories.samsung;

import com.course.patterns.creationalpatterns.factory.model.Device;
import com.course.patterns.creationalpatterns.factory.model.samsung.GalaxyA735G;
import com.course.patterns.creationalpatterns.factory.morecomplex.factories.DeviceFactory;

public class GalaxyA735GFactory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new GalaxyA735G();
    }

}
