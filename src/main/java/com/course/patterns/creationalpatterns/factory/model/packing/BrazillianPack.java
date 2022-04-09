package com.course.patterns.creationalpatterns.factory.model.packing;

import com.course.patterns.creationalpatterns.factory.model.packing.interfaces.Packing;

public class BrazillianPack implements Packing {

    @Override
    public String pack() {
        return "Empacotamento em Português";
    }

}
