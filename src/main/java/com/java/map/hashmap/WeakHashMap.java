package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMap {
    public static void main(String[] args) {
        Map<Employee,String> employeeStringMap=new HashMap<>();
        Employee e=new Employee();
        employeeStringMap.put(e,"hii");
        System.out.println(employeeStringMap);

        e=null;
        System.gc();
        System.out.println(employeeStringMap);
        Map<Employee,String> employeeStringMap1=new java.util.WeakHashMap<>();
        Employee e1=new Employee();
        employeeStringMap1.put(e1,"hello");
        System.out.println(employeeStringMap1);
        e1=null;
        System.gc();
        System.out.println(employeeStringMap1);
    }
}
class Employee{
    @Override
    public String toString() {
        return "Employee{}";
    }
}