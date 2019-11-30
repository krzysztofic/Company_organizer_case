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


}