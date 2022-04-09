package com.course.parterns.factory.halfsimple;

import com.course.parterns.factory.halfsimple.factories.samsung.SamsungFactory;
import com.course.parterns.factory.halfsimple.factories.xiaomi.XiaomiFactory;

public class Client {
    public static void main(String[] args) {
        SamsungFactory samsungFactory = new SamsungFactory();
        samsungFactory.orderDevice("standard");
        samsungFactory.orderDevice("high-end");

        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.orderDevice("standard");
        xiaomiFactory.orderDevice("high-end");
    }
}
