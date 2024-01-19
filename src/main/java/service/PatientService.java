package service;

import model.Admin;
import model.Patient;
import repository.PatientRepository;

import java.sql.SQLException;

public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void register(String nationalCode) throws SQLException {
        Patient patient = new Patient(nationalCode);
        patientRepository.save(patient);
    }
}
