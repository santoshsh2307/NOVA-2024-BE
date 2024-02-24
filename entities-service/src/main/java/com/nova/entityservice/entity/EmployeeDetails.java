package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "shop_id")
	private ShopDetails shopDetails;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "employee_id")
	private UserDetails employeeId;

	@Column(name = "emp_code")
	private String empCode;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "join_date")
	private LocalDate joinDate;

	@Column(name = "salary")
	private String salary;

	@Column(name = "releving_date")
	private LocalDate relevingDate;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "owner_id")
	private UserDetails ownerId;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "documents")
	private String documents;

	@Column(name = "employee_photo")
	private String photo;
}
