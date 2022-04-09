package com.course.patterns.creationalpatterns.factory.model.certificate;

import com.course.patterns.creationalpatterns.factory.model.certificate.interfaces.Certificate;

public class BrazillianCertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "Calibrating Brazillian rules - Applying Anatel's Stamp";
    }

}
