package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 */
@MappedSuperclass
public class AbstractDocumentEntity extends AbstractEntiry{

    @Basic
    @Column(name = "r_object_type")
    @Getter
    @Setter
    private String objectType;

    @Basic
    @Column(name = "a_is_hidden")
    @Getter @Setter
    private boolean hidden;

    @Basic
    @Column(name = "i_cabinet_id")
    @Getter
    @Setter
    private String cabinetId;

}
