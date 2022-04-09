package com.course.patterns.creationalpatterns.factory.model;

import com.course.patterns.creationalpatterns.factory.abstractfactory.factories.countryrules.CountryRulesAbstractFactory;

public abstract class Device {

    CountryRulesAbstractFactory rules;

    public Device(){

    }

    public Device(CountryRulesAbstractFactory rules){
        this.rules = rules;
    }

    public void assemble(){
        System.out.println("Asslembling all the hardwares");
    }

    public void certificates(){
        System.out.println("Testing all certificates");
        if(rules != null) System.out.println(rules.getCertificates().applyCertification());
    }

    public void pack(){
        System.out.println("Packing device");
        if(rules != null) System.out.println(rules.getPacking().pack());
    }

    public abstract void getHardware();

}
