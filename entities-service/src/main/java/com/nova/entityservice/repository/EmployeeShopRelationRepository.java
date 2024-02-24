package com.nova.entityservice.repository;

import com.nova.entityservice.entity.EmployeeShopRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeShopRelationRepository extends JpaRepository<EmployeeShopRelation,Long> {
}
