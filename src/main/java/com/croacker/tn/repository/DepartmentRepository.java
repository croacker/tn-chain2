package com.croacker.tn.repository;

import com.croacker.tn.domain.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "department", path = "department")
public interface DepartmentRepository extends JpaRepository<Department, String> {

    @Query(value = "select distinct department from Department department where lower(department.description) = lower(?1)",
            countQuery = "select count(department) from Department department where lower(department.description) = lower(?1)")
    Page<Department> findByDescription(String description, Pageable pageable);

    @Query(value = "select distinct department from Department department where lower(department.description) " +
            " like lower(concat('%',?1,'%')) ",
            countQuery = "select count(department) from Department department where lower(department.description) " +
                    " like lower(concat('%',?1,'%')) ")
    Page<Department> findByDescriptionLike(String description, Pageable pageable);

}
