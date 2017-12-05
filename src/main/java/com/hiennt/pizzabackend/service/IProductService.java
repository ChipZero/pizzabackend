package com.hiennt.pizzabackend.service;

import com.hiennt.pizzabackend.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProduct();
    Product getProById (Integer proId);
    Product addNewPro (Product product);
    Product updatePro (Product product);
    Product deleteProById (Integer proId);

    List<Product> getAllByProtype (Integer prtId);
}
