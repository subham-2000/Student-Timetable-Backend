package com.example.esd_mini_project.controller;

import com.example.esd_mini_project.dto.StudentResponse;
import com.example.esd_mini_project.dto.StudentCourseRequest;
import com.example.esd_mini_project.service.StudentCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/studentcourse")
@RequiredArgsConstructor

public class StudentCourseController {
    private final StudentCourseService studentCourseService;

//    @GetMapping("/{cid}")
//    public ResponseEntity<List<StudentResponse>> getStudent(@PathVariable("cid") int cid) {
//        return ResponseEntity.ok(studentCourseService.get(cid));
//    }

    @GetMapping("/{cid}")
   public ResponseEntity<List<StudentResponse>> getStudent(@PathVariable("cid") String cid) {
        return ResponseEntity.ok(studentCourseService.get(cid));
    }

    @PostMapping
    public ResponseEntity<String> createStudentCourse(@RequestBody StudentCourseRequest studentCourse) {
        return ResponseEntity.ok(studentCourseService.create(studentCourse));
    }
}
