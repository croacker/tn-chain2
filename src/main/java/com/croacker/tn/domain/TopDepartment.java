package com.croacker.tn.domain;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
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

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<TopDepartmentRepeating> topDepartmentRepeatings;

    @Transient
    @Getter
    @Setter
    private AbstractDictionaryEntity owner;

    @Basic
    @Column(name = "r_creation_date")
//    @Type(type="date")
    @Getter @Setter
    private String creationDate;

    @Basic
    @Column(name = "r_modify_date")
//    @Type(type="timestamp")
    @Getter @Setter
    private String modifyDate;

    @Basic
    @Column(name = "cabinet_id")
    @Getter
    @Setter
    private String cabinetId;

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
