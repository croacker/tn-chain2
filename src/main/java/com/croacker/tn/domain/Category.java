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
@Table(name = "crc_dict_category_sp") // TODO relations(discriminator-object_name, val-?????)
public class Category extends AbstractDictionaryEntity {

    @Basic
    @Column(name = "object_name")
    @Getter
    @Setter
    private String objectName;


}
