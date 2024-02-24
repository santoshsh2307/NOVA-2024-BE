package com.nova.entityservice.repository;

import com.nova.entityservice.entity.ServiceMasterShopRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceMasterShopRelationRepository extends JpaRepository<ServiceMasterShopRelation, Long> {
}
