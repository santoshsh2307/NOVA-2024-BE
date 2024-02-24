package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "app_cancel_request")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppCancelRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "slot_id")
	private Long slotId;

	@Column(name = "requested_by")
	private Boolean requestedBy;

	@Column(name = "reason")
	private Boolean reason;

	@Column(name = "comments")
	private Boolean comments;

	@Column(name = "extended_by_status")
	private Boolean extendedByStatus;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "cancelation_status")
	private Boolean cancelationStatus;

}
