package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lab_specific_ranges")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabSpecificRanges {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "lab_id", nullable = false)
	private ShopDetails labData;

	@ManyToOne
	@JoinColumn(name = "test_id", nullable = false)
	private ServiceMaster labTest;

	@ManyToOne
	@JoinColumn(name = "param_id", nullable = false)
	private ServiceMasterParameter testParameters;

	@Column(name = "male_normal_range_min")
	private double maleNormalRangeMin;

	@Column(name = "male_normal_range_max")
	private double maleNormalRangeMax;

	@Column(name = "female_normal_range_min")
	private double femaleNormalRangeMin;

	@Column(name = "female_normal_range_max")
	private double femaleNormalRangeMax;

}
