package com.course.patterns.creationalpatterns.factory.model.packing;

import com.course.patterns.creationalpatterns.factory.model.packing.interfaces.Packing;

public class USPacking implements Packing {

    @Override
    public String pack() {
        return "Packing in English";
    }

}
