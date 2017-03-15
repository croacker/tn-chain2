package com.croacker.tn.repository;

import com.croacker.tn.domain.OrgstructureDictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "orgstructure", path = "orgstructure")
public interface OrgstructureDictionaryRepository extends JpaRepository<OrgstructureDictionary, String> {
}
