package com.everset.unidirectionalmappingproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "SMART_PHONE")
public class SmartPhone extends Gadget {
    private String simCard;
    private int cameraResolution;

    public SmartPhone(String model, String brand, double price, String simCard, int cameraResolution) {
        super(model, brand, price);
        this.simCard = simCard;
        this.cameraResolution = cameraResolution;
    }
}
