package com.codecool.springbootrestapi.repositories;

import com.codecool.springbootrestapi.models.Father;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatherRepository extends CrudRepository<Father, Long> {
}
