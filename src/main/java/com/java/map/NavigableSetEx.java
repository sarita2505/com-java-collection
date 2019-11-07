package com.java.map;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

//navigable set is the child interface of sorted set
public class NavigableSetEx {
    public static void main(String[] args) {
//navigableSet();
        navigableMap();

    }
public static void navigableSet(){
    TreeSet treeSet=new TreeSet();
    treeSet.add(3000);
    treeSet.add(4000);
    treeSet.add(5000);
    treeSet.add(6000);
    treeSet.add(7000);
    System.out.println(treeSet.ceiling(4000));//return the lowest which is >=e
    System.out.println(treeSet.floor(5000));//return the highest which is <=e
    System.out.println(treeSet.higher(5000));//return the lowest which is >e
    System.out.println(treeSet.lower(5000));//return the higher which is <e
    System.out.println(treeSet.descendingSet());
    System.out.println(treeSet.pollFirst());
    System.out.println(treeSet.pollLast());
}
public static void navigableMap(){
    TreeMap<Integer,String> treeMap=new TreeMap<>();
    treeMap.put(1,"hello");
    treeMap.put(2,"hiii");
    treeMap.put(3,"done");
    treeMap.put(4,"roojjjj");
    treeMap.put(5,"notappi");
    System.out.println(treeMap.ceilingEntry(3));
    System.out.println(treeMap.ceilingKey(3));
    System.out.println(treeMap.higherKey(3));
    System.out.println(treeMap.lowerKey(3));
    System.out.println(treeMap.floorKey(3));
}

}
