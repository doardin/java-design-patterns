package com.course.parterns.factory.morecomplex.factories.samsung;

import com.course.parterns.factory.model.Device;
import com.course.parterns.factory.model.samsung.GalaxyA32;
import com.course.parterns.factory.morecomplex.factories.DeviceFactory;

public class GalaxyA32Factory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new GalaxyA32();
    }

}
