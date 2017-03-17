package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Входящий документ
 */
@Entity
@Table(name = "croc_document_income_sp")
public class IncomeDocument extends AbstractDocumentEntity{

    @Basic
    @Column(name = "croc_addresee")
    @Getter
    @Setter
    private String addresee;

    @Basic
    @Column(name = "croc_reg_number")
    @Getter
    @Setter
    private String regNumber;

    @Basic
    @Column(name = "croc_register_date")
    @Getter
    @Setter
    private String regDate;

    @Basic
    @Column(name = "croc_correspondents")
    @Getter
    @Setter
    private String correspondents;

    @Basic
    @Column(name = "croc_document_kind")
    @Getter
    @Setter
    private String documentKindId;

    @Basic
    @Column(name = "croc_department_id")
    @Getter
    @Setter
    private String departmentId;

    @Basic
    @Column(name = "croc_nomenclature_folder")
    @Getter
    @Setter
    private String nomenclatureFolderId;

    @Basic
    @Column(name = "croc_recorder_id")
    @Getter
    @Setter
    private String recorderId;

    @Basic
    @Column(name = "croc_document_type_id")
    @Getter
    @Setter
    private String documentTypeId;

    @Basic
    @Column(name = "croc_doc_summary")
    @Getter
    @Setter
    private String documentSummary;

    @Basic
    @Column(name = "croc_doc_comments")
    @Getter
    @Setter
    private String documentComments;

    @Basic
    @Column(name = "croc_org_owner_id")
    @Getter
    @Setter
    private String organisationOwnerId;

    @Basic
    @Column(name = "tn_correspondent_id")
    @Getter
    @Setter
    private String correspondentId;

    @Basic
    @Column(name = "tn_correspondent_ost_id")
    @Getter
    @Setter
    private String correspondentOstId;

    @Basic
    @Column(name = "tn_transfer_execution_id")
    @Getter
    @Setter
    private String transferExecutionId;
}
