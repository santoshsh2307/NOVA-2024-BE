package com.nova.entityservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "shop_employee_relation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeShopRelation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_id")
	@JsonIgnore
	private ShopDetails shopId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	@JsonIgnore
	private EmployeeDetails empId;

	@Column(name = "employee_start_date")
	private LocalDate employeeStartDate;

	@Column(name = "employment_end_date")
	private LocalDate employmentEndDate;

	@Column(name = "reason_for_relieving")
	private String reasonForRelieving;

	@Column(name = "status")
	private Boolean status;
}
