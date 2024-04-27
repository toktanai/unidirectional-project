package com.everset.unidirectionalmappingproject.service.impl;

import com.everset.unidirectionalmappingproject.entity.Gadget;
import com.everset.unidirectionalmappingproject.entity.TV;
import com.everset.unidirectionalmappingproject.repository.TVRepository;
import com.everset.unidirectionalmappingproject.service.TVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TVServiceImpl implements TVService {
    @Autowired
    private TVRepository tvRepository;

    @Override
    public List<Gadget> getAll() {
        return tvRepository.findAll();
    }

    @Override
    public void save(TV tv) {
        tvRepository.save(tv);
    }

    @Override
    public void delete(TV tv) {
        tvRepository.delete(tv);
    }

    @Override
    public Gadget getById(Long id) {
        return tvRepository.findById(id).orElse(null);
    }
}
