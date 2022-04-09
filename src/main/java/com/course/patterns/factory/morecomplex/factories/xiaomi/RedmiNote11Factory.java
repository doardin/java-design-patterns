package com.course.patterns.factory.morecomplex.factories.xiaomi;

import com.course.patterns.factory.model.Device;
import com.course.patterns.factory.model.xiaomi.RedmiNote11;
import com.course.patterns.factory.morecomplex.factories.DeviceFactory;

public class RedmiNote11Factory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new RedmiNote11();
    }

}
