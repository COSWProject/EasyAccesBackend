package com.easyaccess.service;

import com.easyaccess.model.Company;
import com.easyaccess.model.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public void create(Company company) {

    }

    @Override
    public Company getById(String id) {
        return null;
    }

    @Override
    public List<Company> getAll() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public Company getByNit(Long nit) {
        return null;
    }
}
