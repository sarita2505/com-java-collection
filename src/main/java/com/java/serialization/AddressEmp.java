package com.java.serialization;

import java.io.Serializable;

public final class  AddressEmp //implements Serializable
        {
    String state;
    String country;

    public AddressEmp() {
    }

    public String getState() {
        return state;
    }

    public AddressEmp setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressEmp setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return "AddressEmp{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
