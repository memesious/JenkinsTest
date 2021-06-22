package com.example.springapplication.service;

import com.example.springapplication.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    public ProductDto edit(ProductDto product){
        product.setCount(10000);
        product.setName("Name");
        return(product);
    }
}
