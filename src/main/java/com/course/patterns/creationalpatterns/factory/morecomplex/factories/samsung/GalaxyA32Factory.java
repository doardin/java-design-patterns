package com.course.patterns.creationalpatterns.factory.morecomplex.factories.samsung;

import com.course.patterns.creationalpatterns.factory.model.Device;
import com.course.patterns.creationalpatterns.factory.model.samsung.GalaxyA32;
import com.course.patterns.creationalpatterns.factory.morecomplex.factories.DeviceFactory;

public class GalaxyA32Factory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new GalaxyA32();
    }

}
