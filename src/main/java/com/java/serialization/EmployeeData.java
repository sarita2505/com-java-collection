package com.java.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeData implements Serializable {
    int id;
    String name;
    String dept;
    //employee has a address..so address class must be serializable else get r.e.
    //you can make the fileld transient if you don't have acess to modify the sourse code
    //but during deserialization you will get null as the output of the field
    //you can;t get the state of object..so

    transient  AddressEmp addressEmp;

    private void writeObject(ObjectOutputStream outputStream) throws IOException,ClassNotFoundException{
        outputStream.defaultWriteObject();
        outputStream.writeObject(addressEmp.getCountry());
        outputStream.writeObject(addressEmp.getState());
    }
    private void readObject(ObjectInputStream inputStream)throws IOException,ClassNotFoundException{
        inputStream.defaultReadObject();
        String country=(String) inputStream.readObject();
        String state=(String) inputStream.readObject();
        addressEmp = new AddressEmp();
        addressEmp.setCountry(country);
        addressEmp.setState(state);
    }

    public AddressEmp getAddressEmp() {
        return addressEmp;
    }

    public void setAddressEmp(AddressEmp addressEmp) {
        this.addressEmp = addressEmp;
    }

    public EmployeeData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", addressEmp=" + addressEmp +
                '}';
    }
}
