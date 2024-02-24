package com.nova.entityservice.repository;

import com.nova.entityservice.entity.LabReportLocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LabReportLocationsRepository extends JpaRepository<LabReportLocations, Long> {
}
