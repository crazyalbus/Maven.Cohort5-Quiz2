package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class WuTangConcatenator {
    Integer numberToCheck;

    public WuTangConcatenator(Integer input) {
        numberToCheck = input;
    }

    public Boolean isWu() {

        return numberToCheck % 3 == 0;
    }

    public Boolean isTang() {

        return numberToCheck % 5 == 0;
    }

    public Boolean isWuTang() {

        return isWu() && isTang();
    }
}