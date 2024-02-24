package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "shop_avalibility")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopAvalibility {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "from_date")
	private LocalDate fromDate;

	@Column(name = "to_date")
	private LocalDate toDate;

	@Column(name = "from_time")
	private LocalTime fromTime;

	@Column(name = "to_time")
	private LocalTime toTime;

	@Column(name = "time_interval")
	private Long timeInterval;

	@Column(name = "holiday")
	private List<String> holidays;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "shop_id")
	private ShopDetails shop;

}
