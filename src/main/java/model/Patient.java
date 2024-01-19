package model;

public class Patient {

    private int patientId;
    private String nationalCode;

    public Patient() {
    }

    public Patient(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Patient(int patientId, String nationalCode) {
        this.patientId = patientId;
        this.nationalCode = nationalCode;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
