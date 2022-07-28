package com.learning.oop;

interface fun {
    String grocery = " Bill";

    void january();
    void february();
}

public class InterfaceExplanation implements fun {
    public static void main(String[] args) {
       System.out.println(grocery);
        InterfaceExplanation ex= new InterfaceExplanation();
        ex.february();
    }

    @Override
    public void january() {
        System.out.println("january success!");
    }

    @Override
    public void february() {
        System.out.println("for february need to Pay");
    }
}
