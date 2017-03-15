package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

/**
 *
 */
@MappedSuperclass
public abstract class AbstractDictionaryEntity extends AbstractEntiry{

    @Basic
    @Column(name = "r_object_type")
    @Getter @Setter
    private String objectType;

    @Basic
    @Column(name = "a_is_hidden")
    @Getter @Setter
    private boolean hidden;

    @Basic
    @Column(name = "description")
    @Getter
    @Setter
    private String description;

}
