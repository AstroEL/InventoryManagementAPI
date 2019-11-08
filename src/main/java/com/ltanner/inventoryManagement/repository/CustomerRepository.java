package com.ltanner.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltanner.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
