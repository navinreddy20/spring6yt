package com.telusko.ecomproj.repo;

import com.telusko.ecomproj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
