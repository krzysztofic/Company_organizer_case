package com.Management_sys;

public class Additional_options {

    private Management_sys management = new Management_sys();

    public short employeesWithSpecifiedSalary(float givenSalary){

        short employeesWithSpecifiedSalary = 0;

        for (int i = 0; i < management.getEmployeeList().size(); i++) {
            if(management.getEmployeeList().get(i).getSalary() >= givenSalary){
                employeesWithSpecifiedSalary++;
            }
        }
        return employeesWithSpecifiedSalary;
    }


}
