package com.softserve.academy.module11;

import java.util.*;
public class Program {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        //add elements to the map
        hashMap.put(1, "Mike");
        hashMap.put(2, "Nick");
        hashMap.put(3, "Sara");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Set<Integer>set=hashMap.keySet();
        for (Integer key:set) {
            System.out.println(key+": "+hashMap.get(key));
        }

        //get object by key 2
        String element = hashMap.get(2);
        System.out.println("Element by key 2: "+element);

         //returns a Set containing all map keys
        Set<Integer> keys = hashMap.keySet();
        System.out.println("Keys: " + keys);

        // get a set of all values
        Collection<String> values = hashMap.values();
        System.out.println("Values: " + values);

        //replace element
        hashMap.replace(3,"Alex");
        hashMap.remove(1);

        // deleting element by key 1
        hashMap.remove(1);

        // iterate through elements
        for (Integer key : keys) {
            System.out.print(key + ": ");
            System.out.println(hashMap.get(key));
        }
    }
}
