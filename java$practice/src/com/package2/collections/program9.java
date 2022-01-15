package com.package2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class program9 {
    //Write a program to sort HashMap by keys
    public static void main(String args[]) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(42,"Rani");
        hm.put(30, "Joy");
        hm.put(14, "Merry");
        hm.put(38, "Mike");
        System.out.println(hm);
        System.out.println("==================Before Sorting==============");
        for(Map.Entry<Integer,String>e :hm.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        System.out.println("================After Sorting==============");
        TreeMap<Integer,String> treemap = new TreeMap<>();
        // Copy all data from hashMap into TreeMap
        treemap.putAll(hm);
        for(Map.Entry<Integer,String>e :treemap.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }
}
