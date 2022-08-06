package com.course.patterns.structuralpatterns.adapter.devices;

import com.course.patterns.structuralpatterns.adapter.interfaces.IVga;

public class OldMonitor implements IVga {

    @Override
    public void setImage(String image) {
        System.out.println(">> This is yout image: " + image);
    }
    
}
