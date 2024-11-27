package com.example.esd_mini_project.mapper;


import com.example.esd_mini_project.dto.StudentCourseRequest;
import com.example.esd_mini_project.entity.StudentCourse;
import org.springframework.stereotype.Service;

@Service
public class StudentCourseMapper {

    public StudentCourse toStudentCourse(StudentCourseRequest studentCourse) {
        return StudentCourse.builder()
                .uuid(studentCourse.uuid())
                .build();
    }
}
