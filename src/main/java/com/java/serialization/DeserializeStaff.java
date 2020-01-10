package com.java.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeStaff {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Staff staff=null;
        FileInputStream fileInputStream=new FileInputStream("staff.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        staff=(Staff) objectInputStream.readObject();
        System.out.println(staff.getName());
        System.out.println(staff.getNationality());
        System.out.println(staff.getId());
        System.out.println(staff.getDept());
    }
}
