package com.nova.entityservice.repository;

import com.nova.entityservice.entity.Pramotions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PramotionsRepository extends JpaRepository<Pramotions,Long> {
}
