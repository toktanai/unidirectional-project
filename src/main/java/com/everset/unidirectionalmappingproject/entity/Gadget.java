package com.everset.unidirectionalmappingproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "GADGET")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Gadget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private String brand;
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "online_shop_id")
    private OnlineShop onlineShop;

    public Gadget(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }
}
