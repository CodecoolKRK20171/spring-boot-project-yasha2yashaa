package com.codecool.springbootrestapi.controllers;

import com.codecool.springbootrestapi.models.Father;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

public interface IController<E> {
    @RequestMapping(method = RequestMethod.GET)
    Collection<Father> getAll();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Father getById(@PathVariable("id") long id);

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void deleteById(@PathVariable("id") long id);

    @RequestMapping(method = RequestMethod.DELETE)
    void deleteAll();

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    void add(@RequestBody E entity);

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    void update(@RequestBody E entity);
}
