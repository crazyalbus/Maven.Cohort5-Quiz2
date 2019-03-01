package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> newArray = new ArrayList<>(Arrays.asList(array1));

        newArray.addAll(Arrays.asList(array2));

        return newArray.toArray(new Integer[newArray.size()]);
    }


    public Integer[] rotate(Integer[] array, Integer index) {

        List<Integer> toRotate = Arrays.asList(array);

        Collections.rotate(toRotate, toRotate.size() - index);

        return toRotate.toArray(new Integer[toRotate.size()]);
    }


    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Collection arrayAsCollection = Arrays.asList(merge(array1, array2));

        return Collections.frequency(arrayAsCollection, valueToEvaluate);
    }


    public static Integer mostCommon(Integer[] array) {

        Collection arrayAsCollection = Arrays.asList(array);

        int mostCommonCount = 0;
        Integer mostCommon = 0;

        for (Integer n : array
             ) {
            if((Collections.frequency(arrayAsCollection, n) > mostCommonCount)) {
                mostCommon = n;
                mostCommonCount ++;
            }
        }
        return mostCommon;
    }

}


