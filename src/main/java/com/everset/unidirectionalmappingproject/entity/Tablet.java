package com.everset.unidirectionalmappingproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TABLET")
public class Tablet extends Gadget{
    private int storageCapacity;

    public Tablet(String model, String brand, double price, int storageCapacity) {
        super(model, brand, price);
        this.storageCapacity = storageCapacity;
    }
}
