package com.pm.patientservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record PatientResponseDTO(@NotNull String id , String name , String email, String address , String dateOfBirth) {
}
