package com.course.parterns.factory.factory.factories.xiaomi;

import com.course.parterns.factory.factory.factories.DeviceFactory;
import com.course.parterns.factory.model.Device;
import com.course.parterns.factory.model.xiaomi.RedmiNote8;

public class RedmiNote8Factory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new RedmiNote8();
    }

}
