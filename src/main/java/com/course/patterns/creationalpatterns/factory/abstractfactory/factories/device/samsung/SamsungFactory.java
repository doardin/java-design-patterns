package com.course.patterns.creationalpatterns.factory.abstractfactory.factories.device.samsung;

import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.countryrules.CountryRulesAbstractFactory;
import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.device.DeviceFactory;
import com.course.patterns.creationalpatterns.factory.model.Device;
import com.course.patterns.creationalpatterns.factory.model.samsung.GalaxyA32;
import com.course.patterns.creationalpatterns.factory.model.samsung.GalaxyA735G;

public class SamsungFactory extends DeviceFactory {

    public SamsungFactory(CountryRulesAbstractFactory rules){
        super(rules);
    }

    @Override
    public Device createDevice(String level) {
        if(level.equals("standard")) return new GalaxyA32(rules);
        if(level.equals("high-end")) return new GalaxyA735G(rules);
        return null;
    }

}
