package com.codecool.springbootrestapi.services;

import com.codecool.springbootrestapi.models.Father;

import java.util.Collection;

public interface IService<E> {
    void add(E entity);

    E getById(long id);

    Collection<E> getAll();

    void update(E entity);

    void deleteById(long id);

    void deleteAll();
}
