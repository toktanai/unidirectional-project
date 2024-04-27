package com.everset.unidirectionalmappingproject.service.impl;

import com.everset.unidirectionalmappingproject.entity.Gadget;
import com.everset.unidirectionalmappingproject.repository.GadgetRepository;
import com.everset.unidirectionalmappingproject.service.GadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GadgetServiceImpl implements GadgetService {
    @Autowired
    private GadgetRepository gadgetRepository;

    @Override
    public List<Gadget> getAll() {
        return gadgetRepository.findAll();
    }

    @Override
    public void save(Gadget gadget) {
        gadgetRepository.save(gadget);
    }

    @Override
    public void delete(Gadget gadget) {
        gadgetRepository.delete(gadget);
    }

    @Override
    public Gadget getById(Long id) {
        return gadgetRepository.findById(id).orElse(null);
    }

    @Override
    public List<Gadget> getAllByShop(Long shopId) {
        return gadgetRepository.findAllByOnlineShop_Id(shopId);
    }
}
