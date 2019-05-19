package com.easyaccess.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccessRepository extends MongoRepository<Access, String> {

    Access findByOwner(String owner);

    List<Access> findAccessByOwner(String owner);

    List<Access> findAccessByInvitedBy(String invitedBy);

}
