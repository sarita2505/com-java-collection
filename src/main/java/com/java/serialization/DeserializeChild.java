package com.java.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeChild  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Child child=null;
        FileInputStream fileInputStream=new FileInputStream("child.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        child =(Child)objectInputStream.readObject();
        System.out.println(child.getI());
        System.out.println(child.getY());
    }

}
