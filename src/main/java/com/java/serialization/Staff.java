package com.java.serialization;

import java.io.Serializable;

public class Staff extends People implements Serializable {
    String id;
    String dept;

    public Staff(String name, String nationality, String id, String dept) {
        super(name, nationality);
        this.id = id;
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
