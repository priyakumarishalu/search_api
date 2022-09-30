package com.priya.service;

import com.priya.entity.Product;
import com.priya.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> searchProduct(String query) {
        List<Product> products = productRepo.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }
}
