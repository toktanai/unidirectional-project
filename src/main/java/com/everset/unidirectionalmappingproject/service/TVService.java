package com.everset.unidirectionalmappingproject.service;

import com.everset.unidirectionalmappingproject.entity.Gadget;
import com.everset.unidirectionalmappingproject.entity.TV;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

public interface TVService {
    List<Gadget> getAll();
    void save(TV tv);
    void delete(TV tv);
    Gadget getById(Long id);
}
