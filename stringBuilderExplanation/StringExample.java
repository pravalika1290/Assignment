package com.learning.stringBuilderExplanation;

public class StringExample {
    public static void main(String[] args) {

        String info = "";
        info += "My name is Pravs.";
        info += "";
        info += " I'm a Student.";
        System.out.println(info);

        StringBuilder sb = new StringBuilder();
        sb.append("My name is Sravs.");
        sb.append(" ");
        sb.append("I'm an Engineer.");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is blabla.")
                .append(" ")
                .append("I'm a Car.");
        System.out.println(s.toString());
        System.out.println("I am learning Java.\tThis is gonna be fun.\nI may find a new Job.");

        System.out.printf("Total cost %10d; quantity %d\n", 3, 100);

        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d: Some Text here.\n", i);
        }
    }
}

