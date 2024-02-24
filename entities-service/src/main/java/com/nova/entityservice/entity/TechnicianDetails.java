package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "technician_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnicianDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "patient_id")
	private Long patientId;

	@Column(name = "technician_id")
	private Long technicianId;

	@Column(name = "note")
	private String note;

	@Column(name = "status")
	private String status;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "appointment_id")
	private Long appointmentId;
}
