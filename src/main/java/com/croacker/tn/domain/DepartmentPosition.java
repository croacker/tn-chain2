package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Должности в ОШС
 */
@Entity
@Table(name = "crc_dict_position_instance_sp")
public class DepartmentPosition extends AbstractDictionaryEntity{

    @Basic
    @Column(name = "r_creation_date")
    @Getter @Setter
    private String creationDate;

    @Basic
    @Column(name = "r_modify_date")
    @Getter @Setter
    private String modifyDate;

    @Basic
    @Column(name = "cabinet_id")
    @Getter
    @Setter
    private String cabinetId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    @Getter
    @Setter
    private Department department;

}
