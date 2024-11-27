package com.example.esd_mini_project.mapper;



import com.example.esd_mini_project.dto.StudentRequest;
import com.example.esd_mini_project.dto.StudentResponse;
import com.example.esd_mini_project.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    public Student toStudent(StudentRequest student)
    {
        return Student.builder()
                .rollNo(student.rollNo())
                .firstName(student.firstName())
                .lastName(student.lastName())
                .email(student.email())
                .password(student.password())
                .build();
    }

    public StudentResponse toStudentResponse(Student student)
    {
        return new StudentResponse(
            student.getFirstName(),
            student.getLastName()
        );
    }
}
