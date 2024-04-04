package com.david.curso.springboot.app.crudjpa.services;

import com.david.curso.springboot.app.crudjpa.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

}
