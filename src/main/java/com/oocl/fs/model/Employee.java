package com.oocl.fs.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
public class Employee {

    @Id
    @GeneratedValue
    private Integer employeeId;
    private String name;
    private Integer age;
    private String gender;
    private Integer salary;

    @OneToOne
    @JoinColumn(name = "employeeId")
    private EmployeeRecord employeeRecord;

}
