package com.miquelini.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miquelini.demo.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
