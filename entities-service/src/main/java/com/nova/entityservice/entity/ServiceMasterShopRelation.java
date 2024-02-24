package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "shop_Service_relation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceMasterShopRelation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "amount")
	private Float amount;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_id")
	private ShopDetails shop;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_id")
	private ServiceMaster service;

}
