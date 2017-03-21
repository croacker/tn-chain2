package com.croacker.tn.repository;

import com.croacker.tn.domain.Commission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 */
@RepositoryRestResource(collectionResourceRel = "commissions", path = "commissions")
public interface CommissionRepository extends JpaRepository<Commission, String> {
}
