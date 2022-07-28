package com.learning.oop;

public class SchoolId {
    public static void main(String[] args) {

      /*  String name;
        int age;
        String bloodGroup;


        Scanner scanner = new Scanner(System.in);
        // System.out.println(" Enter your name");

        name = scanner.next();
        System.out.println(" Name: " + name);

        //System.out.println(" Enter your age");
        age = scanner.nextInt();
        System.out.println(" Age: " + age);
        //System.out.println(" Enter your blood group");
        bloodGroup = scanner.next();

        boolean Red = true;
        boolean Blue = true;
        boolean Yellow = true;
        String Id = null;
        if (age >= 20) {
            Id = "Red Group";
        } else if ((age < 20) && (age >= 15)) {
            Id = "Blue Group";
        } else if ((age < 15) && (age >= 10)) {
            Id = "Yellow Group";
        }

        System.out.println("Name: " + name);
        System.out.println(" Age: " + age);
        System.out.println(" Blood group: " + bloodGroup);
        System.out.println("---------------------------------------------");
        System.out.println(" Your group is " + Id);
        System.out.println("---------------------------------------------");

//for loop
        double n = 1;

        do {
            System.out.println("type number");
            n = scanner.nextDouble();
        } while (n %2 !=0);
        System.out.println(" The number is prime " + n );
        scanner.close();
      //  for (int i = 1; i <= n; i++) {
            //int count = 0;
            //for (int j = 2; j < i; j++) {
            // if (i % j == 0) {
            //  count++;





        double[] myArray = new double[3];
        myArray[0] = 32.2456d;
        myArray[1] = 34.2556d;
        myArray[2] = 3.2656d;

        double sumOfNumbers = 0;
        for (double num: myArray){
            sumOfNumbers +=num;
           // System.out.println(num);
        }

        System.out.println("Sum of numbers: " + sumOfNumbers);*/

        int[][] myFirst2DArray = {
                {3, 5, 1, 9},
                {10, 15, 3, 0},
                {1, 11, 31, 90},
                {2, 51, 1, 9}
        };
        int sum = 0;
        for (int row = 0; row < myFirst2DArray.length; row++) {
            //sum += myFirst2DArray[row][column];

            for (int column = 0; column < myFirst2DArray[row].length; column++) {
                sum += myFirst2DArray[row][column];
                //System.out.print("myFirst2DArray[row][column] " + sum);
            }
        }
        System.out.println(sum);
    }

}


