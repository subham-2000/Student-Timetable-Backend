package com.example.esd_mini_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DomainResponse(
        @JsonProperty("domain_id")
        long domain_id,

        @JsonProperty("domain_name")
        String domain_name
        ) {
}
