package com.miquelini.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miquelini.demo.Entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
