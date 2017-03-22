package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 */
@Entity
@Table(name = "crc_dockind_group_sp")
public class DockindGroup extends AbstractDictionaryEntity {

    @Basic
    @Column(name = "object_name")
    @Getter
    @Setter
    private String objectName;

        @Basic
    @Column(name = "subject")
    @Getter
    @Setter
    private String subject;

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


}
