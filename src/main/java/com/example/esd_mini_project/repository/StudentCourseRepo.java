package com.example.esd_mini_project.repository;

import com.example.esd_mini_project.entity.Course;
import com.example.esd_mini_project.entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentCourseRepo extends JpaRepository<StudentCourse,Long> {
    List<StudentCourse> findByCourse(Course course);
}
