package com.java.Externalization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExt {
    public static void main(String[] args) throws IOException {
        ExternalizationExEmployee exEmployee=new ExternalizationExEmployee();
        exEmployee.setId(1);
        exEmployee.setName("nagama");
        FileOutputStream fileOutputStream=new FileOutputStream("Ext.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(exEmployee);
        System.out.println("serialized");
    }
}
