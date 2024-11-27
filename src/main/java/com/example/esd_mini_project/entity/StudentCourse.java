package com.example.esd_mini_project.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "StudentCourse")
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uuid;

    @ManyToOne
    @JoinColumn(name="student_id" , nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name="course_id" , nullable = false)
    private Course course;
}
