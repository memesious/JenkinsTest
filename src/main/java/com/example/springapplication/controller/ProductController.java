package com.example.springapplication.controller;

import com.example.springapplication.dto.ProductDto;
import com.example.springapplication.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @PostMapping("/edit")
    public ProductDto edit(@RequestBody ProductDto product){
        return productService.edit(product);
    }

}
