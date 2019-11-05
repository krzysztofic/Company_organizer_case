package com.company;

import com.Management_sys.Management_sys;

import java.util.Scanner;

public class Company {

    final static String EMPLOYERS_LIST = "Lista pracownikow";
    final static String NEW_EMPLOYEE_TEST = "Nowy pracownik";
    final static String EXPORT_TO_FILE = "Eksport do pliku";

    public static void main(String[] args) {

        Menu menu = new Menu(
                EMPLOYERS_LIST,
                NEW_EMPLOYEE_TEST,
                EXPORT_TO_FILE
                );

        Management_sys management = null;

        while(true) {

            switch (menu.printMenuAndGetChoice()) {
                case EMPLOYERS_LIST:

                    try{
                    management.displayAll();}
                        catch( NullPointerException e){
                            System.out.println("No employees");
                        }
                    break;

                case NEW_EMPLOYEE_TEST :
                    management = new Management_sys();
                    management.addTestEmployee();
                    break;

                case EXPORT_TO_FILE:
                    break;

                default:
                    System.out.println("Wrong choice!");

            }
        }
    }
}
