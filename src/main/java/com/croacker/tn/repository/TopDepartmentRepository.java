package com.croacker.tn.repository;

import com.croacker.tn.domain.TopDepartment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "topdepartments", path = "topdepartments")
public interface TopDepartmentRepository extends JpaRepository<TopDepartment, String> {

    @Query(value = "select distinct topDepartment from TopDepartment topDepartment where lower(topDepartment.description) = lower(?1)",
            countQuery = "select count(topDepartment) from TopDepartment topDepartment where lower(topDepartment.description) = lower(?1)")
    Page<TopDepartment> findByDescription(@Param("description") String description, Pageable pageable);

    @Query(value = "select distinct topDepartment from TopDepartment topDepartment where lower(topDepartment.description) " +
            " like lower(concat('%',?1,'%')) ",
            countQuery = "select count(topDepartment) from TopDepartment topDepartment where lower(topDepartment.description) " +
                    " like lower(concat('%',?1,'%')) ")
    Page<TopDepartment> findByDescriptionLike(@Param("description") String description, Pageable pageable);
}
