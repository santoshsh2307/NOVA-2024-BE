package com.nova.entityservice.repository;

import com.nova.entityservice.entity.ShopUpdateRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopUpdateRequestRepository extends JpaRepository<ShopUpdateRequest, Long> {
}
