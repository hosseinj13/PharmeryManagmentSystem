package service;

import model.Admin;
import repository.AdminRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminService {

    private final AdminRepository adminRepository;
    private final Scanner scanner = new Scanner(System.in);

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void register() throws SQLException {
        System.out.println("enter username :");
        String username = scanner.next();
        System.out.println("enter password :");
        String password = scanner.next();
        Admin admin = new Admin(username, password);

        boolean b = adminRepository.save(admin);
        System.out.println((b == true) ? "insert done" : "insert not valid");
    }

    public void login() throws SQLException {
        System.out.println("username :");
        String username = scanner.next();
        System.out.println("password :");
        String password = scanner.next();

        Admin admin = new Admin(username, password);
        Boolean b = adminRepository.load(admin);
        System.out.println((b == true) ? "log in" : "log in refused");
    }

}
