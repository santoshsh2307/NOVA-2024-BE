package com.nova.entityservice.repository;

import com.nova.entityservice.entity.SlotAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotAvailabilityRepository extends JpaRepository<SlotAvailability, Long> {
}
