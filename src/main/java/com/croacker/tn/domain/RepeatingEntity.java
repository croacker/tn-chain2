package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 */
@MappedSuperclass
public abstract class RepeatingEntity {

    @EmbeddedId
    @Getter
    @Setter
    private RepeatingId repeatingId;

    @Basic
    @Column(name = "r_object_id", insertable = false, updatable = false)
    @Getter
    @Setter
    private String id;

    @Basic
    @Column(name = "i_position", insertable = false, updatable = false)
    @Getter
    @Setter
    private Long position;

    @Basic
    @Column(name = "i_folder_id", insertable = false, updatable = false)
    @Getter
    @Setter
    private String folderId;

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPosition());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepeatingEntity repeatingEntity = (RepeatingEntity) o;
        if (repeatingEntity.getId() == null || getId() == null) {
            return false;
        }

        if (repeatingEntity.getPosition() == null || getPosition() == null) {
            return false;
        }

        return Objects.equals(getId(), repeatingEntity.getId()) &&
                Objects.equals(getPosition(), repeatingEntity.getPosition());
    }

    @Embeddable
    static class RepeatingId implements Serializable {
        @Column(name = "r_object_id")
        String id;
        @Column(name = "i_position")
        Long position;
    }
}
