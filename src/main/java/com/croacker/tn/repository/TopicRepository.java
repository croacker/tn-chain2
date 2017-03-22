package com.croacker.tn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.croacker.tn.domain.Topic;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "topics", path = "topics")
public interface TopicRepository extends JpaRepository<Topic, String> {
}