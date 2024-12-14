package com.algonquin.cst8288.fall24.assignment1.patient;

import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;

public abstract class Patient {

    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private long age;
    private String lifeStage;
    private String plannedTreatment;
    private Prescription prescription;

    public Patient(String id, String name, String email, String phoneNumber, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getDateOfBirth() { return dateOfBirth; }
    public long getAge() { return age; }
    public String getLifeStage() { return lifeStage; }
    public String getPlannedTreatment() { return plannedTreatment; }
    public Prescription getPrescription() { return prescription; }

    public void setAge(long age) { this.age = age; }
    public void setLifeStage(String lifeStage) { this.lifeStage = lifeStage; }
    public void setPlannedTreatment(String plannedTreatment) { this.plannedTreatment = plannedTreatment; }
    public void setPrescription(Prescription prescription) { this.prescription = prescription; }

    public abstract void admit();
}
