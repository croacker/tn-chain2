package com.croacker.tn.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.croacker.tn.domain.AbstractDictionaryEntity;
import com.croacker.tn.domain.TopDepartmentRepeating;
import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Entity
@Table(name = "crc_dict_rootdepartment_sp")
public class TopDepartment extends AbstractDictionaryEntity {

    @OneToMany(mappedBy = "id", fetch = FetchType.EAGER)
    @Getter
    @Setter
    private List<TopDepartmentRepeating> topDepartmentRepeatings;

    @Transient
    @Getter
    @Setter
    private AbstractDictionaryEntity owner;

    /**
     * id родительского объекта
     *
     * @return
     */
    public String getParentId() {
        return getTopDepartmentRepeatings().stream()
                .filter(departmentRepeating -> departmentRepeating.getFolderId() != null)
                .map(departmentRepeating -> departmentRepeating.getFolderId()).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "TopDepartment{" +
                "id=" + getId() +
                ", r_object_type='" + getObjectType() + "'" +
                ", description='" + getDescription() + "'" +
                ", hidden='" + isHidden() + "'" +
                '}';
    }
}
