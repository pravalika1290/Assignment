package com.learning.collectionsExplanation;

import java.util.HashSet;
import java.util.Set;
/**insert,delete, print operations on all collections (set)**/
public class SetTask {
    public static void main(String[] args) {
        Set<String> mySubjects = new HashSet<>();

        //Add elements to Set
        mySubjects.add("Physics");
        mySubjects.add("Chem");
        mySubjects.add("Math");
        //Print all subjects
        for (String edu: mySubjects) {
            System.out.println(edu);
        }
        mySubjects.add("Coding");
        System.out.println("after adding coding:\n" + mySubjects);
        mySubjects.remove("Chem");
        System.out.println("after removing Chem:\n" + mySubjects);
    }
}
