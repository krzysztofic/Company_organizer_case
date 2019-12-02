package com.Management_sys;

import com.company.Employee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Management_sys{

    private Scanner scan = new Scanner(System.in);
    private Validators v = new Validators();

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


    private Employee createNewEmployee() {
        employee = new Employee(addName(), addSurname(), addSex());
        employee.setAge(addAge());
        employee.setKids(addKids());
        employee.setDepartment_nr(addDepartmentNumber());
        employee.setSalary(addSalary());
        employee.setMarital_status(addMaritalStatus());
        return employee;
    }

    private String addName(){
        String name = "";
        System.out.println("Insert name: ");
        while(!v.isNameValid(name)) {
            name = scan.next();
        }
        return name;
    }

    private String addSurname(){
        String surname = "";
        System.out.println("Insert surname: ");
        while(!v.isSurnameValid(surname)) {
            surname = scan.next();
        }
        return surname;
    }

    private char addSex(){
        char sex = ' ';
        System.out.println("Insert sex: (M or F)");
        while(!v.isGenderValid(sex)){
            sex = scan.next().charAt(0);
        }
        return sex;
    }

    private int addAge(){
        int age = 0;
        System.out.println("Insert age: ");
        do {
            try {
                age = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Not a digit or not between 18-80");
            }
            scan.nextLine();
        }
        while(!v.isAgeValid(age));
        return age;
    }

    private int addKids(){
        int kids = 0;
        System.out.println("How many kids: ");
        do {
            try {
                kids = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Not a digit or not between 0-10");
            }
            scan.nextLine();
        }
        while(!v.isNumberOfKidsValid(kids));
        return kids;
    }

    private int addDepartmentNumber(){
        int departmentNumber = 0;
        System.out.println("Insert Department number: ");
        do {
            try {
                departmentNumber = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Not a digit or not between 0-5");
            }
            scan.nextLine();
        }
        while(!v.isDepartmentNumberValid(departmentNumber));
        return departmentNumber;
    }

    private float addSalary(){
        float salary = 0;
        System.out.println("Insert Salary: ");
        do {
            try {
                salary = scan.nextFloat();
            } catch (InputMismatchException ex) {
                System.out.println("Not a digit...");
            }
            scan.nextLine();
        }
        while(!v.isSalaryValid(salary));
        return salary;
    }

    private boolean addMaritalStatus(){
        char x = ' ';
        System.out.println("Is he married? (Y/N): ");
        while(!v.isMaritalStatusValid(x)) {
            x = scan.next().toUpperCase().charAt(0);
        }
        return x == 'Y';
    }

}
