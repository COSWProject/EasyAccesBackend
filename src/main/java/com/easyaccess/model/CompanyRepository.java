package com.easyaccess.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {

    Company findByNit(Long nit);

}
