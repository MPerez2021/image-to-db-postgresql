package com.proyect.uploadImages.repositories;

import com.proyect.uploadImages.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {


}
