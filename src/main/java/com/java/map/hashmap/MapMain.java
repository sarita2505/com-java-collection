package com.java.map.hashmap;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        //mapOperations();
        hashMap();
//        linkedHashMap();
  //   treeMap();
//        treeMapReversOrderKeys();
//        sortByValues();
    }


    public static void sortByValues(){
        Map<String,String> dataMap=new HashMap<>();
        dataMap.put("brand","lg");
        dataMap.put("group","electronic");
        dataMap.put("country","india");
        System.out.println(dataMap);
        Set<Map.Entry<String,String>> entrySet=dataMap.entrySet();
        List<Map.Entry<String,String>> entryList=new ArrayList<>(entrySet);
        System.out.println(entryList);

        Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                //return 0;
                String value1=o1.getValue();
                String value2=o2.getValue();
                return value1.compareTo(value2);
            }
        });

        System.out.println(entryList);
        System.out.println(dataMap);

    }
    public static void treeMapReversOrderKeys() {
        Map<String, String> employeeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return 0;
                return -o1.compareTo(o2);
            }
        });
        employeeMap.put("age", "23");
        employeeMap.put("city", "bangalore");
        employeeMap.put("salary", "23000");
        employeeMap.put("education", "mca");

        System.out.println(employeeMap);
    }
    public static void treeMap() {
        Map<String, String> employeeMap = new TreeMap<>();
        employeeMap.put("age", "23");
        employeeMap.put("city", "bangalore");
        employeeMap.put("salary", "23000");
        employeeMap.put("education", "mca");
        System.out.println(employeeMap);
        displayMapKeySet(employeeMap);
        displayMapEntry(employeeMap);
    }
    public static void linkedHashMap() {
        Map<String, String> employeeMap = new LinkedHashMap<>();
        employeeMap.put("age", "23");
        employeeMap.put("city", "bangalore");
        employeeMap.put("salary", "23000");
        employeeMap.put("education", "mca");

        System.out.println(employeeMap);
        displayMapKeySet(employeeMap);
        displayMapEntry(employeeMap);
    }

    public static void hashMap() {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("age", "23");
        employeeMap.put("city", "bangalore");
        employeeMap.put("salary", "23000");
        employeeMap.put("education", "mca");

        System.out.println(employeeMap);
//        displayMapKeySet(employeeMap);
//        displayMapEntry(employeeMap);
    }

    public static void mapOperations() {
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("city", "bangalore");
        System.out.println(dataMap.put("state", "kanataka"));
        ;
        dataMap.put("country", "india");
        System.out.println(dataMap);
        Map<String, String> zoneMap = new HashMap<String, String>(dataMap);
        System.out.println(zoneMap);
        zoneMap.put("zone", "south");
        System.out.println(zoneMap);
        dataMap.putAll(zoneMap);
        System.out.println(dataMap);
        System.out.println(dataMap.put("state", "panjab"));
        ;
        System.out.println(dataMap);
        dataMap.putIfAbsent("state", "odisha");
        System.out.println(dataMap);
        boolean flag = dataMap.containsKey("state");
        System.out.println(flag);
        boolean valueFlag = dataMap.containsValue("panjab");
        System.out.println(valueFlag);
        dataMap.replace("state", "odisha");
        System.out.println(dataMap);
        dataMap.replace("state", "odisha", "delhi");
        System.out.println(dataMap);
        System.out.println(dataMap.remove("state"));
        System.out.println(dataMap);
        System.out.println(dataMap.remove("country", "india"));
        System.out.println(dataMap);
        displayMapEntry(dataMap);
        displayMapKeySet(dataMap);
    }

    public static void displayMapKeySet(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        for (String key : keySet
        ) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static void displayMapEntry(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()
        ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
