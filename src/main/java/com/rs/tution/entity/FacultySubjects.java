package com.rs.tution.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class FacultySubjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String facultyId;
    private String subject;
    private int active;
}
