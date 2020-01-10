package com.java.serialization;

import java.io.*;

public class DeserializeEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EmployeeData object;
        FileInputStream fileInputStream=new FileInputStream("employee.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        object=(EmployeeData) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(object.getDept());
        System.out.println(object.getId());
        System.out.println(object.getName());
        System.out.println(object.getAddressEmp());

    }
}
