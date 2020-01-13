package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMapEx {
    public static void main(String[] args) {
        Map hashMap=new HashMap();
        Map weakhashMap=new WeakHashMap();
        String s1=new String("hello");
        String s2=new String("hii");
        hashMap.put( s1,"vvv");
        weakhashMap.put(s2,"xyx");
        System.gc();
        System.out.println("before: hashmap "+hashMap.get("hello")+" weakHashmap: "+weakhashMap.get("hii"));
        s1=null;
        s2=null;
        System.gc();
        System.out.println("after: hashmap "+hashMap.get("hello")+" weakHashmap: "+weakhashMap.get("hii"));
        Map<Integer,String> map=new HashMap<>();
        Map<Integer,String> map1=new WeakHashMap<>();
        Integer int1=new Integer(1);
        Integer int11=new Integer(2);

        System.out.println(map.get(1));
        System.out.println(map1.get(2));
        System.out.println("=======================");
        Set<Integer> key1=map.keySet();
        Set<Integer> key2=map1.keySet();
        key1=null;
        key2=null;
        System.gc();
        System.out.println(map.get("key1"));
        System.out.println(map1.get("key2"));
    }
}
