package com.package2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class program7 {
    //Write a program to convert Array to List
    public static void main(String[] args){
        //Method 1:Using Collections.addAll() method - High performance
        // Array Declaration and initialization
        String[] arr1 = {"ball","bench","book","glass"};
        // ArrayList Declaration and initialization
        ArrayList<String> al1 = new ArrayList<>();
        //converting Array to ArrayList
        Collections.addAll(al1,arr1);

        //adding new elements to the converted list
        al1.add("pen");
        al1.add("chalk");

        //Iterate
        Iterator itr1 = al1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("==============================");
        //Method2: using Array.asList() -Low performance
        // Array Declaration and initialization
        String[] arr2 = {"ball","bench","book","glass"};

       //Array to ArrayList conversion
        ArrayList<String> al2 = new ArrayList<>(Arrays.asList(arr2));
        //adding new elements to the converted list
        al2.add("pen");
        al2.add("chalk");

        //Iterate
        Iterator itr2 = al2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
