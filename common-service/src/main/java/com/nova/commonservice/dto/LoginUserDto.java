package com.nova.commonservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserDto {
    private Long logInUserId;
    private  String adhar;
    private String age;
    private String address;
    private LocalDate dob;
    private String email;
    private Long roleId;
    private String firstName;
    private String gender;
    private Long orgId;
    private String lastName;
    private  String phone;
    private String username;

}
