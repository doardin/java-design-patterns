package com.course.parterns.factory.model.packing;

import com.course.parterns.factory.model.packing.interfaces.Packing;

public class BrazillianPack implements Packing {

    @Override
    public String pack() {
        return "Empacotamento em Português";
    }

}
