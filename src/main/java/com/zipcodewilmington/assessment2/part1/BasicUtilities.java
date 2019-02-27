package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    Integer numberToTest;
    String stringToTest;
    Character letterToTest;

    public BasicUtilities(Integer numberToTest) {
        this.numberToTest = numberToTest;
    }

    public BasicUtilities(String stringToTest, Character letterToTest) {
        this.stringToTest = stringToTest;
        this.letterToTest = letterToTest;
    }

    public Boolean isGreaterThan5(Integer value) {

        return numberToTest > 5;
    }

    public Boolean isLessThan7(Integer value) {

        return numberToTest < 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {

        return isGreaterThan5(valueToEvaluate) && isLessThan7(valueToEvaluate);
    }

    public Boolean startsWith(String string, Character character) {

        return stringToTest.substring(0,1).equals(letterToTest.toString());
    }
}


//* Create a class `BasicUtilities` which evaluates integers with relational operators.
//        * `isGreaterThan5` should return `true` if the input is more than `5`, else false.
//        * `isLessThan7` should return `true` if the input is less than `7`, else false.
//        * `IsBetween5And7` should return `true` if the input is less than `7` and more than 5, else false.
