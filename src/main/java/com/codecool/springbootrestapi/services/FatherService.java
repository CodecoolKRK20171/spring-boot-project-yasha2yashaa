package com.codecool.springbootrestapi.services;

import com.codecool.springbootrestapi.models.Father;
import com.codecool.springbootrestapi.repositories.FatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class FatherService implements IService<Father> {
    private FatherRepository fatherRepository;

    public FatherService(@Autowired FatherRepository fatherRepository) {
        this.fatherRepository = fatherRepository;
    }

    @Override
    public void add(Father father) {
        fatherRepository.save(father);
    }

    @Override
    public Father getById(long id) {
        return fatherRepository.findById(id).get();
    }

    @Override
    public Collection<Father> getAll() {
        Collection<Father> fathers = new ArrayList<>();
        fatherRepository.findAll().forEach(fathers::add);
        return fathers;
    }

    @Override
    public void update(Father father) {
        if(fatherRepository.existsById(father.getId()))
            fatherRepository.save(father);
    }

    @Override
    public void deleteById(long id) {
        fatherRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        fatherRepository.deleteAll();
    }
}
