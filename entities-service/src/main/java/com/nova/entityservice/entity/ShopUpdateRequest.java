package com.nova.entityservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "shop_update_request")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopUpdateRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "comment")
	private String comment;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "created_by")
	private LocalDate createdBy;

	@Column(name = "is_defined")
	private Boolean isDefined;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "last_updated")
	private LocalDate lastUpdated;

	@Column(name = "requested_type")
	private Long requestedType;

	@Column(name = "updated_status")
	private Long updatedStatus;

	@Column(name = "is_verified")
	private Boolean isVerified;

	@Column(name = "last_updated_status")
	private LocalDate lastUpdatedStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_id")
	@JsonIgnore
	private ShopDetails shopId;
}
