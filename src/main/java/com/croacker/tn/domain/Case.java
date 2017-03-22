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
@Table(name = "croc_case_sp")
public class Case extends AbstractDictionaryEntity{

    @Basic
    @Column(name = "object_name")
    @Getter
    @Setter
    private String objectName;

}
