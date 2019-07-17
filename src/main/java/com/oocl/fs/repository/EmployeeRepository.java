package com.oocl.fs.repository;

import com.oocl.fs.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByGender(String gender);

    void deleteByEmployeeId(Integer employeeId);

}
