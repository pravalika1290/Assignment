package com.learning.exceptionsExplanation;

public class ExceptionsTryAndCatch {
    public static void main(String[] args) {
        try {
            int[] a = {12, 4, 92};
            System.out.println(a[0]);
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Exception happend");
        }
    }
}