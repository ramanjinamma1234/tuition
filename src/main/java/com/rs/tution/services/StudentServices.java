package com.rs.tution.services;

import com.rs.tution.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServices {

    public List<Student> getAllStudents();
    public Student getStudentById(int id);
    public Student addStudent(Student student);
    public Student deleteStudentById(int id);
    public Student updateStudent(Student student);
}
