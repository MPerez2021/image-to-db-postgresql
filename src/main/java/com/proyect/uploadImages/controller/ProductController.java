package com.proyect.uploadImages.controller;

import com.proyect.uploadImages.dto.ProductToSaveDto;
import com.proyect.uploadImages.entities.Product;
import com.proyect.uploadImages.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(value = "*")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts()  {
        return this.productService.getAll();
    }

    @PostMapping("/create")
    public void createProduct(@ModelAttribute ProductToSaveDto product) throws IOException {
        this.productService.createProduct(product);
    }
}
