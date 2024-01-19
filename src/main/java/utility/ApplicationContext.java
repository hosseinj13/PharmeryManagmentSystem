package utility;

import connection.JdbcConnection;
import repository.*;
import service.*;
import java.sql.Connection;


public class ApplicationContext {

    private static final Connection CONNECTION;
    private static final AdminRepository ADMIN_REPOSITORY;
    private static final PatientRepository PATIENT_REPOSITORY;
    private static final PrescriptionRepository PRESCRIPTION_REPOSITORY;
    private static final MedicineRepository MEDICINE_REPOSITORY;
    private static final DoctorRepository DOCTOR_REPOSITORY;









    private static final AdminService ADMIN_SERVICE;
    private static final PatientService PATIENT_SERVICE;
    private static final PrescriptionService PRESCRIPTION_SERVICE;
    private static final MedicineService MEDICINE_SERVICE;
    private static final DoctorService DOCTOR_SERVICE;







    static{
        CONNECTION = JdbcConnection.getConnection();
        ADMIN_REPOSITORY = new AdminRepository(CONNECTION);
        ADMIN_SERVICE = new AdminService(ADMIN_REPOSITORY);

        PATIENT_REPOSITORY = new PatientRepository(CONNECTION);
        PATIENT_SERVICE = new PatientService(PATIENT_REPOSITORY);

        PRESCRIPTION_REPOSITORY = new PrescriptionRepository(CONNECTION);
        PRESCRIPTION_SERVICE = new PrescriptionService(PRESCRIPTION_REPOSITORY);

        MEDICINE_REPOSITORY = new MedicineRepository(CONNECTION);
        MEDICINE_SERVICE = new MedicineService(MEDICINE_REPOSITORY);

        DOCTOR_REPOSITORY = new DoctorRepository(CONNECTION);
        DOCTOR_SERVICE = new DoctorService(DOCTOR_REPOSITORY);


    }

    public static AdminService getAdminService(){
        return ADMIN_SERVICE;
    }

    public static PatientService getPatientService(){
        return PATIENT_SERVICE;
    }

    public static PrescriptionService getPrescriptionService(){
        return PRESCRIPTION_SERVICE;
    }

    public static MedicineService getMedicineService(){
        return MEDICINE_SERVICE;
    }

    public static DoctorService getDoctorService(){
        return DOCTOR_SERVICE;
    }

}
