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
@Table(name = "croc_lifecycle_policy_s") //TODO relation
public class LifecyclePolicy extends AbstractEntiry {

    @Basic
    @Column(name = "policy_name")
    @Getter
    @Setter
    private String policyName;

    @Basic
    @Column(name = "state_name")
    @Getter
    @Setter
    private String stateName;

    @Basic
    @Column(name = "prev_state")
    @Getter
    @Setter
    private String previousStateName;

    @Basic
    @Column(name = "referenced_object_id")
    @Getter
    @Setter
    private String referencedId;

}
