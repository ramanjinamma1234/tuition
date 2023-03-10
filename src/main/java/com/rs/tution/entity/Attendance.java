package com.rs.tution.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int studentId;
    private String facultyId;
    private String attendanceDate;
    private String subject;
    private int attendance;
}
