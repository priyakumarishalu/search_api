package com.priya.repository;

import com.priya.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);


    @Query(value = "SELECT * FROM Product p WHERE"
            +"p.name LIKE CONCAT('%',:query,'%')"
            +"Or p.description LIKE CONCAT('%',:query,'%')",nativeQuery = true)
    List<Product> serachProductSQL(String query);
}
