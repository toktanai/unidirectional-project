package com.everset.unidirectionalmappingproject.service;

import com.everset.unidirectionalmappingproject.entity.OnlineShop;

import java.util.List;

public interface OnlineShopService {
    List<OnlineShop> getAll();
    OnlineShop save(OnlineShop shop);
    void delete(OnlineShop shop);
    OnlineShop getById(Long id);
}
