package com.david.curso.springboot.app.crudjpa.repositories;

import com.david.curso.springboot.app.crudjpa.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {


}
