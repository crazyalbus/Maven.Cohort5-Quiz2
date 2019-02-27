package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    Integer numberToTest;
    String stringToTest;
    Character letterToTest;

    public BasicUtilities() {
        this.numberToTest = numberToTest;
    }

    public BasicUtilities(String stringToTest, Character letterToTest) {
        this.stringToTest = stringToTest;
        this.letterToTest = letterToTest;
    }

    public Boolean isGreaterThan5(Integer numberToTest) {

        return numberToTest >= 5;
    }

    public Boolean isLessThan7(Integer numberToTest) {

        return numberToTest <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {

        return isGreaterThan5(valueToEvaluate) && isLessThan7(valueToEvaluate);
    }

    public Boolean startsWith(String stringToTest, Character letterToTest) {

        return stringToTest.substring(0,1).equalsIgnoreCase(letterToTest.toString());
    }
}