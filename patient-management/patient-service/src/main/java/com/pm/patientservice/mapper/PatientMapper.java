package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.entity.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient){
        if (patient == null) {
            return null;
        }

       return PatientResponseDTO.builder().id(patient.getId().toString()).name(patient.getName()).
                address(patient.getAddress()).email(patient.getEmail()).dateOfBirth(patient.getDateOfBirth().toString()).build();
    }

    public static Patient toEntity(PatientRequestDTO dto) {
        if (dto == null) {
            return null;
        }

        Patient patient = new Patient();
        patient.setName(dto.name());
        patient.setEmail(dto.email());
        patient.setAddress(dto.address());
        patient.setDateOfBirth(LocalDate.parse(dto.dateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(dto.registeredDate()));

        return patient;
    }
}
