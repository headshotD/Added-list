package org.example;

import java.util.*;

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
        System.out.println("123 " + lectures.contains("java"));

        oleg.printSomeValues(12, "Hello", lectures);

        int[] i = new int[]{5, 1, 2, 3, 4};
        int[] i2 = new int[]{1, 1, 2, 3, 4};
        System.out.println(i[0]);
        int[][] biArray = new int[][]{
                i, i2
        };
        System.out.println(biArray[1][1]);

        for (int is = lectures.toArray().length - 1; is >= 0; is--) {
            System.out.println(lectures.toArray()[is]);
        }
        for (int is = 0; is < lectures.toArray().length; is++) {
            System.out.println(lectures.toArray()[is]);
        }
        for (String lectureName : lectures) {
            if(lectureName.startsWith("j")){
                System.out.println("tyt " + lectureName);
                break;

            }
            //System.out.println("new " + lectureName);

        }
        int index = 0;
        while (index < lectures.toArray().length) {
            System.out.println(lectures.toArray()[index]);
            index++;
        }
//        do {
//
//        } while ();

List<Integer> age = new ArrayList<>();
        age.add(5);
        age.add(22);
        age.add(02);
        age.add(13);
        age.add(37);
        System.out.println(age);
        for (int l = 0; l < age.toArray().length;l++){
            System.out.println("New " + l + age);
        }
        Set<String> uniqValues = Set.of("One","Twp"); // new HashSet
        //uniqValues.add("One");
        //uniqValues.add("Two");
        System.out.println(uniqValues);

        Map<String, HumanNew> humans = new HashMap<>();
        humans.put("1337", oleg);
        humans.put("0595", oleg);
        humans.put("1234", oleg);
        humans.put("5555", oleg);
        humans.put("3333", oleg);
        for (Map.Entry<String, HumanNew> entry : humans.entrySet()){
            entry.getKey();
            entry.getValue();
        }
        for(String key: humans.keySet()){

        }
        for(HumanNew value : humans.values()){

        }

    }
}