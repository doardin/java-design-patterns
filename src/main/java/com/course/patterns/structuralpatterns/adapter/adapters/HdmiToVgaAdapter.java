package com.course.patterns.structuralpatterns.adapter.adapters;

import com.course.patterns.structuralpatterns.adapter.interfaces.IHdmi;
import com.course.patterns.structuralpatterns.adapter.interfaces.IVga;

public class HdmiToVgaAdapter implements IHdmi {
    private IVga vga;

    public HdmiToVgaAdapter(IVga vga){
        System.out.println("Connecting the HDMI/VGA adapter...");
        this.vga = vga;
    }


    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, we don't work with sound");
    }
    
}
