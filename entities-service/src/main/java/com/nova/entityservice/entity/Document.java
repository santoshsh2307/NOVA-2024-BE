package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "documents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "file_data")
	private byte[] fileData;

	@Column(name = "patient_id")
	private Long patientId;

	@Column(name = "lab_id")
	private Long labId;

	@Column(name = "technician_id")
	private Long technicianId;
}
