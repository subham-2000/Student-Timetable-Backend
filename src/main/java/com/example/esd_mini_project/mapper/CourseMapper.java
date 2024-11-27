package com.example.esd_mini_project.mapper;


import com.example.esd_mini_project.dto.CourseRequest;
import com.example.esd_mini_project.dto.CourseResponse;
import com.example.esd_mini_project.entity.Course;
import org.springframework.stereotype.Service;

@Service
public class CourseMapper {

    public Course toCourse(CourseRequest course)
    {
        return Course.builder()
                .courseCode(course.courseCode())
                .courseName(course.courseName())
                .facultyName(course.courseName())
                .build();
    }

    public CourseResponse toCourseResponse(Course course)
    {
        return new CourseResponse(
                course.getCourseCode(),
                course.getCourseName(),
                course.getFacultyName(),
                course.getCourseSchedules()
        );
    }
}
