package com.hugovitoroliveira.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugovitoroliveira.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
