package com.java.map.treemap;

import java.util.*;

public class TreeMapByComparator
{
    public static void main(String[] args) {
        Map map=new TreeMap(new OwnComparator());
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");
        System.out.println(map);

    }
}
class OwnComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return -o1.toString().compareTo(o2.toString());
    }
}