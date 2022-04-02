package com.course.parterns.factory.model.certificate;

import com.course.parterns.factory.model.certificate.interfaces.Certificate;

public class BrazillianCertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "Calibrating Brazillian rules - Applying Anatel's Stamp";
    }

}
