package model;

import java.util.Arrays;

public class Medicine_Prescription {


    private Prescription prescription;
    private Medicine[] medicines;


//constructor


    public Medicine_Prescription() {
    }

    public Medicine_Prescription(Prescription prescription, Medicine[] medicines) {
        this.prescription = prescription;
        this.medicines = medicines;
    }

//get and set


    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Medicine[] getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine[] medicines) {
        this.medicines = medicines;
    }

    //method
    // TODO: 1/19/2024


    @Override
    public String toString() {
        return "Medicine_Prescription{" +
                "prescription=" + prescription +
                ", medicines=" + Arrays.toString(medicines) +
                '}';
    }
}
