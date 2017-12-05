package com.hiennt.pizzabackend.repository;

import com.hiennt.pizzabackend.entity.Product;
import com.hiennt.pizzabackend.entity.Protype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByProtype (Protype protype);
}
