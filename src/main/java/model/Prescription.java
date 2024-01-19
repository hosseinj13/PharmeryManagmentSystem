package model;

public class Prescription {

    private int prescriptionId;
    private Medicine[] medicines;
    private int patientId;

    //constructor
    public Prescription() {
    }

    public Prescription(int patientId) {
        this.patientId = patientId;
    }

    public Prescription(int prescriptionId, int patientId) {
        this.prescriptionId = prescriptionId;
        this.patientId = patientId;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
