package com.zipcodewilmington.assessment2.part1;

import java.util.Spliterator;

import static java.util.Arrays.copyOfRange;
import static java.util.Arrays.spliterator;

public class IntegerArrayUtilities{


    public Boolean hasEvenLength(Integer[] arrayToTest) {

        return arrayToTest.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer[] tempArray = new Integer[stop + 2];

        for (int i = 1; i <= stop + 1 ; i++) {
            tempArray[i] = i;
        }

        return copyOfRange(tempArray, start, stop + 1);
    }

    public Integer getSumOfFirstTwo(Integer[] arrayToTest) {

        return arrayToTest[0] + arrayToTest[1];
    }

    public Integer getProductOfFirstTwo(Integer[] arrayToTest) {

        return arrayToTest[0] * arrayToTest[1];
    }

}