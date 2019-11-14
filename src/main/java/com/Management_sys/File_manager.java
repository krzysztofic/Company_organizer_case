package com.Management_sys;

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

        ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Renata\\IdeaProjects\\company" +
                "\\src\\Resources\\" + askForFileName() + ".txt"));
        try {
            save.writeObject(management.employeeList);
            save.flush();
            save.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
