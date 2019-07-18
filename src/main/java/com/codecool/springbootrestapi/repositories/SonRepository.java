package com.codecool.springbootrestapi.repositories;

import com.codecool.springbootrestapi.models.Son;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SonRepository extends CrudRepository<Son, Long> {
}
