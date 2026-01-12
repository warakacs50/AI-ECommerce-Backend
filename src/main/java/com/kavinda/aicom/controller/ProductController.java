package com.kavinda.aicom.controller;

import com.kavinda.aicom.model.*;
import com.kavinda.aicom.service.*;
import com.kavinda.aicom.repository.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController{

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    //1. add product
    @PostMapping
    public ResponseEntity<Product> addProduct(
            @RequestParam Integer sellerId,
            @RequestBody Product product
    ){
        Product saveProduct = productService.addProduct(sellerId,product);
        return ResponseEntity.ok(saveProduct);
    }





    // 2️ . Update product
    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(
            @RequestParam Integer sellerId,
            @PathVariable Integer productId,
            @RequestBody Product product
    ) {
        Product updatedProduct =
                productService.updateProduct(sellerId, productId, product);
        return ResponseEntity.ok(updatedProduct);
    }





    
    // 3️. Delete product
    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(
            @RequestParam Integer sellerId,
            @PathVariable Integer productId
    ) {
        productService.removeProduct(sellerId, productId);
        return ResponseEntity.noContent().build();
    }


}