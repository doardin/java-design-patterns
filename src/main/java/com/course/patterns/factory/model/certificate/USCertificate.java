package com.course.patterns.factory.model.certificate;

import com.course.patterns.factory.model.certificate.interfaces.Certificate;

public class USCertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "Calibrating US Rules";
    }

}
