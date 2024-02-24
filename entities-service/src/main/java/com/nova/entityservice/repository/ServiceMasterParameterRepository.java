package com.nova.entityservice.repository;

import com.nova.entityservice.entity.ServiceMasterParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceMasterParameterRepository extends JpaRepository<ServiceMasterParameter, Long> {
}
