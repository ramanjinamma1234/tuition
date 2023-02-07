package com.rs.tution.services;

import com.rs.tution.entity.Faculty;
import com.rs.tution.repositories.FacultyRepository;
import com.rs.tution.web.dto.FacultyRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyServiceImpl implements FacultyServices{
    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public Faculty save(FacultyRegistrationDto registrationDto) {
        Faculty faculty=new Faculty(registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                registrationDto.getPhone());
        return facultyRepository.save(faculty);
    }
}
