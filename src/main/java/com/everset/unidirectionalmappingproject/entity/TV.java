package com.everset.unidirectionalmappingproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TV")
public class TV extends Gadget {
    private double screenSize;

    public TV(String model, String brand, double price, double screenSize) {
        super(model, brand, price);
        this.screenSize = screenSize;
    }
}
