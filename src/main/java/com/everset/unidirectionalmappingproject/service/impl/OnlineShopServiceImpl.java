package com.everset.unidirectionalmappingproject.service.impl;

import com.everset.unidirectionalmappingproject.entity.OnlineShop;
import com.everset.unidirectionalmappingproject.repository.OnlineShopRepository;
import com.everset.unidirectionalmappingproject.service.OnlineShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineShopServiceImpl implements OnlineShopService {

    @Autowired
    private OnlineShopRepository onlineShopRepository;

    @Override
    public List<OnlineShop> getAll() {
        return onlineShopRepository.findAll();
    }

    @Override
    public OnlineShop save(OnlineShop shop) {
        return onlineShopRepository.save(shop);
    }

    @Override
    public void delete(OnlineShop shop) {
        onlineShopRepository.delete(shop);
    }

    @Override
    public OnlineShop getById(Long id) {
        return onlineShopRepository.findById(id).orElse(null);
    }
}
