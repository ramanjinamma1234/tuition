package com.rs.tution.repositories;

import com.rs.tution.entity.StudentFacultySubjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentFacultySubjectsRepository extends JpaRepository<StudentFacultySubjects,Integer> {
}
