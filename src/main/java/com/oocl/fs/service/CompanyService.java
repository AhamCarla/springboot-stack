package com.oocl.fs.service;

import com.oocl.fs.model.Company;
import com.oocl.fs.model.Employee;
import com.oocl.fs.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company findById(Integer companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    public List<Employee> findEmployeesByCompanyId(Integer companyId) {
        Optional<Company> company = companyRepository.findById(companyId);
        return company.map(Company::getEmployees).orElse(null);
    }

    public Page<Company> findByPage(Integer page, Integer pageSize) {
        return companyRepository.findAll(PageRequest.of(page, pageSize));
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public Company update(Integer companyId, Company company) {
        company.setCompanyId(companyId);
        return companyRepository.save(company);
    }

//    public Company deleteAllEmployee(Integer companyId) {
//        return companyRepository.deleteAllEmployee(companyId);
//    }

}
