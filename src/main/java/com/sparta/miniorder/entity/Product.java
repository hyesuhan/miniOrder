package com.sparta.miniorder.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "products")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String name;

    @Column(nullable = false)
    private Integer price;

    public static Product createProduct(String name, Integer price) {
        Product product = new Product();
        product.name = name;
        product.price = price;
        return product;
    }

    public void update(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
