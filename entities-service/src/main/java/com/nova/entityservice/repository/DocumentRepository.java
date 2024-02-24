package com.nova.entityservice.repository;

import com.nova.entityservice.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
