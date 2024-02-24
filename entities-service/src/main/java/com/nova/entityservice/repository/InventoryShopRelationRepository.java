package com.nova.entityservice.repository;

import com.nova.entityservice.entity.InventoryShopRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InventoryShopRelationRepository extends JpaRepository<InventoryShopRelation, Long> {
}
