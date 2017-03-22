package com.croacker.tn.repository;

import com.croacker.tn.domain.CommonDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "commondocuments", path = "commondocuments")
public interface CommonDocumentRepository extends JpaRepository<CommonDocument, String> {
}
