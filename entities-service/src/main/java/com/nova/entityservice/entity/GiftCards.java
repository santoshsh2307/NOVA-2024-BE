package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "gift_cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiftCards {

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

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "is_used")
	private Boolean isUsed;

	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "gift_amount")
	private Float giftAmount;
}
