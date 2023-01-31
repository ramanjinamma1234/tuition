package com.rs.tution.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private int age;

}
