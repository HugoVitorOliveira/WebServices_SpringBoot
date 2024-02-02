package com.hugovitoroliveira.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hugovitoroliveira.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
