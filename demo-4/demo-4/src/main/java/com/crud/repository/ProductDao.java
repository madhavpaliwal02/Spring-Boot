package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
