package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;


public class IntegerArrayUtilities{


    public Boolean hasEvenLength(Integer[] arrayToTest) {

        return arrayToTest.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
//        List<Integer> rangeArray = new ArrayList<>();
//
//        for (int i = start; i <= stop ; i++) {
//            rangeArray.add(start);
//        }
//
////        Integer[] rangeArray = new Integer[Math.abs((start - stop) + 1)];
////
////        for (int i = 1; i <= stop + 1 ; i++) {
////            tempArray[i] = i;
////        }
//        Integer[] rangeToReturn = (Integer[]) rangeArray.toArray();

        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] arrayToTest) {

        return arrayToTest[0] + arrayToTest[1];
    }

    public Integer getProductOfFirstTwo(Integer[] arrayToTest) {

        return arrayToTest[0] * arrayToTest[1];
    }

}