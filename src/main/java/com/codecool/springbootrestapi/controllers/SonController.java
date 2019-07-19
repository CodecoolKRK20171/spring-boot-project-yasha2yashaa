package com.codecool.springbootrestapi.controllers;

import com.codecool.springbootrestapi.models.Father;
import com.codecool.springbootrestapi.models.Son;
import com.codecool.springbootrestapi.services.SonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/sons")
public class SonController implements IController<Son> {

    private SonService sonService;

    public SonController(@Autowired SonService sonService) {
        this.sonService = sonService;
    }
    @Override
    public Collection<Son> getAll() {
        return sonService.getAll();
    }

    @Override
    public Son getById(long id) {
        return sonService.getById(id);
    }

    @Override
    public void deleteById(long id) {
        sonService.deleteById(id);
    }

    @Override
    public void deleteAll() {
        sonService.deleteAll();
    }

    @Override
    public void add(Son son) {
        sonService.add(son);
    }

    @Override
    public void update(Son son) {
        sonService.update(son);
    }
}
