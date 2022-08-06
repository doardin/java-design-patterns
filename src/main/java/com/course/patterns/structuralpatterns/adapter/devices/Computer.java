package com.course.patterns.structuralpatterns.adapter.devices;

import com.course.patterns.structuralpatterns.adapter.interfaces.IHdmi;

public class Computer {
    private IHdmi port;

    public void connectPort(IHdmi port){
        System.out.println("Connection on HDMI port...");
        this.port = port;
    }

    public void sendImageAndSound(String image, String sound){
        if(port == null){
            System.out.println("Connect a HDMI cable first");
            return;
        }

        port.setImage(image);
        port.setSound(sound);
    }

}
