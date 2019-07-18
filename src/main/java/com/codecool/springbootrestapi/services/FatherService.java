package com.codecool.springbootrestapi.services;

import com.codecool.springbootrestapi.models.Father;
import com.codecool.springbootrestapi.repositories.FatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class FatherService {
    private FatherRepository fatherRepository;

    public FatherService(@Autowired FatherRepository fatherRepository) {
        this.fatherRepository = fatherRepository;
    }

    public void add(Father father) {
        fatherRepository.save(father);
    }

    public Father getById(long id) {
        return fatherRepository.findById(id).get();
    }

    public Collection<Father> getAllFathers() {
        Collection<Father> fathers = new ArrayList<>();
        fatherRepository.findAll().forEach(fathers::add);
        return fathers;
    }

    public void update(Father father) {
        if(fatherRepository.existsById(father.getId()))
            fatherRepository.save(father);
    }

    public void deleteById(long id) {
        fatherRepository.deleteById(id);
    }

    public void deleteAll() {
        fatherRepository.deleteAll();
    }
}
