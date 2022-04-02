package com.course.parterns.factory.abstractfactory.factories.countryrules;

import com.course.parterns.factory.model.certificate.BrazillianCertificate;
import com.course.parterns.factory.model.certificate.interfaces.Certificate;
import com.course.parterns.factory.model.packing.BrazillianPack;
import com.course.parterns.factory.model.packing.interfaces.Packing;

public class BrazillianRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new BrazillianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazillianPack();
    }

}
