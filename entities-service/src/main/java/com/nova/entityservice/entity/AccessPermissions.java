package com.nova.entityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "access_permissions")
public class AccessPermissions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private UserDetails employeeDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_id")
	private ShopDetails shopDetails;

	// Boolean permissions
	@Column(name = "create_lab")
	private Boolean createLab;

	@Column(name = "updated_lab")
	private Boolean updatedLab;

	@Column(name = "deleted_lab")
	private Boolean deletedLab;

	@Column(name = "lab_availability")
	private Boolean labAvailability;

	@Column(name = "create_service")
	private Boolean createServices;

	@Column(name = "updated_service")
	private Boolean updatedServices;

	@Column(name = "deleted_service")
	private Boolean deletedServices;

	@Column(name = "services_pricing")
	private Boolean servicesPricing;

	@Column(name = "create_appointment")
	private Boolean createAppointments;

	@Column(name = "updated_appointment")
	private Boolean updatedAppointments;

	@Column(name = "deleted_appointment")
	private Boolean deletedAppointments;

	@Column(name = "appointment_list")
	private Boolean appointmentList;

	@Column(name = "create_employee")
	private Boolean createEmployee;

	@Column(name = "updated_employee")
	private Boolean updatedEmployee;

	@Column(name = "deleted_employee")
	private Boolean deletedEmployee;

	@Column(name = "employee_login")
	private Boolean employeeLogin;

	@Column(name = "employee_log_out")
	private Boolean employeeLogOut;

	@Column(name = "employee_management")
	private Boolean employeeManagement;

	@Column(name = "create_inventory")
	private Boolean createInventory;

	@Column(name = "updated_inventory")
	private Boolean updatedInventory;

	@Column(name = "deleted_inventory")
	private Boolean deletedInventory;

	@Column(name = "import_inventory")
	private Boolean importInventory;

	@Column(name = "used_inventories")
	private Boolean usedInventories;

	@Column(name = "access_permissions_status")
	private Boolean accessPermissionStatus;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "access_permission")
	private Long accessPermissions;

	@Column(name = "access_permissions_from_date")
	private Date accessPermissionFromDate;

	@Column(name = "access_permissions_to_date")
	private Date accessPermissionsToDate;

}
