package com.course.parterns.factory.model;

public abstract class Device {

    public void assemble(){
        System.out.println("Asslembling all the hardwares");
    }

    public void certificates(){
        System.out.println("Testing all certificates");
    }

    public void pack(){
        System.out.println("Packing device");
    }

    public abstract void getHardware();

}
