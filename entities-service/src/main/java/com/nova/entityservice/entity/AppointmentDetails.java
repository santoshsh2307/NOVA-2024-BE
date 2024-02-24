package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "appointment_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "slot_id")
	private Long slotId;

	@Column(name = "shop_id")
	private Long shopId;

	@Column(name = "appointment_status")
	private String appointmentStatus;

	@Column(name = "service_id")
	private Long serviceId;

	@Column(name = "amount")
	private Float amount;

	@Column(name = "tax1")
	private Float tax1;

	@Column(name = "tax2")
	private Float tax2;

	@Column(name = "gst")
	private Float gst;

	@Column(name = "csgt")
	private Float cgst;

	@Column(name = "sgst")
	private Float sgst;

	@Column(name = "consumer_id")
	private Long patientId;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "refered_by_nova_user_name")
	private String referedByNovaUserName;

	@Column(name = "refered_by_non_nova_user_name")
	private String referedByNonNovaUserName;

}
