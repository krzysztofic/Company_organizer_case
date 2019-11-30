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
        return (age > 1) && (age <= 100);
    }

}
