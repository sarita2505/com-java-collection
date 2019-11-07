package com.java.map.hashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
    public static void main(String[] args) {
        Map map=new Hashtable();
        map.put(new Employee(1),"a");
        map.put(new Employee(2),"b");
        map.put(new Employee(3),"c");
       // map.put(new Employee(4),null);//nullPointerException
    }
}
class Employee{
    int id;

    public Employee(int id) {
        this.id = id;
    }
}