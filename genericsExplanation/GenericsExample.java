package com.learning.genericsExplanation;

public class GenericsExample {
    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter= new Printer<>(34.5);
        doublePrinter.print();

    }
}