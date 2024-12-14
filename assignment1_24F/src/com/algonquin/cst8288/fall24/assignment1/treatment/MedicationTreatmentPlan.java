package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

public class MedicationTreatmentPlan implements TreatmentPlan {

    @Override
    public String createTreatmentPlan(Patient patient) {
        String lifeStage = patient.getLifeStage();
        String dosage = switch (lifeStage) {
            case "Child" -> "1 time/day";
            case "Youth" -> "2 times/day";
            case "Adult" -> "3 times/day";
            default -> "Unknown";
        };
        return "The patient requires medication. Dosage: " + dosage;
    }
}
