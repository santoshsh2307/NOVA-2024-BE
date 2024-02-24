package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "master_parameter_sub_parameter")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MasterParameterSubParameter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column
	private String masterParameterSubParameterCol;

	@Column
	private Long minValue;

	@Column
	private Long maxValue;

	@Column
	private Boolean isDeleted;

	@Column
	private Boolean status;

	@Column
	private Long parameterId;

}
