package com.example.esd_mini_project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "CourseSchedule")
public class CourseSchedule {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String time;
    private String day;
    private String room_no;
    private String building;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    private Course course;
}
