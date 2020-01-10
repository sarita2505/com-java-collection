package com.java.Externalization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserExt
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExternalizationExEmployee exEmployee=null;
        FileInputStream fileInputStream=new FileInputStream("Ext.ser");;
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        exEmployee=(ExternalizationExEmployee)objectInputStream.readObject();
        System.out.println(exEmployee.getId()+"---"+exEmployee.getName());
    }
}
