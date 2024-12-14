package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicationTreatmentPlanTest {

    @Test
    void testCreateTreatmentPlan() {
        MedicationTreatmentPlan medicationTreatmentPlan = new MedicationTreatmentPlan();

        Patient child = new Patient("1", "Child Patient", "child@example.com", "1234567890", "2018-01-01") {
            @Override
            public void admit() {}
        };
        child.setLifeStage("Children");

        String result = medicationTreatmentPlan.createTreatmentPlan(child);
        assertTrue(result.contains("1 time/day")); // Verify dosage for CHILD
    }
}
