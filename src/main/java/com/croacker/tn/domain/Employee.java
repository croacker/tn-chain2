package com.croacker.tn.domain;

/**
 *
 */

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "croc_dict_employee_sp") //TODO relations
public class Employee extends AbstractEntiry{

    @Basic
    @Column(name = "user_name")
    @Getter
    @Setter
    private String userName;

    @Basic
    @Column(name = "user_os_name")
    @Getter
    @Setter
    private String userOsName;

    @Basic
    @Column(name = "user_login_name")
    @Getter
    @Setter
    private String userLoginName;

    @Basic
    @Column(name = "description")
    @Getter
    @Setter
    private String description;

    @Basic
    @Column(name = "croc_first_name")
    @Getter
    @Setter
    private String firstName;

    @Basic
    @Column(name = "croc_last_name")
    @Getter
    @Setter
    private String lastName;

    @Basic
    @Column(name = "croc_patronymic")
    @Getter
    @Setter
    private String patronymic;

    @Basic
    @Column(name = "croc_status")
    @Getter
    @Setter
    private String status;

    @Basic
    @Column(name = "phone")
    @Getter
    @Setter
    private String phone;

    @Basic
    @Column(name = "tab_number")
    @Getter
    @Setter
    private String tabNumber;

}
