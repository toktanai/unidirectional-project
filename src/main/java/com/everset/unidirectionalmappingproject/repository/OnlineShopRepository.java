package com.everset.unidirectionalmappingproject.repository;

import com.everset.unidirectionalmappingproject.entity.OnlineShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineShopRepository extends JpaRepository<OnlineShop, Long> {
}
