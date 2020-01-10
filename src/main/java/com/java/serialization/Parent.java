package com.java.serialization;

import java.io.Serializable;
//here we are avoiding the child to implement serialization..
public class Parent implements Serializable {
    int i;

    public Parent() {
    }

    public Parent(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
