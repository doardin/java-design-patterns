package com.course.patterns.creationalpatterns.factory.halfsimple.factories.xiaomi;

import com.course.patterns.creationalpatterns.factory.halfsimple.factories.DeviceFactory;
import com.course.patterns.creationalpatterns.factory.model.Device;
import com.course.patterns.creationalpatterns.factory.model.xiaomi.RedmiNote11;
import com.course.patterns.creationalpatterns.factory.model.xiaomi.RedmiNote8;

public class XiaomiFactory extends DeviceFactory {

    @Override
    public Device createDevice(String level) {
        if(level.equals("standard")) return new RedmiNote8();
        if(level.equals("high-end")) return new RedmiNote11();
        return null;
    }

}
