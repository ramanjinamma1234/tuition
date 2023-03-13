package com.rs.tution.controller;

import com.rs.tution.entity.Student;
import com.rs.tution.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServices studentServices;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return this.studentServices.getAllStudents();

    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return this.studentServices.getStudentById(id);
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return this.studentServices.addStudent(student);

    }
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return this.updateStudent(student);

    }
    @DeleteMapping("/students/{id}")
    public Student deleteStudentById(@PathVariable int id){
        return this.studentServices.deleteStudentById(id);
    }
}
