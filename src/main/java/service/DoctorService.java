package service;

import repository.AdminRepository;
import repository.DoctorRepository;

public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }
}
