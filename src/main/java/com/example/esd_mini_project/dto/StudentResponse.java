package com.example.esd_mini_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StudentResponse(

        @JsonProperty("firsName")
        String firstName,

        @JsonProperty("lastName")
        String lastName

) {
}
