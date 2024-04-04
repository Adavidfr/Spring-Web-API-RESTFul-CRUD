package com.david.curso.springboot.app.crudjpa.repositories;

import com.david.curso.springboot.app.crudjpa.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
