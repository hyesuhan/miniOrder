package com.sparta.miniorder.service;

import com.sparta.miniorder.dto.order.OrderRequest;
import com.sparta.miniorder.dto.order.OrderResponse;
import com.sparta.miniorder.entity.Order;
import com.sparta.miniorder.entity.Product;
import com.sparta.miniorder.repository.OrderRepository;
import com.sparta.miniorder.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Transactional
    public OrderResponse createOrder(OrderRequest request) {
        Order order = Order.createOrder(findProductById(request.getProductId()), request.getQuantity());
        orderRepository.save(order);
        return OrderResponse.from(order);
    }

    public OrderResponse getOrder(Long id) {
        Order order = findOrderById(id);
        return OrderResponse.from(order);
    }

    //** private Methods **//

    private Order findOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("주문이 존재하지 않습니다. id: " + id));
    }

    private Product findProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다. id: " + id));
    }
}
