package com.nova.entityservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "slot_availability")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SlotAvailability {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_id")
	@JsonIgnore
	private ShopDetails shopId;

	@Column(name = "app_date")
	private LocalDate appDate;

	@Column(name = "last_update")
	private LocalDate lastUpdate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private UserDetails userDetails;

	@Column(name = "last_update_by")
	private Long lastUpdateBy;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "appointment_status")
	private String appointmentStatus;

	@Column(name = "slot_time")
	private LocalTime slotTime;
}
