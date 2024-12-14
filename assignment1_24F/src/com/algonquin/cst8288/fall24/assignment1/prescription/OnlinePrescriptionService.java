package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

public class OnlinePrescriptionService implements PrescriptionService {

    @Override
    public String generatePrescription(Patient patient) {
        return "<html><body><h1>Prescription</h1>" +
               "<p>Name: " + patient.getName() + "</p>" +
               "<p>Treatment: " + patient.getPlannedTreatment() + "</p>" +
               "</body></html>";
    }
}
