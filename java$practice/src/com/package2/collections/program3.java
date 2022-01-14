package com.package2.collections;

import java.util.ArrayList;
import java.util.Iterator;

//Write a program to traverse (or iterate) ArrayList
public class program3 {
    public static void main (String[] args){
        //Initialize arraylist
        ArrayList<Integer>al =new ArrayList<Integer>();
        //Add elements to arraylist object
        al.add(25);
        al.add(54);
        al.add(7);
        al.add(40);

        System.out.println("use for loop to iterate");
        for (Integer i:al)
            System.out.println(i);

        System.out.println("use Iterator for Traversing ArrayList");
        Iterator itr = al.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        System.out.println("use of Collection stream() util");
        al.forEach((num) -> {
            System.out.println(num);
        });
    }
    }

