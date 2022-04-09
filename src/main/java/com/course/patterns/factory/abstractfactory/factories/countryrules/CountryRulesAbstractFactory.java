package com.course.patterns.factory.abstractfactory.factories.countryrules;

import com.course.patterns.factory.model.certificate.interfaces.Certificate;
import com.course.patterns.factory.model.packing.interfaces.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
