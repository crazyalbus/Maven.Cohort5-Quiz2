package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;
import com.zipcodewilmington.assessment2.part1.IntegerArrayUtilities;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> newArray1 = Arrays.asList(array1);
        List<Integer> newArray2 = Arrays.asList(array2);

        List<Integer> newList = new ArrayList<>();

        newList.addAll(newArray1);
        newList.addAll(newArray2);

        return newList.toArray(new Integer[newList.size()]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        List<Integer> fromNewStart = new ArrayList<Integer>();

        for (int i = index; i < array.length; i++) {
            fromNewStart.add(array[i]);
        }

        for (int i = 0; i < index; i++) {
            fromNewStart.add(array[i]);
        }

        return fromNewStart.toArray(new Integer[fromNewStart.size()]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer masterCounter = countOccurrenceTool(array1, valueToEvaluate) + countOccurrenceTool(array2, valueToEvaluate);

        return masterCounter;
    }

    public static Integer countOccurrenceTool(Integer[] array, Integer valueToEvaluate) {
        Integer counter = 0;

        for (Integer num: array
             ) {
            if(num == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }


    public static Integer mostCommon(Integer[] array) {

        HashMap count = intArrayToHashMap(array);

        Integer mostCommonCount = 0;
        Integer mostCommon = 0;

        for (Integer n : array
             ) {
            if((Integer) count.get(n) > mostCommonCount) {
                mostCommon = n;
                mostCommonCount ++;
            }
        }
        return mostCommon;
    }

    public static HashMap intArrayToHashMap(Object[] array) {
        HashMap count = new HashMap();
        for (Object n : array
        ) {
            if (!count.containsKey(n)) {
                count.put(n, 1);
            } else {
                Integer value = (Integer) count.get(n);
                count.replace(n, value + 1);
            }
        }
        return count;
    }


}


