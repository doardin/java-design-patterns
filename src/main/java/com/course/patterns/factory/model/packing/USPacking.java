package com.course.parterns.factory.model.packing;

import com.course.parterns.factory.model.packing.interfaces.Packing;

public class USPacking implements Packing {

    @Override
    public String pack() {
        return "Packing in English";
    }

}
