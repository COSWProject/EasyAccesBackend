package com.easyaccess.service.user;

import com.easyaccess.model.user.User;
import com.easyaccess.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void create(User company) {
        userRepository.save(company);
    }

    @Override
    public User getById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));

        User one = mongoTemplate.findOne(query, User.class);

        return one;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getByCedula(String cedula) {
        return userRepository.findByCedula(cedula);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
