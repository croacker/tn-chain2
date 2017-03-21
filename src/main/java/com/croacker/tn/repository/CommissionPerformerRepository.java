package com.croacker.tn.repository;

import com.croacker.tn.domain.CommissionPerformer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "commissionperformers", path = "commissionperformers")
public interface CommissionPerformerRepository extends JpaRepository<CommissionPerformer, String> {
}
