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
@Table(name = "croc_commission_sp") //TODO relations
public class Commission extends AbstractEntiry {

    @Basic
    @Column(name = "a_is_hidden")
    @Getter @Setter
    private boolean hidden;

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

    @Basic
    @Column(name = "object_name")
    @Getter
    @Setter
    private String objectName;

    @Basic
    @Column(name = "author_id")
    @Getter
    @Setter
    private String authorId;

    @Basic
    @Column(name = "owner_id")
    @Getter
    @Setter
    private String ownerId;

    /**
     * Владелец - документ, поручение
     */
    @Basic
    @Column(name = "regcard_id")
    @Getter
    @Setter
    private String regcardId;

    @Basic
    @Column(name = "control_date")
//    @Type(type="timestamp")
    @Getter @Setter
    private String controlDate;

    @Basic
    @Column(name = "fact_date")
//    @Type(type="timestamp")
    @Getter @Setter
    private String factDate;

    @Basic
    @Column(name = "croc_content")
    @Getter @Setter
    private String content;

    @Basic
    @Column(name = "resolution_number")
    @Getter @Setter
    private String resolutionNumber;

    @Basic
    @Column(name = "croc_create_date")
//    @Type(type="date")
    @Getter
    @Setter
    private String crocCreationDate;

    @Basic
    @Column(name = "document_reviewer_id")
    @Getter @Setter
    private String documentReviewerId;

    @Basic
    @Column(name = "document_controller_id")
    @Getter @Setter
    private String documentСontrollerId;

    @Basic
    @Column(name = "resolution_kind")
    @Getter @Setter
    private String resolutionKind;

}
