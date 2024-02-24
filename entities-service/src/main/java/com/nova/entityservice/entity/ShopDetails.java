package com.nova.entityservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shop_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "shop_name")
	private String shopName;

	@Column(name = "shop_address")
	private String shopAddress;

	@Column(name = "latitude")
	private Long latitude;

	@Column(name = "longitude")
	private Long longitude;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "logo")
	private String logo;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "printer_required")
	private Boolean printerRequired;

	@Column(name = "device_required")
	private Boolean deviceRequired;

	@Column(name = "inventory")
	private Boolean inventory;

	@Column(name = "enable_gift_card")
	private Boolean enableGiftCard;

	@Column(name = "pin_code")
	private String pinCode;

	@Column(name = "shop_code")
	private Boolean shopCode;

	@Column(name = "gst_no")
	private String gstNo;

	@Column(name = "shop_photo")
	private String shopPhoto;

	@Column(name = "capacity")
	private Long capacity;

	@Column(name = "amenities")
	private String amenities;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_type_id")
	private ShopType shopType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UserDetails owner;

	@OneToMany(mappedBy = "shop")
	@JsonIgnore
	private List<ServiceMasterShopRelation> shopServices = new ArrayList<>();
}
