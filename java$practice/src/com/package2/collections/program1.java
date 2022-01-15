package com.package2.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class program1 {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("Car");
        a1.add("Bike");
        a1.add("Truck");
        a1.add("Bus");
        System.out.println("ArrayList elements are");
        System.out.println("\t"+ a1);
        System.out.println("================using for loop==================");
        for (int i = 0; i < a1.size(); i++)
            System.out.println(a1.get(i));
        System.out.println("================using foreach loop==================");
        for (String i : a1) {
            System.out.println(i);}

            ArrayList<Integer> myNum = new ArrayList<Integer>();
            myNum.add(10);
            myNum.add(15);
            myNum.add(20);
            myNum.add(25);
        System.out.println("================using foreach loop==================");
            for (int j : myNum) {
                System.out.println(j);
            }
        }
    }



