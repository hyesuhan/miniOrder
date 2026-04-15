package com.sparta.miniorder.dto.product;

import com.sparta.miniorder.entity.Product;
import lombok.Getter;

@Getter
public class ProductResponse {

    private final Long id;
    private final String  name;
    private final Integer price;

    private ProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
    }

    public static ProductResponse from(Product product) {
        return new ProductResponse(product);
    }
}
