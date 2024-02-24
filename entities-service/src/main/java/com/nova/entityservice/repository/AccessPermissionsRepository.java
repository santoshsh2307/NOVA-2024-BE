package com.nova.entityservice.repository;

import com.nova.entityservice.entity.AccessPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AccessPermissionsRepository extends JpaRepository<AccessPermissions,Long> {
}
