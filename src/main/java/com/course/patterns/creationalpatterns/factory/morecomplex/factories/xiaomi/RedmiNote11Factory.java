package com.course.patterns.creationalpatterns.factory.morecomplex.factories.xiaomi;

import com.course.patterns.creationalpatterns.factory.model.Device;
import com.course.patterns.creationalpatterns.factory.model.xiaomi.RedmiNote11;
import com.course.patterns.creationalpatterns.factory.morecomplex.factories.DeviceFactory;

public class RedmiNote11Factory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new RedmiNote11();
    }

}
