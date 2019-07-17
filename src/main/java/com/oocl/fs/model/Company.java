package com.oocl.fs.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
public class Company {

    @Id
    @GeneratedValue
    private Integer companyId;
    private String companyName;
    private String address;
    @OneToMany
    @JoinColumn(name = "companyId")
    private List<Employee> employees;

}
