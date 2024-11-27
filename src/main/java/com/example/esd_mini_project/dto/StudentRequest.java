package com.example.esd_mini_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record StudentRequest(
        @JsonProperty("rollNo")
        @NotNull(message = "Domain name should be present")
        @NotEmpty(message = "Domain name should be present")
         long rollNo,

        @JsonProperty("firstName")
        @NotNull(message = " firstName should be present")
        @NotEmpty(message = "firstName should be present")
         String firstName,

        @JsonProperty("lastName")
        @NotNull(message = "lastName should be present")
        @NotEmpty(message = "lastName should be present")
         String lastName,

        @JsonProperty("email")
        @NotNull(message = "email should be present")
        @NotEmpty(message = "email should be present")
         String email,

        @JsonProperty("password")
        @NotNull(message = "email should be present")
        @NotEmpty(message = "email should be present")
        String password,


        @JsonProperty("domain_id")
        @NotNull(message = "domain_id should be present")
        @NotEmpty(message = "domain_id should be present")
        long domain_id


) {
}
