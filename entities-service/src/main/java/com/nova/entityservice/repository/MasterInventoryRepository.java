package com.nova.entityservice.repository;

import com.nova.entityservice.entity.MasterInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MasterInventoryRepository extends JpaRepository<MasterInventory, Long> {
}
