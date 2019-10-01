package com.company;

import java.util.Scanner;

public class Company {

    final static String EMPLOYERS_LIST = "Lista pracownikow";
    final static String NEW_EMPLOYER = "Nowy pracownik";
    final static String EXPORT_TO_FILE = "Eksport do pliku";

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Menu menu = new Menu(
                EMPLOYERS_LIST,
                NEW_EMPLOYER,
                EXPORT_TO_FILE
                );


        switch (menu.printMenuAndGetChoice()){
            case EMPLOYERS_LIST:
                EmployersList employersList = new EmployersList();

                break;
            case NEW_EMPLOYER:
                break;
            case EXPORT_TO_FILE:
                break;
            default:

        }
    }
}
