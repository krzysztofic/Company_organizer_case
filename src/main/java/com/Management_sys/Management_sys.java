package com.Management_sys;

import com.company.Employee;
import java.util.ArrayList;
import java.util.List;


public class Management_sys {

    private List<Employee> employeeList = new ArrayList<>();

    private New_Employee ne = new New_Employee();
    private New_Employee_Test net = new New_Employee_Test();

    private int employeeNumber = 0;


    public void addEmployeeToList() {
        employeeList.add(ne.createNewEmployee());
        employeeNumber++;
    }

    public void addTestEmployee() {
        employeeList.add(net.newEmployeeTest());

    }

    public void displayAll() {
        employeeNumber = 0;
        try {
            for (Employee employee : employeeList) {
                System.out.println(++employeeNumber + ". ");
                employee.primaryView();
            }
        }catch(NullPointerException e){
            System.out.println("No employees...");
        }

    }




}
