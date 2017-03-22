package com.croacker.tn.repository;

import com.croacker.tn.domain.DocumentKind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "documentkinds", path = "documentkinds")
public interface DocumentKindRepository extends JpaRepository<DocumentKind, String> {
}
