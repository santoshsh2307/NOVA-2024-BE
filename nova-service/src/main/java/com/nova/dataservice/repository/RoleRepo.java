package com.nova.dataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.nova.dataservice.entity.Role;

@RestController
public interface RoleRepo extends  JpaRepository<Role,Long> {

}
