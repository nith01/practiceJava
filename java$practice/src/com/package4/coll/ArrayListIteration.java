package com;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(4);
        al.add(34);
        al.add(40);

        ListIterator<Integer> li = al.listIterator();
        while(li.hasNext()){
            Integer i = li.next();
            System.out.println(i);

        }
    }
}
