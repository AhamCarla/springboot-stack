package com.oocl.fs.service;

import com.oocl.fs.model.Employee;
import com.oocl.fs.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Integer employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    public Page<Employee> findByPage(Integer page, Integer pageSize) {
        return employeeRepository.findAll(PageRequest.of(page, pageSize));
    }

    public List<Employee> findByGender(String gender) {
        return employeeRepository.findByGender(gender);
    }

    public Employee update(Integer employeeId, Employee employee) {
        employee.setEmployeeId(employeeId);
        return employeeRepository.save(employee);
    }

    public void delete(Integer employeeId) {
        employeeRepository.deleteByEmployeeId(employeeId);
    }

}
