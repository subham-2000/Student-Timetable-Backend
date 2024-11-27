package com.example.esd_mini_project.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="Domain")
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long domain_id;

    @Column(nullable = false)
    private String domain_name;

    @Column(nullable = false)
    private  long capacity;

    @OneToMany(mappedBy = "domain")
    private List<Student> students;

    @OneToMany(mappedBy = "domain")
    private List<Course> courses;
}
