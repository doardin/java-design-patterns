package com.course.patterns.factory.model.certificate;

import com.course.patterns.factory.model.certificate.interfaces.Certificate;

public class BrazillianCertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "Calibrating Brazillian rules - Applying Anatel's Stamp";
    }

}
