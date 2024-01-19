package model;

public class Medicine {

    private int medicineId;
    private String medicineName;
    private int price;

    //private Prescription prescriptionId;

    public Medicine() {
    }

    public Medicine(String medicineName, int price) {
        this.medicineName = medicineName;
        this.price = price;
    }

    public Medicine(int medicineId) {
        this.medicineId = medicineId;
    }

    public Medicine(int medicineId, String medicineName, int price) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.price = price;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*public Prescription getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Prescription prescriptionId) {
        this.prescriptionId = prescriptionId;
    }*/
}
