package com.croacker.tn.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ONLY Entity in table. Stupid monkey
 */
@Entity
@Table(name = "crc_dict_departments_root_sp")
public class OrgstructureDictionary extends AbstractDictionaryEntity{

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
