package com.nova.entityservice.repository;

import com.nova.entityservice.entity.ShopType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopTypeRepository extends JpaRepository<ShopType, Long> {
}
