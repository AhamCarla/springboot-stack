package com.oocl.fs.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class EmployeeRecord {

    @Id
    @GeneratedValue
    private Integer recordId;

    private String name;

    @Column(name = "description")
    private String detail;
}
