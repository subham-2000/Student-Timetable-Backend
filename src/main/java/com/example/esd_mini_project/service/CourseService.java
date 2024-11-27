package com.example.esd_mini_project.service;


import com.example.esd_mini_project.dto.CourseRequest;
import com.example.esd_mini_project.dto.CourseResponse;
import com.example.esd_mini_project.entity.Course;
import com.example.esd_mini_project.entity.Domain;
import com.example.esd_mini_project.mapper.CourseMapper;
import com.example.esd_mini_project.repository.CourseRepo;
import com.example.esd_mini_project.repository.DomainRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CourseService {
    private final CourseRepo courseRepo;
    private final CourseMapper courseMapper;
    private final DomainRepo domainRepo;

    public String createsCourse(CourseRequest request) {
        Course course = courseMapper.toCourse(request);
        Domain domain = domainRepo.findById(request.domain_id()).orElse(null);
        if (domain == null) {
            return "Specified domain does not exist";
        }
        course.setDomain(domain);
        courseRepo.save(course);
        return "Course created";
    }

    public List<CourseResponse> getCourse() {
        return courseRepo.findAll().stream().map(courseMapper::toCourseResponse).toList();

    }
}
