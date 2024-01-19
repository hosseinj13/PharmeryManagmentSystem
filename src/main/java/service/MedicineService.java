package service;

import connection.JdbcConnection;
import model.Admin;
import model.Medicine;
import repository.MedicineRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MedicineService {

    private final MedicineRepository medicineRepository;

    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    public void register(String medicineName, int price) throws SQLException {
        Medicine medicine = new Medicine(medicineName, price);
        medicineRepository.save(medicine);

    }

    public void deleteById() throws SQLException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println();
        medicineRepository.read();
        System.out.print("\nenter id :");
        int id = scanner1.nextInt();
        Boolean b = medicineRepository.delete(id);
        System.out.println((b == true) ? id + " delete" : "not delete");
        System.out.println("Do you want to continue(y,n) ?");
        String str = scanner1.next();
        str.toLowerCase();
        if (str.charAt(0) == 'y') {
            deleteById();
        }
    }

    public void editPriceById() throws SQLException {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println();
        medicineRepository.read();
        System.out.print("\nenter id :");
        int id = scanner1.nextInt();
        System.out.print("enter price :");
        int price = scanner1.nextInt();

        medicineRepository.editPrice(id, price);
        System.out.println("Do you want to continue(y,n) ?");
        String str = scanner1.next();
        str.toLowerCase();
        if (str.charAt(0) == 'y') {
            editPriceById();
        }

    }


    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcConnection.getConnection();
        MedicineRepository medicineRepository1 = new MedicineRepository(connection);
        MedicineService medicineService = new MedicineService(medicineRepository1);
//        medicineService.deleteById();
        medicineService.editPriceById();
    }
}
