package com.example.esd_mini_project.controller;

import com.example.esd_mini_project.dto.StudentResponse;
import com.example.esd_mini_project.dto.StudentRequest;
import com.example.esd_mini_project.entity.Student;
import com.example.esd_mini_project.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAllStudents() {

        return ResponseEntity.ok(studentService.getStudent());
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody StudentRequest studentRequest) {
        return ResponseEntity.ok(studentService.createStudent(studentRequest));
    }
}
