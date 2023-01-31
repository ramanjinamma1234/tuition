package com.rs.tution;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class subjects {
    @Id
    private int id;
    private String name;
    private int fee;
    private int active;
    private int duration;
}
