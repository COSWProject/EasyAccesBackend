package com.easyaccess.service;

import com.easyaccess.model.Company;
import com.easyaccess.model.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void create(Company company) {
        companyRepository.save(company);
    }

    @Override
    public Company getById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));

        Company one = mongoTemplate.findOne(query, Company.class);

        return one;
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        companyRepository.deleteById(id);
    }

    @Override
    public Company getByNit(Long nit) {
        return companyRepository.findByNit(nit);
    }
}
