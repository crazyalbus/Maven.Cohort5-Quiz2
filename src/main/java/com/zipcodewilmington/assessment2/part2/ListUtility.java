package com.zipcodewilmington.assessment2.part2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtility {
    List<Integer> list;

    public ListUtility() {
        list = new ArrayList();
    }



    public Boolean add(Integer i) {

        return list.add(i);

    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {

        List<Integer> unique = new ArrayList<>();

        for (Integer n: list
             ) {
            if(Collections.frequency(unique, n) < 1) {
                unique.add(n);
            }
        }

        return unique;
    }

    public String join() {
        String joinedNumbers = "";

        for (Integer n : list
             ) {
            joinedNumbers = joinedNumbers + n.toString() + ", ";
        }

        return joinedNumbers.substring(0, joinedNumbers.length() - 2);
    }

    public Integer mostCommon() {

        Integer[] listAsArray = list.toArray( new Integer[list.size()]);

        return ArrayUtility.mostCommon(listAsArray);
    }



    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
