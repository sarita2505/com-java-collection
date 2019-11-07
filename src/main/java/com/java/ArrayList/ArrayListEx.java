package com.java.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(100);
        list.add(250);
        list.add(3);
        list.add(400);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("sort the list"+list);
        Collections.reverse(list);
        System.out.println("revers the list"+list);
        Collections.sort(list,Collections.reverseOrder());//revers order require comparator
        System.out.println("by using revers order"+list);
        //int index=Collections.
       // System.out.println(index);
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1=(Integer)o1;
                Integer i2=(Integer)o2;
                return - i1.compareTo(i2);
            }
        });
        System.out.println("by using comparator"+list);
    }


}
