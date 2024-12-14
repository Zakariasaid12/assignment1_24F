package com.algonquin.cst8288.fall24.assignment1.management;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PatientManagement {

    public boolean validatePatientData(Patient patient, ValidationService validationService) {
        return validationService.validateName(patient.getName()) &&
               validationService.validateEmail(patient.getEmail()) &&
               validationService.validatePhone(patient.getPhoneNumber());
    }

    public long calculatePatientAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirth = LocalDate.parse(dob, formatter);
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String determineLifeStage(long age) {
        return (age <= 6) ? "Child" : (age <= 18) ? "Youth" : "Adult";
    }

    public void createTreatmentPlan(Patient patient, TreatmentPlan treatmentPlan) {
        patient.setAge(calculatePatientAge(patient.getDateOfBirth()));
        patient.setLifeStage(determineLifeStage(patient.getAge()));
        String plan = treatmentPlan.createTreatmentPlan(patient);
        patient.setPlannedTreatment(plan);
    }

    public void generatePrescription(Patient patient, String filename, PrescriptionService prescriptionService) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            String prescription = prescriptionService.generatePrescription(patient);
            writer.write(prescription);
        }
    }
}
