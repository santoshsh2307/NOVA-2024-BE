package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bar_code_generate_lab")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BarCodeGenerateForLabEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "qr_path")
	private String qrCodePath;

	@Column(name = "status")
	private String status;
}
