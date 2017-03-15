package com.croacker.tn.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 */
@Entity
@Table(name = "crc_dict_department_rp")
public class DepartmentRepeating extends RepeatingEntity{


}
