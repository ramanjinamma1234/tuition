package com.rs.tution.repositories;

import com.rs.tution.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty,String> {
}
