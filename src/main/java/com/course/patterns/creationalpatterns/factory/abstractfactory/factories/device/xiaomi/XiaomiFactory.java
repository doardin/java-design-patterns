package com.course.patterns.creationalpatterns.factory.abstractfactory.factories.device.xiaomi;


import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.countryrules.CountryRulesAbstractFactory;
import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.device.DeviceFactory;
import com.course.patterns.creationalpatterns.factory.model.Device;
import com.course.patterns.creationalpatterns.factory.model.xiaomi.RedmiNote11;
import com.course.patterns.creationalpatterns.factory.model.xiaomi.RedmiNote8;

public class XiaomiFactory extends DeviceFactory {

    public XiaomiFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public Device createDevice(String level) {
        if(level.equals("standard")) return new RedmiNote8(rules);
        if(level.equals("high-end")) return new RedmiNote11(rules);
        return null;
    }

}
