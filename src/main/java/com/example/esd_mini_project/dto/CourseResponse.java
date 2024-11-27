package com.example.esd_mini_project.dto;

import com.example.esd_mini_project.entity.CourseSchedule;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record CourseResponse(

        @JsonProperty("courseCode")
        String courseCode,

        @JsonProperty("courseName")
        String courseName,

        @JsonProperty("facultyName")
        String facultyName,

        @JsonProperty("courseSchedule")
        List<CourseSchedule> courseSchedule

) {
}
