package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "organization_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "org_name")
	private String orgName;

	@Column(name = "org_address")
	private String shopAddress;

	@Column(name = "latitude")
	private Long latitude;

	@Column(name = "longitude")
	private Long longitude;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "logo")
	private String logo;

	@Column(name = "pin_code")
	private String pinCode;

	@Column(name = "org_code")
	private String orgCode;

	@Column(name = "gst_no")
	private String gstNo;

	@OneToMany(mappedBy = "organization")
	private List<Locations> locations;

}
