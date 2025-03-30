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
        System.out.println(foundElement.contains("Python"));
        System.out.println(foundElement.contains("Java"));

        List<String> addElement = new ArrayList<>();
        addElement.add("ElementOne");
        addElement.add("ElementTwo");
        addElement.add("ElementThree");
        System.out.println(addElement);
        System.out.println(addElement.toArray().length);
        addElement.add ("Kek");
        System.out.println(addElement);
        System.out.println(addElement.toArray().length);
        addElement.remove("Kek");
        System.out.println(addElement);
        System.out.println(addElement.toArray().length);
    }
}
