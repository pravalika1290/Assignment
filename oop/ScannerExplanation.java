package com.learning.oop;

import java.util.Scanner;

public class ScannerExplanation {
    public  static void main(String[] args){
        String name;
        int age;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");


        name = scanner.nextLine();
        System.out.println(" Your name is : " + name);

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println(" Your age is : " + age);


    }
}
