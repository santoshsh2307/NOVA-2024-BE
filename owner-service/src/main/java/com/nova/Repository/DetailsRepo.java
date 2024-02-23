package com.nova.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nova.entity.Details;

@EnableJpaRepositories
public interface DetailsRepo extends JpaRepository<Details, Long>{

}
