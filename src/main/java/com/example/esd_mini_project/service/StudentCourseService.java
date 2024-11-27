package com.example.esd_mini_project.service;


import com.example.esd_mini_project.dto.StudentCourseRequest;
import com.example.esd_mini_project.dto.StudentResponse;
import com.example.esd_mini_project.entity.Course;
import com.example.esd_mini_project.entity.Student;
import com.example.esd_mini_project.entity.StudentCourse;
import com.example.esd_mini_project.mapper.StudentCourseMapper;
import com.example.esd_mini_project.mapper.StudentMapper;
import com.example.esd_mini_project.repository.CourseRepo;
import com.example.esd_mini_project.repository.StudentCourseRepo;
import com.example.esd_mini_project.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StudentCourseService {
    private final StudentCourseRepo studentCourseRepo;
    private final StudentCourseMapper studentCourseMapper;
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;
    private final StudentMapper studentMapper;

    public String create(StudentCourseRequest studentCourse) {
        StudentCourse element = studentCourseMapper.toStudentCourse(studentCourse);
        Student student = studentRepo.findById(studentCourse.student_id()).orElse(null);
        if(student == null) { return "Specified student does not exist"; }
        Course course =courseRepo.findById(studentCourse.course_id()).orElse(null);
        if(course == null) { return "Specified course does not exist"; }
        element.setCourse(course);
        element.setStudent(student);
        studentCourseRepo.save(element);
        return "Student course created";
    }


//    public List<StudentResponse> get(long cid) {
//        Course course =courseRepo.findById(cid).orElse(null);
//        return studentCourseRepo.findByCourse(course).stream()
//                .map(studentCourse -> studentMapper.toStudentResponse(studentCourse.getStudent()))
//                .toList();
//
//    }
public List<StudentResponse> get(String cid) {
        Course course =courseRepo.findByCourseCode(cid).orElse(null);
        return studentCourseRepo.findByCourse(course).stream()
                .map(studentCourse -> studentMapper.toStudentResponse(studentCourse.getStudent()))
                .toList();

   }

}
