package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {


    public int compare(Animal animal1, Animal animal2) {
        return Integer.compare(animal2.getSpeed(), animal1.getSpeed());
    }
}
