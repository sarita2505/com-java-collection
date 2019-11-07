package com.java.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Map map=new TreeMap();
        map.put(1,"hii");
       // map.put(null,"gang");//we can't take null key
        map.put(2,null);
        map.put(3,4);
        //map.put("hello",1);the keys should be homogenious type otherwise you will get classcastException
        System.out.println(map);
    }
}
