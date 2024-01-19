package service;

import model.Admin;
import model.Prescription;
import repository.PrescriptionRepository;

import java.sql.SQLException;

public class PrescriptionService {
    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    public void register(int patientId) throws SQLException {
        Prescription prescription = new Prescription(patientId);
        prescriptionRepository.save(prescription);

    }
}
