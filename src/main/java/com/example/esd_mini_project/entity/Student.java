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
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;

    @Column(nullable = false , unique = true)
    private long rollNo;
    private String firstName;
    private String lastName;

    @Column(nullable = false , unique = true)
    private String email;

    private String password;
    @ManyToOne
    @JoinColumn(name = "domain_id", nullable = false)
    private Domain domain;

    @OneToMany(mappedBy = "student")
    private List<StudentCourse> studentCourses;
}
