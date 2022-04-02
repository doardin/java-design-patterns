package com.course.parterns.factory.morecomplex.factories.xiaomi;

import com.course.parterns.factory.model.Device;
import com.course.parterns.factory.model.xiaomi.RedmiNote8;
import com.course.parterns.factory.morecomplex.factories.DeviceFactory;

public class RedmiNote8Factory extends DeviceFactory {

    @Override
    public Device createDevice() {
        return new RedmiNote8();
    }

}
