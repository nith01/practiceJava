package com.package2.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class program2 {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();
        l1.add("Car");
        l1.add("Bike");
        l1.add("Truck");
        System.out.println(l1);
        System.out.println("================");
         l1.remove(1);
        System.out.println(l1);
        System.out.println( l1.size());
        l1.clear();
        System.out.println(l1.size());





}
}

