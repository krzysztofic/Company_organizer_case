package com.company;

import com.Management_sys.*;

import java.io.IOException;
import java.util.Scanner;

public class Company {

    final static String EMPLOYERS_LIST = "Lista pracownikow";
    final static String NEW_EMPLOYEE_TEST = "Nowy pracownik testowy";
    final static String NEW_EMPLOYEE = "Nowy pracownik";
    final static String EXPORT_TO_FILE = "Eksport do pliku";
    final static String IMPORT_FROM_FILE = "Wczytaj dane z pliku";
    final static String ADDITIONAL_MENU = "Opcje dodatkowe";
    final static String EMPLOYEES_WITH_SPECIFIED_SALARY = "Pracownicy z określonymi dochodami";
    final static String CALCULATE_AVERAGE_SALARY_IN_THE_DEPARTMENT = "Oblicz średnią płacę w danym dziale";
    final static String GO_BACK = "Wróć";

    public static void main(String[] args){

        Menu menu = new Menu(
                EMPLOYERS_LIST,
                //NEW_EMPLOYEE_TEST,
                NEW_EMPLOYEE,
                EXPORT_TO_FILE,
                IMPORT_FROM_FILE,
                ADDITIONAL_MENU
                );


        Menu additional_menu = new Menu(
                EMPLOYEES_WITH_SPECIFIED_SALARY,
                CALCULATE_AVERAGE_SALARY_IN_THE_DEPARTMENT,
                GO_BACK
                );

        Scanner scan = new Scanner(System.in);
        Management_sys management = new Management_sys();
        File_manager file_manager = new File_manager();

        boolean display_main_menu = true;
        boolean display_additional_menu = true;

        while(display_main_menu) {

            switch (menu.printMenuAndGetChoice()) {
                case EMPLOYERS_LIST:

                    management.displayAll();
                    break;

                case NEW_EMPLOYEE_TEST :
                    //management.addTestEmployee();  disabled for now
                    break;

                case NEW_EMPLOYEE :
                    management.addEmployeeToList();
                    break;

                case EXPORT_TO_FILE:
                    file_manager.saveDataToFile();
                    break;

                case IMPORT_FROM_FILE:
                    file_manager.readDataFromFile();
                    break;

                case ADDITIONAL_MENU:
                    display_additional_menu = true;
                    while(display_additional_menu) {
                        switch (additional_menu.printMenuAndGetChoice()) {

                            case EMPLOYEES_WITH_SPECIFIED_SALARY:
                                Additional_options ad = new Additional_options();
                                System.out.println("Insert salary value: ");
                                float salary = scan.nextFloat();
                                System.out.println(ad.employeesWithSpecifiedSalary(salary));
                                break;

                            case CALCULATE_AVERAGE_SALARY_IN_THE_DEPARTMENT:
                                Additional_options add = new Additional_options();
                                System.out.println("Insert department Number: ");
                                int departmentNumber = scan.nextInt();
                                System.out.println(add.averageSalaryInDepartment(departmentNumber));
                                break;

                            case GO_BACK:
                                display_additional_menu = false;
                                break;
                        }
                    }

                default:
                    System.out.println("Wrong choice!");

            }
        }
    }
}
