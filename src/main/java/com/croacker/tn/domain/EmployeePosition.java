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
 * Сотрудник в должности
 */
@Entity
@Table(name = "crc_dict_employee_position_sp")
public class EmployeePosition extends AbstractDictionaryEntity{

    @Basic
    @Column(name = "r_creation_date")
//    @Type(type="date")
    @Getter
    @Setter
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

    @Basic
    @Column(name = "legacy_person")
    @Getter
    @Setter
    private String legacyPerson;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    @Getter
    @Setter
    private Department department;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "top_department_id")
    @Getter
    @Setter
    private TopDepartment topDepartment;

    @Basic
    @Column(name = "position_instance_id")
    @Getter
    @Setter
    private String positionInstanceId;

}
