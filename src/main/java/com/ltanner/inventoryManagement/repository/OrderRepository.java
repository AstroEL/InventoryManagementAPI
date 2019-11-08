package com.ltanner.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltanner.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
