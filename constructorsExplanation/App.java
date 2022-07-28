package com.learning.constructorsExplanation;

class Machine {
    private String name;//every time object created,constructor runs.
    private int code;

    public Machine() { //this constructor is not have return type,same name as class
        this("Bob",11); //you can change or call any constructor in another constructor.
        System.out.println("Constructor running!");
        name = "Bob";
    }

    public Machine(String name) {
        System.out.println("Second Constructor running!");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third Constructor running!");
        this.name = name;
        this.code = code;
    }

}

public class App {//this is main method.

    public static void main(String[] args) {
        Machine machine1 = new Machine();//this is an object for class.
        Machine machine2 = new Machine("Kevin");
        Machine machine3 = new Machine("Kev", 12);
    }
}
