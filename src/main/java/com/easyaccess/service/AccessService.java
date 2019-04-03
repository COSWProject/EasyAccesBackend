package com.easyaccess.service;

import com.easyaccess.model.Access;

import java.util.List;

public interface AccessService {
    
    void create(Access access);

    Access getById(String id);

    List<Access> getAll();

    void deleteById(String id);

    Access getByOwner(String owner);
}
