package repository;

import java.sql.Connection;

public class DoctorRepository {

    private final Connection connection;
    public DoctorRepository(Connection connection){
        this.connection = connection;
    }
}
