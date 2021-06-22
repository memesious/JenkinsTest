package com.example.springapplication.service;

import com.example.springapplication.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private List<ProductDto> productList = new ArrayList<>();

    public ProductDto edit(ProductDto product){
        product.setCount(10000);
        product.setName("Name");
        return(product);
    }

    public void save(ProductDto product){
        productList.add(product);
    }

    public List<ProductDto> getProducts(){
        return productList;
    }
}
