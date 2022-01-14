package com.package2.collections;

import java.util.ArrayList;
import java.util.Collections;

public class program10 {
//Sorting ArrayList in Descending Order
    public static void main(String args[]) {

        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Apple");
        arraylist.add("Banana");
        arraylist.add("Pear");
        arraylist.add("Mango");

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("ArrayList Before Sorting:");
        for(String str: arraylist){
            System.out.println(str);
        }

        /* Sorting in decreasing (descending) order*/
        Collections.sort(arraylist, Collections.reverseOrder());

        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for(String str: arraylist){
            System.out.println(str);
        }
    }
}

