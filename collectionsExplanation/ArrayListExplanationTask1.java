package com.learning.collectionsExplanation;

import java.util.ArrayList;

/**insert, update, delete, print operations on all collections (list, set, map)**/
public class ArrayListExplanationTask1 {
    public static void main(String[] args) {
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Mango");
        fruitsList.add("Apple");
        fruitsList.add("Blueberry");
        fruitsList.add("Banana");
        //list of all
        System.out.println("list of all\n" + fruitsList);
        //removing Apple
        fruitsList.remove("Apple");
        System.out.println(fruitsList);
        // fruitsList contains
        System.out.println(fruitsList.contains("Grapes"));
        System.out.println(fruitsList);
        fruitsList.add("Pineapple");
        System.out.println(fruitsList);
        int index = fruitsList.indexOf("Mango");
        fruitsList.set(index, "new Mango");
        fruitsList.set(1, "New Apple");
        System.out.println(fruitsList);

    }


}
