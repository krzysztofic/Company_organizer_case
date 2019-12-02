package com.Management_sys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorsTest {


    private Validators valid = new Validators();

    @Test
    void isNameValid() {
        String name = "M!r3k";
        assertFalse(valid.isNameValid(name));
    }

    @Test
    void isSurnameValid() {
        String surname = "Mar3Ck1";
        assertFalse(valid.isNameValid(surname));
    }

    @Test
    void isGenderValid() {
        char sex = 'G';
        assertFalse(valid.isGenderValid(sex));
    }

    @Test
    void isAgeValid() {
        int age = 'k';
        assertFalse(valid.isAgeValid(age));
    }

    @Test
    void isAgeNegative() {
        int age = -7;
        assertFalse(valid.isAgeValid(age));
    }

    @Test
    void isSalaryValid() {
        float salary = 46.87F;
        assertTrue(valid.isSalaryValid(salary));
    }

    @Test
    void isMaritalStatusValid() {
        char x = 'Y';
        assertTrue(valid.isMaritalStatusValid(x));

    }
}