package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

/**
 *
 */
@MappedSuperclass
public abstract class AbstractEntiry {

    @Id
    @Basic
    @Column(name = "r_object_id")
    @Getter
    @Setter
    private String id;

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopDepartment topDepartment = (TopDepartment) o;
        if(topDepartment.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), topDepartment.getId());
    }
}
