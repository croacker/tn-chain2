package com.croacker.tn.repository;

import com.croacker.tn.domain.DocumentTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "documenttopics", path = "documenttopics")
public interface DocumentTopicRepository extends JpaRepository<DocumentTopic, String> {
}
