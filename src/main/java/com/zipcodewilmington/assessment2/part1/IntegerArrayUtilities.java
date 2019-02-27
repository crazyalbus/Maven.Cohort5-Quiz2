package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;


public class IntegerArrayUtilities{


    public Boolean hasEvenLength(Integer[] arrayToTest) {

        return arrayToTest.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        List<Integer> rangeArray = new ArrayList<>();

        for (int i = start; i <= stop ; i++) {
            rangeArray.add(i);
        }

        Integer[] convertRange = convertArrayIntList(rangeArray);

        return convertRange;
    }

    public static Integer[] convertArrayIntList(List<Integer> array) {
        Integer[] intArray = new Integer[array.size()];

        for (int i = 0; i < array.size(); i++) {
            intArray[i] = array.get(i);
        }
        return intArray;

    }



    public Integer getSumOfFirstTwo(Integer[] arrayToTest) {

        return arrayToTest[0] + arrayToTest[1];
    }

    public Integer getProductOfFirstTwo(Integer[] arrayToTest) {

        return arrayToTest[0] * arrayToTest[1];
    }

}