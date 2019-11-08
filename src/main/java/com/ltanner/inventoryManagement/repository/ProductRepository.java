package com.ltanner.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltanner.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
