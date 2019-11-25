package com.Management_sys;

import com.company.Employee;

import java.io.*;
import java.util.Scanner;

public class File_manager {

    private Management_sys management = new Management_sys();

    private String askForFileName() {
        System.out.println("Insert name of file: ");
        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }

    public void saveDataToFile() throws IOException {

        BufferedWriter save = new BufferedWriter(new FileWriter("C:\\Users\\Renata\\IdeaProjects\\company" +
                "\\src\\Resources\\" + askForFileName() + ".txt"));
        try {
            for(Employee e : management.getEmployeeList()) {
                save.write(e.toString());
                save.newLine();
            }
                save.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
