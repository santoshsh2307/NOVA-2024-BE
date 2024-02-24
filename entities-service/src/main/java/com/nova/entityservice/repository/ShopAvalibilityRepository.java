package com.nova.entityservice.repository;

import com.nova.entityservice.entity.ShopAvalibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopAvalibilityRepository extends JpaRepository<ShopAvalibility,Long> {
}
