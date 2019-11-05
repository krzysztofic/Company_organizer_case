package com.Management_sys;

import com.company.Employee;

import java.util.ArrayList;

public class Management_sys {

    ArrayList<Employee> employeelist = new ArrayList<>();
    private Employee employee = null;


    private Employee newEmployeeTest() {
        employee = new Employee("Slawek", "Kowalski", 'M');
        employee.setAge(25);
        employee.setKids(4);
        employee.setDepartment_nr(1);
        employee.setSalary(3500);
        employee.setMarital_status(true);
        return employee;
    }

    public void addTestEmployee() {
        employeelist.add(newEmployeeTest());

    }

    public void displayAll() {
        for (Employee value : employeelist) {
            value.primaryView();

        }
    }
}
