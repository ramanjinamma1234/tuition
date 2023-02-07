package com.rs.tution.services;
import com.rs.tution.entity.Faculty;
import com.rs.tution.web.dto.FacultyRegistrationDto;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

public interface FacultyServices {

    Faculty save(FacultyRegistrationDto registrationDto);



//    private List<Faculty> faculties=Arrays.asList(
//            new Faculty("abc@gmail.com","rama","golla","9491836654","G@g@nesh"),
//            new Faculty("sap@gmail.com","sap","koduri","9441454590","password")
//    );
//    public List<Faculty> getAllFaculties(){
//        return faculties;
//    }

}
