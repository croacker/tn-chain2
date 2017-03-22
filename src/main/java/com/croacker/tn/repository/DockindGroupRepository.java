package com.croacker.tn.repository;

import com.croacker.tn.domain.DockindGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "dockindgroups", path = "dockindgroups")
public interface DockindGroupRepository extends JpaRepository<DockindGroup, String> {
}
