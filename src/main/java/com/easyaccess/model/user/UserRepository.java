package com.easyaccess.model.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findById(int id);

    User findByEmail(String email);
}
