package com.nova.entityservice.repository;

import com.nova.entityservice.entity.GiftCards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GiftCardsRepository extends JpaRepository<GiftCards, Long> {
}
