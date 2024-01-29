package com.proyect.uploadImages.services;

import com.proyect.uploadImages.dto.ProductToSaveDto;
import com.proyect.uploadImages.entities.Product;
import com.proyect.uploadImages.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@Service
@Transactional
public class ProductService {


    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(ProductToSaveDto product) throws IOException {
        Product newProduct = new Product();
        newProduct.setPrice(product.getPrice());
        newProduct.setDescription(product.getDescription());
        newProduct.setName(product.getName());
        newProduct.setCategory(product.getCategory());
        newProduct.setImage(Base64.getEncoder().encodeToString(product.getImage().getBytes()));

        this.productRepository.save(newProduct);
    }

    public List<Product> getAll()  {
        return this.productRepository.findAll();
    }


}
