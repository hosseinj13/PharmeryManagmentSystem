package org.example;


import service.AdminService;
import service.MedicineService;
import service.PatientService;
import service.PrescriptionService;
import utility.ApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static final AdminService adminService = ApplicationContext.getAdminService();
    private static final MedicineService medicineService = ApplicationContext.getMedicineService();
    private static final PatientService patientService = ApplicationContext.getPatientService();
    private static final PrescriptionService prescriptionService = ApplicationContext.getPrescriptionService();


    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("***************** (～￣▽￣)～ Welcome to pharmacy (～￣▽￣)～  *****************");

        System.out.println("1 : Dr logging  " +
                "\n2 : Admin logging ");
        int num = input.nextInt();

        switch (num){
            case 1->{
                System.out.println(
                        "\n1 : log in " +
                        "\n2 : exit");
                System.out.println("input :");
                int in = input.nextInt();
                switch (in){
                    case 1->{
                        adminService.login();
                    }case 2->{
                        break;
                    }
                }


            }case 2->{

                System.out.println("1 : sign up " +
                        "\n2 : log in " +
                        "\n3 : exit");
                int in = input.nextInt();

                switch (in){
                    case 1 ->{
                        adminService.register();
                        break;
                    }case 2 ->{
                        adminService.login();
                        break;
                    }case 3 ->{
                        break;
                    }
                }
            }
        }
        System.out.println("1 : sign in " +
                "\n2 : log in " +
                "\n3 : exit");
        int in = input.nextInt();

        switch (in){
            case 1 ->{
                adminService.register();
                break;
            }case 2 ->{
                adminService.login();
                break;
            }
        }

    }
}