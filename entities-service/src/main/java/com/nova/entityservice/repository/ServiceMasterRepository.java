package com.nova.entityservice.repository;

import com.nova.entityservice.entity.ServiceMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceMasterRepository extends JpaRepository<ServiceMaster, Long> {
}
