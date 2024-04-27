package com.everset.unidirectionalmappingproject.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@ToString
@Data
@Entity
public class OnlineShop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private double amountGadgets;

    public OnlineShop(String name, String address, double amountGadgets) {
        this.name = name;
        this.address = address;
        this.amountGadgets = amountGadgets;
    }
}
