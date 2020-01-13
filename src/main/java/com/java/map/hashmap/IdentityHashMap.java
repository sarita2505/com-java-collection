package com.java.map.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {
        Map<Integer,String> integerStringHashMap=new HashMap<>();
        integerStringHashMap.put(1,"aloka");
        integerStringHashMap.put(1,"nishan");
        System.out.println(integerStringHashMap);
        Map<Integer,String> integerStringIdentityHashMap=new java.util.IdentityHashMap<>();
        integerStringIdentityHashMap.put(1,"aloka");
        integerStringIdentityHashMap.put(2,"nishan");
        System.out.println(integerStringIdentityHashMap );
    }
}
