package com.package2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class program5 {
    //Write a program to traverse(or iterate) HashSet
    public static void main (String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Papaya");
        //Iterate using Iterator
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
