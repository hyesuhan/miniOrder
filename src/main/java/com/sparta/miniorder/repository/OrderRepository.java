package com.sparta.miniorder.repository;

import com.sparta.miniorder.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
