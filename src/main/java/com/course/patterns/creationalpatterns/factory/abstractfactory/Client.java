package com.course.patterns.creationalpatterns.factory.abstractfactory;

import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.countryrules.BrazillianRulesAbstractFactory;
import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.countryrules.CountryRulesAbstractFactory;
import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.countryrules.USRulesAbstractFactory;
import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.device.samsung.SamsungFactory;
import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.device.xiaomi.XiaomiFactory;

public class Client {
    public static void main(String[] args) {

        System.out.println("==== BR RULES ====");
        CountryRulesAbstractFactory brazillianRulesAbstractFactory = new BrazillianRulesAbstractFactory();
        SamsungFactory brazilianSamsungFactory = new SamsungFactory(brazillianRulesAbstractFactory);
        brazilianSamsungFactory.orderDevice("standard");
        brazilianSamsungFactory.orderDevice("high-end");

        System.out.println("\n");
        XiaomiFactory brazillianXiaomiFactory = new XiaomiFactory(brazillianRulesAbstractFactory);
        brazillianXiaomiFactory.orderDevice("standard");
        System.out.println("\n");
        brazillianXiaomiFactory.orderDevice("high-end");

        System.out.println("\n");
        System.out.println("==== US RULES ====");
        CountryRulesAbstractFactory usRulesAbstractFactory = new USRulesAbstractFactory();
        SamsungFactory usSamsungFactory = new SamsungFactory(usRulesAbstractFactory);
        usSamsungFactory.orderDevice("standard");
        System.out.println("\n");
        usSamsungFactory.orderDevice("high-end");

        System.out.println("\n");
        XiaomiFactory usXiaomiFactory = new XiaomiFactory(usRulesAbstractFactory);
        usXiaomiFactory.orderDevice("standard");
        System.out.println("\n");
        usXiaomiFactory.orderDevice("high-end");
    }
}
