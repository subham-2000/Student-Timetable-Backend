package com.example.esd_mini_project.service;

import com.example.esd_mini_project.dto.LoginRequest;
import com.example.esd_mini_project.dto.LoginResponse;
import com.example.esd_mini_project.dto.StudentRequest;
import com.example.esd_mini_project.dto.StudentResponse;
import com.example.esd_mini_project.entity.Domain;
import com.example.esd_mini_project.entity.Student;
import com.example.esd_mini_project.helper.EncryptionService;
import com.example.esd_mini_project.helper.JWTHelper;
import com.example.esd_mini_project.mapper.StudentMapper;
import com.example.esd_mini_project.repository.DomainRepo;
import com.example.esd_mini_project.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;

@RequiredArgsConstructor

@Service

public class StudentService {
    private final StudentMapper studentMapper;
    private final StudentRepo studentRepo;
    private final DomainRepo domainRepo;
    private final EncryptionService encryptionService;
    private final JWTHelper jwtHelper;

    public String createStudent(StudentRequest studentRequest) {
        Student newStudent = studentMapper.toStudent(studentRequest);
        Domain domain =domainRepo.findById(studentRequest.domain_id()).orElse(null) ;
        if(domain == null){
            return "Specified domain does not exist";
        }
        newStudent.setDomain(domain);
        newStudent.setPassword(encryptionService.encode(newStudent.getPassword()));
        studentRepo.save(newStudent);
        return "Student Created Successfully";
    }

    public List<StudentResponse> getStudent() {
        return studentRepo.findAll().stream().map(studentMapper::toStudentResponse).toList();
    }

    private Student getStudent(String email) {
        return studentRepo.findByEmail(email)
                .orElse(null);
    }


//     public String login( LoginRequest request) {
//        Student student = getStudent(request.email());
//            if(!encryptionService.validates(request.password(), student.getPassword())) {
//            return "Wrong Password or Email";
//        }
//           // return "Student Login Successfully";
//
//            return jwtHelper.generateToken(request.email());
//    }
public LoginResponse login(LoginRequest request) {
    Student student = getStudent(request.email());

    // Validate the password
    if (!encryptionService.validates(request.password(), student.getPassword())) {
        throw new RuntimeException("Wrong Password or Email");
    }

    // Generate the JWT token
    String token = jwtHelper.generateToken(request.email());

    // Return both the JWT token and the request email
    return LoginResponse.builder()
            .jwt(token)
            .email(request.email())
            .build();
}


}
