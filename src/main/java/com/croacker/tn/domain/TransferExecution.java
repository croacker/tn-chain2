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
@Table(name = "croc_transfer_execution_sp")//TODO
public class TransferExecution extends AbstractEntiry {

    @Basic
    @Column(name = "document_id")
    @Getter
    @Setter
    private String documentId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_position_id")
    @Getter
    @Setter
    private EmployeePosition employeePosition;

}