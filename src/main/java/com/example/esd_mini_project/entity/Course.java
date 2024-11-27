package com.example.esd_mini_project.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long course_id;

    @Column(nullable = false , unique = true)
    private String courseCode;

    private String courseName;
    private String facultyName;

    @ManyToOne
    @JoinColumn(name = "domain_id", nullable = false)
    private Domain domain;

    @OneToMany(mappedBy = "course")
    private List<StudentCourse> studentCourses;

    @OneToMany(mappedBy = "course")
    private List<CourseSchedule> courseSchedules;

}
