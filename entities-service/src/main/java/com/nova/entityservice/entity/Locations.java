package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "locations_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Locations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "location")
	private String location;

	@Column(name = "address")
	private String shopAddress;

	@Column(name = "latitude")
	private Double latitude;

	@Column(name = "longitude")
	private Double longitude;

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

	@ManyToOne
	@JoinColumn(name = "org_id") // This assumes the 'org_id' column in the 'locations_details' table
	private Organization organization;

}
