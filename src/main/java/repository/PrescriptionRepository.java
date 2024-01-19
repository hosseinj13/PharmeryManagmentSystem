package repository;

import model.Admin;
import model.Prescription;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrescriptionRepository {

    private final Connection connection;
    public PrescriptionRepository(Connection connection){
        this.connection = connection;
    }

    public void save(Prescription prescription) throws SQLException {

        String addPrescription = "INSERT INTO maktab.pharmacy.prescription (patient_id) VALUES (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addPrescription);

        preparedStatement.setInt(1, prescription.getPatientId() );
        preparedStatement.executeUpdate();
    }
}
