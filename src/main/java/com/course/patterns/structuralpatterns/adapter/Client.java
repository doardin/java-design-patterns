package com.course.patterns.structuralpatterns.adapter;

import com.course.patterns.structuralpatterns.adapter.adapters.HdmiToOldMonitorAdapter;
import com.course.patterns.structuralpatterns.adapter.adapters.HdmiToVgaAdapter;
import com.course.patterns.structuralpatterns.adapter.devices.Computer;
import com.course.patterns.structuralpatterns.adapter.devices.OldMonitor;
import com.course.patterns.structuralpatterns.adapter.devices.TV;

public class Client {
    
    public static void main(String[] args) {
        Computer pc = new Computer();
        TV tv = new TV();
        pc.connectPort(tv);
        pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        Computer pc2 = new Computer();
        OldMonitor monitor = new OldMonitor();
        pc2.connectPort(new HdmiToVgaAdapter(monitor));
        pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        Computer pc3 = new Computer();
        pc3.connectPort(new HdmiToOldMonitorAdapter());
        pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");


    }

}
