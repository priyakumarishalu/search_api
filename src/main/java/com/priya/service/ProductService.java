package com.priya.service;

import com.priya.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProduct(String query);
    Product createProduct(Product product);
}
