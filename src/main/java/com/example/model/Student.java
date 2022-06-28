package com.example.model;

import lombok.Data;

@Data
public class Student {
    public String fName;
    public String lName;

    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

}
