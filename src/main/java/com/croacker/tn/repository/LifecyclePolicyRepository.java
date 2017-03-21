package com.croacker.tn.repository;

import com.croacker.tn.domain.LifecyclePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "lifecyclepolicies", path = "lifecyclepolicies")
public interface LifecyclePolicyRepository extends JpaRepository<LifecyclePolicy, String> {
}
