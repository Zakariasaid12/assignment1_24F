package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlinePrescriptionServiceTest {

    @Test
    void testGeneratePrescription() {
        OnlinePrescriptionService onlinePrescriptionService = new OnlinePrescriptionService();

        Patient patient = new Patient("1", "John Doe", "john.doe@example.com", "1234567890", "1980-01-01") {
            @Override
            public void admit() {}
        };
        patient.setPlannedTreatment("The patient requires medication. Dosage: 2 times/day");

        String prescription = onlinePrescriptionService.generatePrescription(patient);

        assertTrue(prescription.contains("John Doe"));
        assertTrue(prescription.contains("2 times/day"));
    }
}
