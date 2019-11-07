package com.java.arrays;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String[] s={"a","b","c","d","e"};
       List l= Arrays.asList(s);
        System.out.println(l);
        //l.add("f");//un supported opreation exception
        s[0]="z";
        for (String s1:s
             ) {
            System.out.println(s1);
        }
        l.set(1,"sorry");
        System.out.println(l);
        //l.set(1,1);//Array store exception
        //System.out.println(l);

    }

}
