package com.rs.tuition.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Faculty {
    @Id
    private String id;
    private String firstname;
    private String lastName;
    private String password;
    private long phno;

}
