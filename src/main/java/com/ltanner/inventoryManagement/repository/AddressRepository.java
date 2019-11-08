package com.ltanner.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltanner.inventoryManagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
