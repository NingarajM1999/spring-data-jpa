package com.example.demoSpringDataJpa.repo;

import com.example.demoSpringDataJpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
