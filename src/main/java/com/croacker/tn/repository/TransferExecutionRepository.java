package com.croacker.tn.repository;

import com.croacker.tn.domain.TransferExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "transferexecutions", path = "transferexecutions")
public interface TransferExecutionRepository extends JpaRepository<TransferExecution, String> {
}
