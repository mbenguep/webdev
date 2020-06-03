package com.webdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.webdev.model.Product;

@Repository
public interface ProductRpositorty extends JpaRepository<Product, Integer> {

}
