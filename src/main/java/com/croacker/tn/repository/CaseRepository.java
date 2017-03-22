package com.croacker.tn.repository;

import com.croacker.tn.domain.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "cases", path = "cases")
public interface CaseRepository extends JpaRepository<Case, String> {



}
