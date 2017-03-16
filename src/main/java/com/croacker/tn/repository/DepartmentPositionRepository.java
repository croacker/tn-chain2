package com.croacker.tn.repository;

import com.croacker.tn.domain.DepartmentPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "departmentpositions", path = "departmentpositions")
public interface DepartmentPositionRepository  extends JpaRepository<DepartmentPosition, String> {
}
