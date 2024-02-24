package com.nova.entityservice.repository;

import com.nova.entityservice.entity.AppCancelRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AppCancelRequestRepository extends JpaRepository<AppCancelRequest,Long> {
}
