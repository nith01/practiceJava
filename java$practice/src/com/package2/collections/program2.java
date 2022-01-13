package com.package2.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class program2 {
    public static void main(String[] args) {
        List<String> a1 = new LinkedList<>();
    a1.remove(1);
        System.out.println(a1);
        System.out.println( a1.size());
        a1.clear();
        System.out.println(a1);




    List l1 = new LinkedList();
        l1.add("Car");
        l1.add("Bike");
        l1.add("Truck");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);
}
}

