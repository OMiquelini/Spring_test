package com.miquelini.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miquelini.demo.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
