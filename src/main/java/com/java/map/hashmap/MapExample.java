package com.java.map.hashmap;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        //sortByValueInHashMap();
        treeMap();
    }
    public static void treeMap() {
        Map<String, String> employeeMap = new TreeMap<>();
        employeeMap.put("age", "23");
        employeeMap.put("city", "bangalore");
        employeeMap.put("salary", "23000");
        employeeMap.put("education", "mca");
        //System.out.println(employeeMap);
        iterateMapByKeySet(employeeMap);
        //iterateMapByEntrySet(employeeMap);
        //one method for reversing tree map
        Map<String,String> map=new TreeMap<>(Collections.reverseOrder());
        map.put("age", "23");
        map.put("city", "bangalore");
        map.put("salary", "23000");
        map.put("education", "mca");
        iterateMapByKeySet(map);


    }
    public static void reversTreeMap(Map<String,String> map)
    {
        Map map1=new TreeMap(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return 0;
                return o1.compareTo(o2);
            }
        });
    }

    public static void sortByValueInHashMap() {
        //here comparator compares entries in natural order of keys..
        Map<String, String> map = new HashMap<>();
        map.put("name", "ashoka");
        map.put("city", "mumbai");
        map.put("state", "maharastra");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //iterateMapByKeySet(map);
        //iterateMapByEntrySet(map);
        System.out.println("try to sort the hashMap by values");
        //we can not add the <key,value> into a list so we need to add entries in it
        List<Map.Entry<String, String>> list = new ArrayList();
        list.addAll(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                //return 0;
                return o1.getValue().compareTo(o2.getValue());
            }

        });
        System.out.println("list can sort be sort by values");
        System.out.println(list);
        System.out.println("there is no effect in hashmap");
        System.out.println(map);

    }

    public static void iterateMapByEntrySet(Map<String, String> map) {
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = (Map.Entry<String, String>) iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }
    }

    public static void iterateMapByKeySet(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String keys = (String) iterator.next();
            System.out.println(keys + " " + map.get(keys));
        }

    }
}

