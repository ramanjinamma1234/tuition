package com.rs.tution.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Faculty {
    @Id
    private String id;
    private String firstName;
    private String lastname;
    private String phoneNo;
    private String password;

}
