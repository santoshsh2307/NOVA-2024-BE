package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "pramotions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pramotions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "exp_date")
	private LocalDate expDate;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "is_deleyted")
	private Boolean isDeleted;

	@Column(name = "is_used")
	private Boolean isUsed;

	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "pramotion_amount")
	private Float pramotionAmount;

	@Column(name = "shop_id")
	private Long shopId;

	@Column(name = "promotion_name")
	private String promotionName;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "total_price")
	private Float totalPrice;

	@Column(name = "offer_in_for")
	private Boolean offerInFor;

	@Column(name = "percentage")
	private Long precentage;

	@Column(name = "offer_in_amount")
	private Boolean offerInAmount;

	@Column(name = "promotion_img")
	private String promotionImg;

	@Column(name = "is_pushed_notification")
	private Boolean isPushedNotification;

}
