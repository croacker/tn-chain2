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
@Table(name = "croc_commission_performer_sp") // TODO relations
public class CommissionPerformer extends AbstractEntiry {

    @Basic
    @Column(name = "commission_id")
    @Getter
    @Setter
    private String commissionId;

    @Basic
    @Column(name = "employee_position_id")
    @Getter
    @Setter
    private String employeePositionId;

    @Basic
    @Column(name = "control_deadline_date")
//    @Type(type="timestamp")
    @Getter @Setter
    private String controlDeadlineDate;

    @Basic
    @Column(name = "control_completion_date")
//    @Type(type="timestamp")
    @Getter @Setter
    private String controlСompletionDate;

    @Basic
    @Column(name = "execution_completion_date")
//    @Type(type="timestamp")
    @Getter @Setter
    private String executionСompletionDate;

    @Basic
    @Column(name = "cancel_execution_date")
//    @Type(type="timestamp")
    @Getter @Setter
    private String cancelExecutionDate;

    @Basic
    @Column(name = "order_index")
    @Getter @Setter
    private String orderIndex;

    @Basic
    @Column(name = "last_task_result")
    @Getter @Setter
    private String lastTaskResult;

}
