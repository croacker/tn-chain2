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
@Table(name = "crc_dict_topic_sp")//TODO relations
public class Topic extends AbstractDictionaryEntity{

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

    /**
     * Родитель
     */
    @Basic
    @Column(name = "top_common_id")
    @Getter
    @Setter
    private String topId;
}
