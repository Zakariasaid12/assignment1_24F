package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

public class SurgeryTreatmentPlan implements TreatmentPlan {

    @Override
    public String createTreatmentPlan(Patient patient) {
        long age = patient.getAge();
        String fasting = (age < 6) ? "No fasting" : (age <= 18) ? "2 hours fasting" : "8 hours fasting";
        String followUp = (age < 6) ? "Next day" : (age <= 18) ? "In a week" : "In a month";

        return "The patient requires surgery. Fasting requirement: " + fasting + ". Follow-up: " + followUp;
    }
}
