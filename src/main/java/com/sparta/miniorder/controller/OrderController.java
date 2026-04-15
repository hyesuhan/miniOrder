package com.sparta.miniorder.controller;

import com.sparta.miniorder.dto.order.OrderRequest;
import com.sparta.miniorder.dto.order.OrderResponse;
import com.sparta.miniorder.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> create(@Valid @RequestBody OrderRequest request) {
        OrderResponse response = orderService.createOrder(request);
        return ResponseEntity.created(URI.create("/api/orders/" + response.getOrderId())).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable Long id) {
        OrderResponse response = orderService.getOrder(id);
        return ResponseEntity.ok(response);
    }
}
