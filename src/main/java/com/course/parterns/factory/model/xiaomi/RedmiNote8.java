package com.course.parterns.factory.model.xiaomi;

import com.course.parterns.factory.abstractfactory.factories.countryrules.CountryRulesAbstractFactory;
import com.course.parterns.factory.model.Device;

public class RedmiNote8 extends Device {

    public RedmiNote8(){

    }

    public RedmiNote8(CountryRulesAbstractFactory countryRulesAbstractFactory){
        super(countryRulesAbstractFactory);
    }

    @Override
    public void getHardware() {
        System.out.println("System: Android 10 MIUI 12");
        System.out.println("Chipset: Snapdragon 665 Qualcomm SDM665");
        System.out.println("Graphic Card: Adreno 610");
        System.out.println("Ram: 4GB");
        System.out.println("Storage: 64GB");
    }

}
