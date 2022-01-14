package com.package2.collections;

import java.util.ArrayList;
import java.util.List;

public class program6 {
    //Given an element write a program to check if element(value) exists in ArrayList
    public static void main (String[] args){
        List<String> a1 = new ArrayList<>();
        a1.add("Car");
        a1.add("Bike");
        a1.add("Truck");
        a1.add("Bus");
        if(a1.contains("Bus"))
            System.out.println("True");
        else{
            System.out.println("False");
        }
    }
}
