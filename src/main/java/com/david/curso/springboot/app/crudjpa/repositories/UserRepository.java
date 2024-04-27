package com.david.curso.springboot.app.crudjpa.repositories;

import com.david.curso.springboot.app.crudjpa.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}
