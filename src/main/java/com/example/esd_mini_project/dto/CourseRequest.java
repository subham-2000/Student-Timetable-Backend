package com.example.esd_mini_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record CourseRequest(

        @JsonProperty("courseCode")
        @NotNull(message = " courseCode should be present")
        @NotEmpty(message = "courseCode should be present")
        String courseCode,

        @JsonProperty("courseName")
        @NotNull(message = "courseName should be present")
        @NotEmpty(message = "courseName should be present")
        String courseName,

        @JsonProperty("facultyName")
        @NotNull(message = "facultyName should be present")
        @NotEmpty(message = "facultyName should be present")
        String facultyName,

        @JsonProperty("domain_id")
        @NotNull(message = "domain_id should be present")
        @NotEmpty(message = "domain_id should be present")
        long domain_id
) {
}
