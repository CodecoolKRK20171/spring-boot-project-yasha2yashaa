package com.codecool.springbootrestapi.services;

import com.codecool.springbootrestapi.models.Father;

import java.util.Collection;

public interface Service<Model> {
    void add(Model model);

    Model getById(long id);

    Collection<Model> getAll();

    void update(Model model);

    void deleteById(long id);

    void deleteAll();
}
