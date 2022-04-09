package com.course.parterns.factory.model.samsung;

import com.course.parterns.factory.abstractfactory.factories.countryrules.CountryRulesAbstractFactory;
import com.course.parterns.factory.model.Device;

public class GalaxyA735G extends Device {

    public GalaxyA735G(){

    }

    public GalaxyA735G(CountryRulesAbstractFactory countryRulesAbstractFactory){
        super(countryRulesAbstractFactory);
    }

    @Override
    public void getHardware() {
        System.out.println("System: Android 12 Samsung One UI 4.1");
        System.out.println("Chipset: Snapdragon 778G Qualcomm SM7325");
        System.out.println("Graphic Card: Adreno 642L");
        System.out.println("Ram: 6GB");
        System.out.println("Storage: 128GB");
    }

}
