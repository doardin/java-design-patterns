package com.course.patterns.creationalpatterns.factory.halfsimple.factories.samsung;

import com.course.patterns.creationalpatterns.factory.halfsimple.factories.DeviceFactory;
import com.course.patterns.creationalpatterns.factory.model.Device;
import com.course.patterns.creationalpatterns.factory.model.samsung.GalaxyA32;
import com.course.patterns.creationalpatterns.factory.model.samsung.GalaxyA735G;

public class SamsungFactory extends DeviceFactory {

    @Override
    public Device createDevice(String level) {
        if(level.equals("standard")) return new GalaxyA32();
        if(level.equals("high-end")) return new GalaxyA735G();
        return null;
    }

}
