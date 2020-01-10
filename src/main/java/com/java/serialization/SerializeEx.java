package com.java.serialization;

import java.io.*;

public class SerializeEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EmployeeData data = new EmployeeData();
        data.setId(1);
        data.setName("a");
        data.setDept("cs");

         AddressEmp addressEmp=new AddressEmp();
        addressEmp.setState("odisha").setCountry("India");

        data.setAddressEmp(addressEmp);

        FileOutputStream outputStream = new FileOutputStream("employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(data);
        System.out.println("serialized");
        objectOutputStream.close();
        outputStream.close();


    }
}
