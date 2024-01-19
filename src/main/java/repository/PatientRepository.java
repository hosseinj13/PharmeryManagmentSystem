package repository;

import model.Admin;
import model.Patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientRepository {

    private final Connection connection;
    public PatientRepository(Connection connection){
        this.connection = connection;
    }

    public void save(Patient patient) throws SQLException {

        String addPatient = "INSERT INTO maktab.pharmacy.patient (national_code) VALUES (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addPatient);

        preparedStatement.setString(1, patient.getNationalCode() );
        preparedStatement.executeUpdate();
    }
}
