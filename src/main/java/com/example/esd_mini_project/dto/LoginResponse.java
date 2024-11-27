package com.example.esd_mini_project.dto;
import lombok.Builder;

@Builder
public record LoginResponse(
        String jwt,
        String email

) {
}
