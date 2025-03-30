package org.example;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkOfArrays {
    public static void main(String[] args) {

        List<String> foundElement = new ArrayList<>();
        foundElement.add("Java");
        foundElement.add("Python");
        foundElement.add("C#");
        foundElement.add("C++");
        for (int i = 0; i < 1; i++) {
            System.out.println("Python:  " + foundElement.contains("Python"));
            System.out.println("RandomValue: " + foundElement.contains("NNN"));
        }

        List<String> addElement = new ArrayList<>();
        addElement.add("ElementOne");
        addElement.add("ElementTwo");
        addElement.add("ElementThree");
        for (int i = 0; i < 1; i++) {
            addElement.add("Kek");
            if (addElement.contains("Kek")) {
                System.out.println("Welcome new element: " + addElement.getLast());
                System.out.println("You array lenght is: " + addElement.toArray().length);
            } else {
                System.out.println("Kek not found");
            }
        }

        for (int i = 0; i < 1; i++) {
            addElement.remove("ElementThree");
            if (addElement.contains("ElementTwo")) {
                System.out.println("You have element: " + addElement);
                System.out.println("You array lenght is: " + addElement.toArray().length);
            } else {
                System.out.println("ElementThree not remove");
            }

        }
    }
}
