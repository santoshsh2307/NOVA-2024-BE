package com.nova.entityservice.repository;

import com.nova.entityservice.entity.ShopRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRatingRepository extends JpaRepository<ShopRating, Long> {
}
