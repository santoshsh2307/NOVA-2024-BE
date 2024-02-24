package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shop_rating")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopRating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "rating")
	private int rating;

	@Column(name = "comment")
	private String comment;
}
