package com.hiennt.pizzabackend.service;

import com.hiennt.pizzabackend.entity.Product;
import com.hiennt.pizzabackend.entity.Protype;
import com.hiennt.pizzabackend.repository.IProductRepository;
import com.hiennt.pizzabackend.repository.IProtypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private IProtypeRepository protypeRepository;

    @Override
    public List<Product> getAllProduct() {

        return productRepository.findAll();
    }

    @Override
    public Product getProById(Integer proId) {
        return productRepository.findOne(proId);
    }

    @Override
    public Product addNewPro(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updatePro(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product deleteProById(Integer proId) {
        Product product = productRepository.findOne(proId);
        productRepository.delete(proId);
        return product;
    }

    @Override
    public List<Product> getAllByProtype(Integer prtId) {
        Protype protype = protypeRepository.findOne(prtId);
        return productRepository.findByProtype(protype);
    }
}
