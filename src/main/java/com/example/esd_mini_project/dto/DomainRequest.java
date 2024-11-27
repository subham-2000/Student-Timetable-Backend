package com.example.esd_mini_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record DomainRequest(

    @NotNull(message = "Domain name should be present")
    @NotEmpty(message = "Domain name should be present")
    @JsonProperty("domain_name")
     String name,

    @JsonProperty("capacity")
    long capacity
) {
}
