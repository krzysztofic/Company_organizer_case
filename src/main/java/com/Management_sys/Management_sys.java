package com.Management_sys;

import com.company.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Management_sys{

    private Scanner scan = new Scanner(System.in);

    private Employee employee;
    private int employeeNumber = 0;

    private static ArrayList<Employee> employeeList = new ArrayList<>();

    List<Employee> getEmployeeList() {   //getter to use in File_manager
        return employeeList;
    }


    public void addEmployeeToList() {
        employeeList.add(createNewEmployee());
        employeeNumber++;
    }

    public void displayAll() {

        try {
            for (Employee employee : employeeList) {
                System.out.println(++employeeNumber + ". ");
                employee.primaryView();
            }
        }catch(NullPointerException e){
            System.out.println("No employees...");
        }
    }


    Employee createNewEmployee() {
        employee = new Employee(addName(), addSurname(), addSex());
        employee.setAge(addAge());
        employee.setKids(addKids());
        employee.setDepartment_nr(addDepartmentNumber());
        employee.setSalary(addSalary());
        employee.setMarital_status(addMaritalStatus());
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

    private int addKids(){
        System.out.println("How many kids: ");
        return scan.nextInt();
    }

    private int addDepartmentNumber(){
        System.out.println("Insert Department number: ");
        return scan.nextInt();
    }

    private float addSalary(){
        System.out.println("Insert Salary: ");
        return scan.nextFloat();
    }

    private boolean addMaritalStatus(){

        System.out.println("Is he married? (Y/N): ");
        char x = scan.next().charAt(0);
        return x == 'Y';
    }


}
