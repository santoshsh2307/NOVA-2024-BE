package com.nova.entityservice.repository;

import com.nova.entityservice.entity.EmployeTracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeTrackingRepository extends JpaRepository<EmployeTracking,Long> {
}
