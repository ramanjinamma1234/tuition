package com.rs.tution.repositories;

import com.rs.tution.entity.FacultySubjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultySubjectsRepository extends JpaRepository<FacultySubjects,Integer> {
}
