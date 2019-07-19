package com.codecool.springbootrestapi.controllers;

import com.codecool.springbootrestapi.models.Father;
import com.codecool.springbootrestapi.models.Son;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@RequestMapping
public class SonController implements IController<Son> {
    @Override
    public Collection<Father> getAll() {
        return null;
    }

    @Override
    public Father getById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void add(Son entity) {

    }

    @Override
    public void update(Son entity) {

    }
}
