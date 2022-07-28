package com.learning.collectionsExplanation;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExplanation {
    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<Integer>();

        linky.add(9);
        linky.add(12);
        linky.add(44);
        System.out.println(linky.getLast());
        Iterator it = linky.iterator();
        while (it.hasNext()) {
            if ((int) it.next() == 12) {
                System.out.println(" found 12");
            }
        }

    }
}

