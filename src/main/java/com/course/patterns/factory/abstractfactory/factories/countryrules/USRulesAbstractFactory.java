package com.course.patterns.factory.abstractfactory.factories.countryrules;

import com.course.patterns.factory.model.certificate.USCertificate;
import com.course.patterns.factory.model.certificate.interfaces.Certificate;
import com.course.patterns.factory.model.packing.USPacking;
import com.course.patterns.factory.model.packing.interfaces.Packing;

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
