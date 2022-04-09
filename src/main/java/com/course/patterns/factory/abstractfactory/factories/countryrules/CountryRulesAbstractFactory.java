package com.course.parterns.factory.abstractfactory.factories.countryrules;

import com.course.parterns.factory.model.certificate.interfaces.Certificate;
import com.course.parterns.factory.model.packing.interfaces.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
