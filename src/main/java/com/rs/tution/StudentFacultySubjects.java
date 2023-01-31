package com.rs.tution;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class StudentFacultySubjects {
    @Id
    private int id;
    private int sid;
    private String fid;
    private String subject;

}
