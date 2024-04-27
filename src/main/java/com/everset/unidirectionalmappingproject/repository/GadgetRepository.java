package com.everset.unidirectionalmappingproject.repository;

import com.everset.unidirectionalmappingproject.entity.Gadget;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface GadgetRepository extends JpaRepository<Gadget, Long> {
    List<Gadget> findAllByOnlineShop_Id(Long shopId);

}
