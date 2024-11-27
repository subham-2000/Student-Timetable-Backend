package com.example.esd_mini_project.controller;



import com.example.esd_mini_project.dto.CourseScheduleRequest;
import com.example.esd_mini_project.entity.CourseSchedule;
import com.example.esd_mini_project.service.CourseScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/courseschedule")
@RequiredArgsConstructor

public class CourseScheduleController {
    private final CourseScheduleService courseScheduleService;

    @PostMapping
    public ResponseEntity<String> createCourseSchedule(@RequestBody CourseScheduleRequest courseSchedule) {
        return ResponseEntity.ok(courseScheduleService.create(courseSchedule));
    }
}
