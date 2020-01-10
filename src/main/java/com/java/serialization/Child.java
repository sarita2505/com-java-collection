package com.java.serialization;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//we don't want to make child as serialized so we need to impement the private readObject
//and writeObject method
public class Child extends Parent {
    int y;
    public Child(int i, int y) {
        super(i);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public Child setY(int y) {
        this.y = y;
        return this;
    }
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        throw new NotSerializableException();
    }
    private void readObject(ObjectInputStream objectInputStream) throws IOException{
        throw new NotSerializableException();
    }
}
