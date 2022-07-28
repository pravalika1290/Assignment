package com.learning.collectionsExplanation;

import java.util.HashMap;
import java.util.Map;

/**
 * insert, update, delete, print operations on all collections (map)
 **/
public class MapTask1 {
    public static void main(String args[]) {
        Map<Integer, String> myFav = new HashMap<Integer, String>();

        //Add elements to map
        myFav.put(1, "Noodles");
        myFav.put(2, "Soup");
        myFav.put(3, "Biryani");
        myFav.put(4, "Chic_Biryani");
        myFav.put(5, "Dum-Biryani");
        for (String food: myFav.values()) {
            System.out.println(food);
        }
        myFav.remove(2);
        System.out.println(myFav);
        myFav.put(6,"Rice");
        System.out.println(myFav);
        myFav.replace(3, "Roti");
        System.out.println(myFav);
    }
}