package com.package2.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class program8 {
    //Write a program to add elements to the HashMap given the key and value data type is String
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("1", "Apple");
        hm.put("2", "Banana");
        hm.put("3", "Pear");
        hm.put("4", "Watermelon");
        System.out.println(hm);
        System.out.println("============using foreach loop==============");
        //using foreach loop
        for (String str : hm.keySet()) {
            System.out.println(str + ":" + hm.get(str));
        }
        System.out.println("==============using Iterator===============");
        //using Iterator
        Set<String> keySet = hm.keySet();
        Iterator<String> itr = keySet.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key + ":" + hm.get(key));

        }
        System.out.println("==================using entrySet=====================");
        //using entrySet
//        Set<Map.Entry<String,String>> entrySet = hm.entrySet();
//        for (Map.Entry entry:entrySet){

        for (Map.Entry<String, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
            System.out.println("=================using combination of entrySet and Iterator======================");


            //using combination of entrySet and Iterator
            Set<Map.Entry<String, String>> entrySet1 = hm.entrySet();
            Iterator<Map.Entry<String, String>> entrySetItr = entrySet1.iterator();
            while (entrySetItr.hasNext()) {
                Map.Entry entry = entrySetItr.next();
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
            System.out.println("==================size=====================");
            System.out.println("Size is : " + hm.size());
            hm.clear();
            System.out.println("Is the HashMap empty? " + hm.isEmpty());
        }
    }

