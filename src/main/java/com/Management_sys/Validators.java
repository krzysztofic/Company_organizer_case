package com.Management_sys;

public class Validators {

    public boolean isNameValid(String name){
        return name.matches("[a-zA-Z]+") && !name.isEmpty();
    }
}
