package com.Management_sys;

import com.company.Employee;

public class New_Employee_Test {

    Employee newEmployeeTest() {
        Employee employee = new Employee("Slawek", "Kowalski", 'M');
        employee.setAge(25);
        employee.setKids(4);
        employee.setDepartment_nr(1);
        employee.setSalary(3500);
        employee.setMarital_status(true);
        return employee;
    }

}
