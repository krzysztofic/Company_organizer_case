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

    private int departmentSize(int departmentNumber) {
        int employeesInDepartment = 0;
        for (int i = 0; i < management.getEmployeeList().size(); i++) {
            if (management.getEmployeeList().get(i).getDepartment_nr() == departmentNumber) {
                employeesInDepartment++;
            }
        }
        return employeesInDepartment;
    }

    public double averageSalaryInDepartment(int departmentNumber){

        double averageSalary = 0;
        int size = departmentSize(departmentNumber);

        for (int i = 0; i < management.getEmployeeList().size(); i++) {
            if(management.getEmployeeList().get(i).getDepartment_nr() == departmentNumber){
                averageSalary +=management.getEmployeeList().get(i).getSalary();
            }
        }
        averageSalary /= size;

        return averageSalary;
    }
}
