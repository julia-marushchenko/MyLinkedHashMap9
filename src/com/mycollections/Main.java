/**
 *  Java program to traverse through the LinkedHashMap instance.
 */

package com.mycollections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating LinkedHashMap instance.
        Map<Double, Integer> myMap = new LinkedHashMap<>();

        // Adding keys and values to myMap.
        myMap.put(2.0, 1234);
        myMap.put(3.1, 12);
        myMap.put(7.9, 900);
        myMap.put(5.3, 800);
        myMap.put(2.6, 710);

        // Printing keys of myMap.
        for (Double key : myMap.keySet()) {
            System.out.print(key + " "); // Output: 2.0 3.1 7.9 5.3 2.6
        }

        // New line.
        System.out.println();

        // Printing values of myMap.
        for (Integer val : myMap.values()) {
            System.out.print(val + " "); // Output: 1234 12 900 800 710
        }
    }
}