package com.java.serialization;

import java.io.Serializable;

public class People //implements Serializable
{
    String name;
    String nationality;

    public People() {
    }

    public People(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
