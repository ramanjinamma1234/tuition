package com.rs.tution.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Subjects {
    @Id
    private int id;
    private String name;
    private int fee;
    private int active;
    private int duration;
}
