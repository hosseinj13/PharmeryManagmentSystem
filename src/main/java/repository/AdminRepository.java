package repository;

import connection.JdbcConnection;
import model.Admin;

import java.sql.*;


public class AdminRepository {

    private final Connection connection;


    public AdminRepository(Connection connection) {
        this.connection = connection;
    }

    public boolean save(Admin admin) throws SQLException {

        String addAdmin = "INSERT INTO maktab.public.admin (username, password) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addAdmin);

        preparedStatement.setString(1, admin.getUsername());
        preparedStatement.setString(2, admin.getPassword());
        int resultSet = preparedStatement.executeUpdate();

        return (resultSet == 1)? true:false;
    }

    public boolean load(Admin admin) throws SQLException {
        String sql = "select username from admin where " +
                "exists(select username from admin where username = ? and password = ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, admin.getUsername());
        preparedStatement.setString(2, admin.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        } else {
            return false;
        }
    }


    public boolean userUniqe(String username) throws SQLException {

        String sql = "select username from admin where " +
                "exists(select username from admin where username = ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) throws SQLException {
        Admin admin = new Admin("a", "b");
        Connection connection1 = JdbcConnection.getConnection();
        AdminRepository adminRepository = new AdminRepository(connection1);
        //save
//        adminRepository.save(admin);
        //load
//        System.out.println(adminRepository.load(admin));
    }
}
