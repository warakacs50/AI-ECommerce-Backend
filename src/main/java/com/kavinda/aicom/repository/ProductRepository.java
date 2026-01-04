package com.kavinda.aicom.repository;

import com.kavinda.aicom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
extends JpaRepository<Product , Integer> {
}