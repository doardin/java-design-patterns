package com.course.parterns.factory.model.xiaomi;

import com.course.parterns.factory.abstractfactory.factories.countryrules.CountryRulesAbstractFactory;
import com.course.parterns.factory.model.Device;

public class RedmiNote11 extends Device {

    public RedmiNote11(){

    }

    public RedmiNote11(CountryRulesAbstractFactory countryRulesAbstractFactory){
        super(countryRulesAbstractFactory);
    }

    @Override
    public void getHardware() {
        System.out.println("System: Android 11 MIUI 13");
        System.out.println("Chipset: Snapdragon 680 4G Qualcomm SM6225");
        System.out.println("Graphic Card: Adreno 610");
        System.out.println("Ram: 4GB");
        System.out.println("Storage: 128GB");
    }

}
