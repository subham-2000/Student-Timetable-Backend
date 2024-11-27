package com.example.esd_mini_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record CourseScheduleRequest(

        @JsonProperty("time")
        @NotNull(message = "cgpa should be present")
        @NotEmpty(message = "cgpa should be present")
        String time,

        @JsonProperty("day")
        @NotNull(message = "student_id should be present")
        @NotEmpty(message = "student_id should be present")
        String day,

        @JsonProperty("room_no")
        @NotNull(message = "course_id should be present")
        @NotEmpty(message = "course_id should be present")
        String room_no,

        @JsonProperty("building")
        @NotNull(message = "course_id should be present")
        @NotEmpty(message = "course_id should be present")
        String building,

        @JsonProperty("course_id")
        @NotNull(message = "course_id should be present")
        @NotEmpty(message = "course_id should be present")
        long course_id
) {
}
