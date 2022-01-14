package com.package2.collections;

import java.util.ArrayList;

public class program4 {
    //Write a program to convert List to Array.
    public static void main (String[] args){
        //ArrayList declaration and initialization
        ArrayList<String> al = new ArrayList<String>();
        al.add("cat");
        al.add("dog");
        al.add("Fox");
        al.add("horse");
        System.out.println(al);

        //ArrayList to Array conversion
        String[] arr = new String[al.size()]; //create a empty array object
        for(int i=0; i<al.size();i++){
           arr[i] = al.get(i);
        }
        for (String j:arr) {
            System.out.println(j);
        }
    }
}
