package com.easyaccess.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccessRepository extends MongoRepository<Access, String> {

    Access findByOwner(String owner);

}