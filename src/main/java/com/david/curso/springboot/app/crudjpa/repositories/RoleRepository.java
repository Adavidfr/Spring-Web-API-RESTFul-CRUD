package com.david.curso.springboot.app.crudjpa.repositories;

import com.david.curso.springboot.app.crudjpa.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long > {

    Optional<Role> findByName(String name);

}
