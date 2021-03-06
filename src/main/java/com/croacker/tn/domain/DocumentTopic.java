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
 *
 */
@Entity
@Table(name = "croc_document_topic_sp")//TODO relations
public class DocumentTopic extends AbstractEntiry{

    @Basic
    @Column(name = "r_object_type")
    @Getter
    @Setter
    private String objectType;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "topic_id")
    @Getter
    @Setter
    private Topic topic;

    @Basic
    @Column(name = "document_id")
    @Getter
    @Setter
    private String documentId;
}
