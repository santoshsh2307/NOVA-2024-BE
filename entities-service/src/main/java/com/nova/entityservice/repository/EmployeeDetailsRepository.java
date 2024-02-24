package com.nova.entityservice.repository;

import com.nova.entityservice.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Long> {
}
