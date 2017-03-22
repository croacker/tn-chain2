package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by agumenyuk on 22.03.2017.
 */
@Entity
@Table(name = "crc_dict_dockind_name_sp")
public class DocumentKind extends AbstractDictionaryEntity{

    @Basic
    @Column(name = "object_name")
    @Getter
    @Setter
    private String objectName;

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
