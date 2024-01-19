package repository;

import connection.JdbcConnection;
import model.Admin;
import model.Medicine;
import org.postgresql.util.PSQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MedicineRepository {

    private final Scanner scanner = new Scanner(System.in);
    private final Connection connection;

    public MedicineRepository(Connection connection) {
        this.connection = connection;
    }

    public boolean save(Medicine medicine) throws SQLException {

        String addMedicine = "INSERT INTO maktab.public.medicine (medicine_name, price) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addMedicine);

        preparedStatement.setString(1, medicine.getMedicineName());
        preparedStatement.setInt(2, medicine.getPrice());
        int resultSet = preparedStatement.executeUpdate();

        return (resultSet == 1) ? true : false;
    }

    public boolean delete(int id) throws SQLException {

       String sql ="delete from medicine where medicine_id = ?";
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       preparedStatement.setInt(1,id);

       int resultSet = preparedStatement.executeUpdate();

        return (resultSet == 1)?true:false;
    }


    public void read() throws SQLException {
        String sql = "select * from maktab.public.medicine order by medicine_id";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String medicine = resultSet.getString(2);
            int price = resultSet.getInt(3);
            System.out.printf("%S   : medicine -> %s  |  price -> %s\n", id, medicine, price);
        }
    }


    public boolean editPrice(int id, int price) throws SQLException {
        String sql ="update medicine set price = ? where medicine_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,price);
        preparedStatement.setInt(2,id);

        int result = preparedStatement.executeUpdate();
        return (result == 1)?true:false;
    }

}
