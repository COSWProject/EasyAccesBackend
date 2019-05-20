package com.easyaccess.service.user;

import com.easyaccess.model.user.User;

import java.util.List;

public interface UserService {

    void create(User user);

    User getById(String id);

    List<User> getAll();

    void deleteById(String id);

    User getByCedula(String cedula);

    User getByEmail(String email);

    void update(User user);
}
