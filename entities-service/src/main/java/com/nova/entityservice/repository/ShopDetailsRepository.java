package com.nova.entityservice.repository;

import com.nova.entityservice.entity.ShopDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopDetailsRepository extends JpaRepository<ShopDetails,Long> {
}
