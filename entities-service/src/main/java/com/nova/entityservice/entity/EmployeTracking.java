package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "employee_tracking")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeTracking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "emp_id")
	private EmployeeDetails empId;

	@Column(name = "login_time")
	private LocalTime loginTime;

	@Column(name = "logout_time")
	private LocalTime logoutTime;

	@Column(name = "from_date")
	private LocalDate fromDate;

	@Column(name = "to_date")
	private LocalDate toDate;

	@Column(name = "comments")
	private String comments;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "target")
	private String target;

	@Column(name = "target_type")
	private String targetType;
}
