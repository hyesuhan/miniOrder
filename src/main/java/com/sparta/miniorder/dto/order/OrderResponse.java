package com.sparta.miniorder.dto.order;

import com.sparta.miniorder.entity.Order;
import lombok.Getter;

@Getter
public class OrderResponse {
    private final Long orderId;
    private final Long productId;
    private final String productName;
    private final Integer productPrice;
    private final Integer quantity;

    private OrderResponse(Order order) {
        this.orderId = order.getId();
        this.productId = order.getProduct().getId();
        this.productName = order.getProduct().getName();
        this.productPrice = order.getProduct().getPrice();
        this.quantity = order.getQuantity();
    }

    public  static OrderResponse from(Order order) {
        return new OrderResponse(order);
    }
}
