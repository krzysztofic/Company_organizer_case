package com.Management_sys;

public class Validators {

    public boolean isNameValid(String name){
        return name.matches("[a-zA-Z]+") && !name.isEmpty();
    }

    public boolean isSurnameValid(String surname){
        return surname.matches("[a-zA-Z]+") && !surname.isEmpty();
    }

    public boolean isGenderValid(char sex){
        return (sex == 'M') || (sex == 'F');
    }

    public boolean isAgeValid(int age){
        return (age > 18) && (age <= 80);
    }

    public boolean isNumberOfKidsValid(int kids){
        return (kids >=0) && (kids <=10);
    }

    public boolean isDepartmentNumberValid(int departmentNumber){
        return (departmentNumber >=1) && (departmentNumber <=5);
    }

    public boolean isSalaryValid(float salary){
        return salary >=0;
    }

    public boolean isMaritalStatusValid(char x){
        return x == 'Y' || x == 'N';
    }
}


