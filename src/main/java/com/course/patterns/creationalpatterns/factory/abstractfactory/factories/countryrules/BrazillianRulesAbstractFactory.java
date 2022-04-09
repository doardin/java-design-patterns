package com.course.patterns.creationalpatterns.factory.abstractfactory.factories.countryrules;

import com.course.patterns.creationalpatterns.factory.model.certificate.BrazillianCertificate;
import com.course.patterns.creationalpatterns.factory.model.certificate.interfaces.Certificate;
import com.course.patterns.creationalpatterns.factory.model.packing.BrazillianPack;
import com.course.patterns.creationalpatterns.factory.model.packing.interfaces.Packing;

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
