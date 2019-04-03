package com.easyaccess.service;

import com.easyaccess.model.Access;
import com.easyaccess.model.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessServiceImpl implements AccessService {

    @Autowired
    AccessRepository accessRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void create(Access access) {
        accessRepository.save(access);
    }

    @Override
    public Access getById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));

        Access one = mongoTemplate.findOne(query, Access.class);

        return one;
    }

    @Override
    public List<Access> getAll() {
        return accessRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        accessRepository.deleteById(id);
    }

    @Override
    public Access getByOwner(String owner) {
        return accessRepository.findByOwner(owner);
    }

}