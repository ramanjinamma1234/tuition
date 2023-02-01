package com.rs.tution.repositories;

import com.rs.tution.entity.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<Subjects,Integer> {
}
