package com.nova.entityservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "inventory_shop_relation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryShopRelation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "unit")
	private Long unit;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "qty")
	private Long quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "inventory_id")
	private MasterInventory inventory;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_id")
	@JsonIgnore
	private ShopDetails shopDetails;
}
