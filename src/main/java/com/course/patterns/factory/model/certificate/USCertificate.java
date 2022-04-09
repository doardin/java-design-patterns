package com.course.parterns.factory.model.certificate;

import com.course.parterns.factory.model.certificate.interfaces.Certificate;

public class USCertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "Calibrating US Rules";
    }

}
