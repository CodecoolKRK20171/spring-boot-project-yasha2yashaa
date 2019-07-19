package com.codecool.springbootrestapi.services;

import com.codecool.springbootrestapi.models.Son;
import com.codecool.springbootrestapi.repositories.SonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

public class SonService implements IService<Son>{

    private SonRepository sonRepository;

    public SonService(SonRepository sonRepository) {
        this.sonRepository = sonRepository;
    }

    @Override
    public void add(Son son) {
        sonRepository.save(son);
    }

    @Override
    public Son getById(long id) {
        return sonRepository.findById(id).get();
    }

    @Override
    public Collection<Son> getAll() {
        Collection<Son> sons = new ArrayList<>();
        sonRepository.findAll().forEach(sons::add);
        return sons;
    }

    @Override
    public void update(Son son) {
        if(sonRepository.existsById(son.getId()))
            sonRepository.save(son);
    }

    @Override
    public void deleteById(long id) {
        sonRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        sonRepository.deleteAll();
    }
}
