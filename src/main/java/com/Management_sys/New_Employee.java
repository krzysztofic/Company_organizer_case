package com.Management_sys;

import com.company.Employee;
import java.util.Scanner;

public class New_Employee {

    private Scanner scan = new Scanner (System.in);

    Employee createNewEmployee() {
        Employee employee = new Employee(addName(), addSurname(), addSex());
        employee.setAge(addAge());
        return employee;
    }

    private String addName(){
        System.out.println("Insert name: ");
        return scan.next();
    }

    private String addSurname(){
        System.out.println("Insert surname: ");
        return scan.next();
    }

    private char addSex(){
        System.out.println("Insert sex: ");
        return scan.next().charAt(0);
    }

    private int addAge(){
        System.out.println("Insert age: ");
        return scan.nextInt();
    }

}


