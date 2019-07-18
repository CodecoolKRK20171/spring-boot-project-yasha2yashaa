package com.codecool.springbootrestapi.controllers;

import com.codecool.springbootrestapi.models.Father;
import com.codecool.springbootrestapi.services.FatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/fathers")
public class FatherController {
    private FatherService fatherService;

    public FatherController(@Autowired FatherService fatherService) {
        this.fatherService = fatherService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Father> getAll() {
        return fatherService.getAllFathers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Father getById(@PathVariable("id") long id) {
        return fatherService.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") long id) {
        fatherService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAll() {
        fatherService.deleteAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody Father father) {
        fatherService.add(father);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Father father) {
        fatherService.update(father);
    }
}