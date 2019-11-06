package com.company;

import com.Management_sys.Management_sys;
import com.Management_sys.New_Employee;
import com.Management_sys.New_Employee_Test;

import java.util.Scanner;

public class Company {

    final static String EMPLOYERS_LIST = "Lista pracownikow";
    final static String NEW_EMPLOYEE_TEST = "Nowy pracownik testowy";
    final static String NEW_EMPLOYEE = "Nowy pracownik";
    final static String EXPORT_TO_FILE = "Eksport do pliku";

    public static void main(String[] args) {

        Menu menu = new Menu(
                EMPLOYERS_LIST,
                NEW_EMPLOYEE_TEST,
                NEW_EMPLOYEE,
                EXPORT_TO_FILE
                );

        Management_sys management = new Management_sys();



        while(true) {

            switch (menu.printMenuAndGetChoice()) {
                case EMPLOYERS_LIST:

                    management.displayAll();
                    break;

                case NEW_EMPLOYEE_TEST :
                    management.addTestEmployee();
                    break;

                case NEW_EMPLOYEE :
                    management.addEmployeeToList();
                    break;

                case EXPORT_TO_FILE:
                    break;

                default:
                    System.out.println("Wrong choice!");

            }
        }
    }
}
