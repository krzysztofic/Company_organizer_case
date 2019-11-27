package com.Management_sys;

import com.company.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class File_manager {

    private Management_sys management = new Management_sys();

    private String askForFileName() {
        System.out.println("Insert name of file: ");
        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }

    public void saveDataToFile() {

        try {
            BufferedWriter save = new BufferedWriter(new FileWriter("C:\\Users\\Renata\\IdeaProjects\\company" +
                    "\\src\\Resources\\" + askForFileName() + ".txt"));

            for (Employee e : management.getEmployeeList()) {
                save.write(e.toString());
                save.newLine();
            }
            save.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromFile() {


        try {
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\Renata\\IdeaProjects\\company" +
                    "\\src\\Resources\\" + askForFileName() + ".txt"));
            String newLine;
            while ((newLine = read.readLine()) != null) {
                try {
                    String[] elements = newLine.split(";");
                    //char sex = 'K';
                    //        elements[4] = Character.toString(sex);
                    int age = parseInt(elements[2]);
                    int kids = parseInt(elements[3]);
                    int department_number = parseInt(elements[4]);
                    float salary = Float.parseFloat(elements[5]);
                    boolean marital_status = Boolean.parseBoolean(elements[6]);
                    Employee e = new Employee(elements[0],elements[1], age, kids, department_number, salary, marital_status);
                    management.getEmployeeList().add(e);
                }catch(NumberFormatException nfe){
                    System.out.println("Something goes wrong...");
                }
            }
                read.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry! There's no file like this.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}