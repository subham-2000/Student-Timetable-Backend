package com.example.esd_mini_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record StudentCourseRequest(

        @JsonProperty("uuid")
        @NotNull(message = "cgpa should be present")
        @NotEmpty(message = "cgpa should be present")
        long uuid,

        @JsonProperty("student_id")
        @NotNull(message = "student_id should be present")
        @NotEmpty(message = "student_id should be present")
        long student_id,

        @JsonProperty("course_id")
        @NotNull(message = "course_id should be present")
        @NotEmpty(message = "course_id should be present")
        long course_id


) {
}
