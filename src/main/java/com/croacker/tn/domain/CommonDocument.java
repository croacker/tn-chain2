package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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
@Table(name = "croc_document_common_sp") //TODO relations
public class CommonDocument extends AbstractDocumentEntity{

    @Basic
    @Column(name = "object_name")
    @Getter
    @Setter
    private String objectName;

    @Basic
    @Column(name = "r_object_type")
    @Getter
    @Setter
    private String objectType;

    @Basic
    @Column(name = "croc_addresee")
    @Getter
    @Setter
    private String addressee;

    @Basic
    @Column(name = "croc_document_kind_descr")
    @Getter
    @Setter
    private String documentKindDescription;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "croc_document_kind")
    @NotFound(action= NotFoundAction.IGNORE)
    @Getter
    @Setter
    private DocumentKind documentKind;

    @Basic
    @Column(name = "croc_reg_number")
    @Getter
    @Setter
    private String regNumber;

    @Basic
    @Column(name = "croc_register_date")
    @Getter
    @Setter
    private String regiseterDate;

    @Basic
    @Column(name = "croc_correspondents")
    @Getter
    @Setter
    private String correspondents;

    @Basic
    @Column(name = "croc_project_reg_number")
    @Getter
    @Setter
    private String projectRegNumber;

    @Basic
    @Column(name = "croc_is_confidential")
    @Getter
    @Setter
    private String isConfidential;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "croc_department_id")
    @NotFound(action= NotFoundAction.IGNORE)
    @Getter
    @Setter
    private Department department;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "croc_performer_id")
    @NotFound(action= NotFoundAction.IGNORE)
    @Getter
    @Setter
    private EmployeePosition performer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "croc_nomenclature_folder")
    @NotFound(action= NotFoundAction.IGNORE)
    @Getter
    @Setter
    private Case nomenclatureCase;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "croc_recorder_id")
    @NotFound(action= NotFoundAction.IGNORE)
    @Getter
    @Setter
    private EmployeePosition recorder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "croc_signer_id")
    @NotFound(action= NotFoundAction.IGNORE)
    @Getter
    @Setter
    private EmployeePosition signerId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "croc_document_type_id")
    @Getter
    @Setter
    private DockindGroup documentType;

    @Basic
    @Column(name = "croc_doc_summary")
    @Getter
    @Setter
    private String summary;


}
