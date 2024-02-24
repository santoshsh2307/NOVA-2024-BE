package com.nova.entityservice.repository;

import com.nova.entityservice.entity.MasterParameterSubParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MasterParameterSubParameterRepository extends JpaRepository<MasterParameterSubParameter, Long> {
}
