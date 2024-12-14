package com.alognquin.cst8288.fall24.assignment1;

import com.algonquin.cst8288.fall24.assignment1.management.PatientManagement;
import com.algonquin.cst8288.fall24.assignment1.management.ValidationService;
import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;
import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.OnlinePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.treatment.MedicationTreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;

import java.io.IOException;

public class Physician {

    public static void main(String[] args) throws IOException {
        ValidationService validationService = new ValidationService();
        PatientManagement patientManagement = new PatientManagement();

        Patient patient1 = new Inpatient("1", "John Doe", "john@example.com", "1234567890", "2010-01-01", "101A");
        Patient patient2 = new Inpatient("2", "Jane Smith", "jane@example.com", "0987654321", "1980-06-15", "102B");

        if (patientManagement.validatePatientData(patient1, validationService)) {
            patientManagement.createTreatmentPlan(patient1, new MedicationTreatmentPlan());
            patientManagement.generatePrescription(patient1, "john_doe_prescription.html", new OnlinePrescriptionService());
        }

        if (patientManagement.validatePatientData(patient2, validationService)) {
            patientManagement.createTreatmentPlan(patient2, new SurgeryTreatmentPlan());
            patientManagement.generatePrescription(patient2, "jane_smith_prescription.html", new OnlinePrescriptionService());
        }
    }
}
