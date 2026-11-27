package com.microservice.productservice.service;

import com.microservice.productservice.model.ProductRequest;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
}
