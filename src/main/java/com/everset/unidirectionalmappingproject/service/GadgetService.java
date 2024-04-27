package com.everset.unidirectionalmappingproject.service;

import com.everset.unidirectionalmappingproject.entity.Gadget;

import java.util.List;

public interface GadgetService {
    List<Gadget> getAll();
    void save(Gadget gadget);
    void delete(Gadget gadget);
    Gadget getById(Long id);

    List<Gadget> getAllByShop(Long shopId);
}
