package com.course.parterns.factory.abstractfactory.factories.countryrules;

import com.course.parterns.factory.model.certificate.USCertificate;
import com.course.parterns.factory.model.certificate.interfaces.Certificate;
import com.course.parterns.factory.model.packing.USPacking;
import com.course.parterns.factory.model.packing.interfaces.Packing;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }

}
