package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "user_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "pin")
	private String pin;

	@Column(name = "gender")
	private String gender;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "adhar_no")
	private String adharNo;

	@Column(name = "adhar_photo")
	private String adharPhoto;

	@Column(name = "owner_photo")
	private String ownerPhoto;

	@Column(name = "otp")
	private String otp;

	@Column(name = "is_phone_no_verified")
	private Boolean isPhoneNoVerified;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "role_id")
	private Role role;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "org_id")
	private Organization organization;

}
