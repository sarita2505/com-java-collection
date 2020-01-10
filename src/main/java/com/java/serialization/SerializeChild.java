package com.java.serialization;

import java.io.*;

public class SerializeChild {
    public static void main(String[] args) throws IOException {
        Child child=new Child(10,20);
        System.out.println("i= :"+child.i);
        System.out.println("j= :"+child.y);
        FileOutputStream fileOutputStream=new FileOutputStream("child.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        try {
            objectOutputStream.writeObject(child);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("serialized");

    }
}
