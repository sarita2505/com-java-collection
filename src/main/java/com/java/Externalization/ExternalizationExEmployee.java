package com.java.Externalization;

import java.io.*;

public class ExternalizationExEmployee implements Externalizable//Serializable
{
    int id;
    String name;

    public ExternalizationExEmployee() {
        System.out.println("default constructor");
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        //out.writeInt(id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    name=(String) in.readObject();
    }
}
