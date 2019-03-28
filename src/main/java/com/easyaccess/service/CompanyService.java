package com.easyaccess.service;

import com.easyaccess.model.Company;

import java.util.List;

public interface CompanyService {

    void create(Company company);

    Company getById(String id);

    List<Company> getAll();

    void deleteById(String id);

    Company getByNit(Long nit);

    Company getByEmail(String email);

}
