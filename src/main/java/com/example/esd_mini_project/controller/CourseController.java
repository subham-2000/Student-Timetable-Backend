package com.example.esd_mini_project.controller;


import com.example.esd_mini_project.dto.CourseRequest;
import com.example.esd_mini_project.dto.CourseResponse;
import com.example.esd_mini_project.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping()
    public ResponseEntity<List<CourseResponse>> getAllCourses() {
        return ResponseEntity.ok(courseService.getCourse());
    }

    @PostMapping()
    public ResponseEntity<String> createCourse(@RequestBody CourseRequest request) {
        return  ResponseEntity.ok(courseService.createsCourse(request));
    }
}
