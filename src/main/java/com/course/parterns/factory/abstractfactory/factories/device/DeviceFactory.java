package com.course.parterns.factory.abstractfactory.factories.device;

import com.course.parterns.factory.abstractfactory.factories.countryrules.CountryRulesAbstractFactory;
import com.course.parterns.factory.model.Device;


public abstract class DeviceFactory {

    CountryRulesAbstractFactory rules;

    public DeviceFactory(CountryRulesAbstractFactory rules){
        this.rules = rules;
    }

    public Device orderDevice(String level){
        Device device = null;

        device = createDevice(level);

        device.assemble();
        device.certificates();
        device.pack();
        device.getHardware();

        return device;
    }

    public abstract Device createDevice(String level);

}
