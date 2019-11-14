package com.company;

import com.Management_sys.File_manager;
import com.Management_sys.Management_sys;
import com.Management_sys.New_Employee;
import com.Management_sys.New_Employee_Test;

import java.io.IOException;
import java.util.Scanner;

public class Company {

    final static String EMPLOYERS_LIST = "Lista pracownikow";
    final static String NEW_EMPLOYEE_TEST = "Nowy pracownik testowy";
    final static String NEW_EMPLOYEE = "Nowy pracownik";
    final static String EXPORT_TO_FILE = "Eksport do pliku";

    public static void main(String[] args) throws IOException{

        Menu menu = new Menu(
                EMPLOYERS_LIST,
                NEW_EMPLOYEE_TEST,
                NEW_EMPLOYEE,
                EXPORT_TO_FILE
                );

        Management_sys management = new Management_sys();
        File_manager file_manager = new File_manager();



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
                    file_manager.saveDataToFile();
                    break;

                default:
                    System.out.println("Wrong choice!");

            }
        }
    }
}
