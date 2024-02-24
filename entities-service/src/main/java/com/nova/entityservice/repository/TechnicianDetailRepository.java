package com.nova.entityservice.repository;

import com.nova.entityservice.entity.TechnicianDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicianDetailRepository extends JpaRepository<TechnicianDetails, Long> {
}
