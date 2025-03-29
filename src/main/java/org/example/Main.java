package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HumanNew oleg = new HumanNew();
List<String> lectures = new ArrayList<>();
lectures.add("git");
lectures.add("java");
lectures.add("files");
lectures.add("junit");

        oleg.printSomeValues(12, "Hello", lectures );

        int[] i = new int[] {5,1,2,3,4};
        int[] i2 = new int[] {1,1,2,3,4};
        System.out.println(i[0]);
        int [][] biArray = new int[][] {
                i, i2
        };
        System.out.println(biArray[1][1]);



    }
}