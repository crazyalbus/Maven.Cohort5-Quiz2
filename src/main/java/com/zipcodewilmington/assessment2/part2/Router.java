package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Router {
    Map pathMap;

    public Router() {
        pathMap = new TreeMap();
    }

    public void add(String path, String controller) {
        pathMap.put(path, controller);
    }

    public Integer size() {
        return pathMap.size();
    }

    public String getController(String path) {
        return pathMap.get(path).toString();
    }

    public void update(String path, String studentController) {
        pathMap.replace(path, studentController);
    }

    public void remove(String path) {
        pathMap.remove(path);
    }

    public String toString() {
        String printEntries = "";
        Set entries = pathMap.entrySet();

        for (Object entry: entries
             ) {

            String newLine = entry.toString().replace("=", " -> ");

            printEntries = printEntries + newLine + "\n";
        }
        return printEntries;

//        /user -> UserController

    }

}
