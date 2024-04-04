package com.nova.ownerservice.dto;

import com.nova.entityservice.entity.Organization;
import com.nova.entityservice.entity.Role;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
public class OwnerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String pin;
    private String gender;
    private LocalDate createdAt;
    private Boolean status;
    private Boolean isDeleted;
    private Long createdBy;
    private String username;
    private String password;
    private String adharNo;
    private String adharPhoto;
    private String ownerPhoto;
    private String otp;
    private Boolean isPhoneNoVerified;
}
