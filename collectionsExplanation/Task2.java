package com.learning.collectionsExplanation;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Person p1 = new Person("Bob", "Sports");
        Person p2 = new Person("Kevin", "Fun");
        Person p3 = new Person("Kev", "Pool");
        //List
        List<Person> personsList = new ArrayList<>();

        personsList.add(p1);
        personsList.add(p2);
        personsList.add(p3);
        System.out.println(personsList);

        //set
        Set<Person> personsSet = new HashSet<>();
        personsSet.add(p1);
        personsSet.add(p2);
        personsSet.add(p3);
        System.out.println(personsSet);

        //Map
        Map<Integer, Person> personsMap = new HashMap<>();
        personsMap.put(1, p1);
        personsMap.put(2, p2);
        personsMap.put(3, p3);
        System.out.println(personsMap);

    }
}

class Person {
    private String name;
    private String department;

    public Person(String name, String department) {
        this.name = name;
        this.department = department;

    }
}