package com.course.patterns.creationalpatterns.factory.abstractfactory.factories.countryrules;

import com.course.patterns.creationalpatterns.factory.model.certificate.interfaces.Certificate;
import com.course.patterns.creationalpatterns.factory.model.packing.interfaces.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
