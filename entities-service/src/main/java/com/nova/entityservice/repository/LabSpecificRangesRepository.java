package com.nova.entityservice.repository;

import com.nova.entityservice.entity.LabSpecificRanges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LabSpecificRangesRepository extends JpaRepository<LabSpecificRanges, Long> {
}
