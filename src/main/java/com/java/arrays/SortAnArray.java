package com.java.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortAnArray {
    public static void main(String[] args) {
        //sortIntArray();
        //sortStringArray();
        binarySearchEx();
    }

    public static void sortIntArray() {
        int[] a = {60, 10, 30, 40, 50};
        for (int i : a) {
            System.out.println("without sorting" + i);
        }
        Arrays.sort(a);
        for (int i : a) {
            System.out.println("after sorting" + i);
        }

    }

    public static void sortStringArray() {
        String[] str = {"b", "z", "c", "d", "i"};
        for (String s:str) {
            System.out.println(s);
        }
        Arrays.sort(str);
        for (String s:str) {
            System.out.println(s);
        }
        System.out.println("sort by using comparator");
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        for (String s:str) {
            System.out.println(s);
        }
    }
    public static void binarySearchEx(){
        int[] a={10,30,40,20};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,40));
        String[] s={"z","x","y"};
        Arrays.sort(s);
        for (String str:s
             ) {
            System.out.println(str );

        }
        System.out.println(Arrays.binarySearch(s,"x"));
    }

}
