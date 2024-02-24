package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "service_master_parameter")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceMasterParameter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "service_master_id")
	private ServiceMaster service_master_id;

	@Column(name = "min_value")
	private String minValue;

	@Column(name = "max_value")
	private String maxValue;

	@Column(name = "unit")
	private String unit;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "is_created")
	private LocalDate isCreated;

	@Column(name = "parameter_name")
	private String parameterName;

	@ManyToOne
	@JoinColumn(name = "parent_parameter_id")
	private ServiceMasterParameter parentParameter;

}
