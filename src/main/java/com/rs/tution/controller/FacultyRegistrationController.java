package com.rs.tution.controller;

import com.rs.tution.services.FacultyServices;
import com.rs.tution.web.dto.FacultyRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class FacultyRegistrationController {
    @Autowired
    private FacultyServices facultyServices;

    @GetMapping
    public String getRegistrationForm(){
        return "registration";
    }
    @PostMapping
    private String registerFacultyAccount(@ModelAttribute("Faculty")FacultyRegistrationDto registrationDto){
        facultyServices.save(registrationDto);
        return "redirect/registration?success";
    }
}
