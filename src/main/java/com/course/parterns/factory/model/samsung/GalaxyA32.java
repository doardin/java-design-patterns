package com.course.parterns.factory.model.samsung;

import com.course.parterns.factory.model.Device;

public class GalaxyA32 extends Device {

    @Override
    public void getHardware() {
        System.out.println("System: Android 11 Samsung One UI 3.0");
        System.out.println("Chipset: Helio G80 MediaTek");
        System.out.println("Graphic Card: Mali-G52 MC2");
        System.out.println("Ram: 4GB");
        System.out.println("Storage: 64GB");
    }

}
