package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@Entity
@Table(name = "crc_dict_department_sp")
public class Department extends AbstractDictionaryEntity {

    @OneToMany(mappedBy = "id", fetch = FetchType.EAGER)
    @Getter
    @Setter
    private List<DepartmentRepeating> departmentRepeatings;

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
        return getDepartmentRepeatings().stream()
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
