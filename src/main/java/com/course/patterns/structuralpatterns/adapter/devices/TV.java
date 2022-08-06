package com.course.patterns.structuralpatterns.adapter.devices;

import com.course.patterns.structuralpatterns.adapter.interfaces.IHdmi;

public class TV implements IHdmi {

    @Override
    public void setImage(String image) {
        System.out.println(">> This is your imagem: " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println(">> This is your sound: " + sound);
    }
    
}
