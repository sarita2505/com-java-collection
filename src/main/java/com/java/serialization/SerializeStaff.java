package com.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeStaff {
    public static void main(String[] args) throws IOException {
        Staff staff=new Staff("hari prasad","Indian","i01","computer science");
//        System.out.println(staff.getName());;
//        staff.getNationality();
//        staff.getId();
//        staff.getDept();
        FileOutputStream fileOutputStream=new FileOutputStream("staff.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(staff);
        System.out.println("serialized");
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
