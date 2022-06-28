package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name =  "employess")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(name = "first_name" , nullable = false)
    public  String fName;
    @Column(name = "last_name")
    public String lName;
    @Column(name = "email")
    public String email;
}
