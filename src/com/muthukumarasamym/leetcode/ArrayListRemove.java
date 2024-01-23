package com.muthukumarasamym.leetcode;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Using an iterator to safely remove elements
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Banana")) {
                // Safely remove "Banana" from the list
                iterator.remove();
            }
        }

        // Print the modified list
        System.out.println("Modified ArrayList: " + myList);
    }
}

