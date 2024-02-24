package com.nova.entityservice.repository;

import com.nova.entityservice.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LocationsRepository extends JpaRepository<Locations, Long> {
}