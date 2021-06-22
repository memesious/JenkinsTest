package com.example.springapplication.controller;

import com.example.springapplication.dto.ProductDto;
import com.example.springapplication.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @PostMapping("/edit")
    public ProductDto edit(@RequestBody ProductDto product){
        return productService.edit(product);
    }

    @PostMapping
    public void save(@RequestBody ProductDto product){
        productService.save(product);
    }

    @GetMapping
    public List<ProductDto> productList(){
        return productService.getProducts();
    }

}
