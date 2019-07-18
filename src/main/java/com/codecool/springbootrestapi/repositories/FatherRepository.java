package com.codecool.springbootrestapi.repositories;

import com.codecool.springbootrestapi.models.Father;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// FatherRepository will be created by Spring, because of extending CrudRepository interface

@Repository
public interface FatherRepository extends CrudRepository<Father, Long> {
}
