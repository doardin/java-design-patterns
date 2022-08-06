package com.course.patterns.structuralpatterns.adapter.adapters;

import com.course.patterns.structuralpatterns.adapter.devices.OldMonitor;
import com.course.patterns.structuralpatterns.adapter.interfaces.IHdmi;

public class HdmiToOldMonitorAdapter extends OldMonitor implements IHdmi {

    public HdmiToOldMonitorAdapter(){
        super();
        System.out.println("Wrapping the VGA's OldMonitor Interface with a HDMI adapter...");
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound){
        System.out.println("Sorry, we don't work with sound");
    }
    
}
