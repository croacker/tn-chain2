package com.croacker.tn.repository;

import com.croacker.tn.domain.EmployeePosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "employeepositions", path = "employeepositions")
public interface EmployeePositionRepository extends JpaRepository<EmployeePosition, String> {
}
