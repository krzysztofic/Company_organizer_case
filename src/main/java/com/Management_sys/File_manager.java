package com.Management_sys;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_manager {

    private FileReader fr = null;

    public String askForFileName(){
        System.out.println("Insert name of file: ");
        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }

    public void createFile() {
        File file = new File("src\\Resources\\" +askForFileName()+".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }



}
