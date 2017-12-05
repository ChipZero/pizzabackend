package com.hiennt.pizzabackend.controller;

import com.hiennt.pizzabackend.entity.Product;
import com.hiennt.pizzabackend.service.IProductService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api")
public class productController {
    @Autowired
    private IProductService productService;

    private static final Logger logger = LoggerFactory.getLogger(protypeController.class);

    @GetMapping("product/all")
    public List<Product> getAll(){
        List<Product> protypes = productService.getAllProduct();
        return protypes;
    }

    @GetMapping("product/{id}")
    public Product getById (@PathVariable("id") Integer proId){
        return productService.getProById(proId);
    }

    @PostMapping("product/add")
    public String addNew (@RequestBody Product product){
        JSONObject result = new JSONObject();
        try {
            productService.addNewPro(product);
            result.put("code", "200");
            return result.toString();
        }catch (Exception e){
            e.printStackTrace();
            result.put("code", "999");
            return result.toString();
        }
    }

    @PutMapping("product/update")
    public String update (@RequestBody Product product){
        JSONObject result = new JSONObject();
        try {
            productService.updatePro(product);
            result.put("code", "200");
            return result.toString();
        }catch (Exception e){
            e.printStackTrace();
            result.put("code", "999");
            return result.toString();
        }
    }

    @DeleteMapping("product/{id}")
    public Product delete(@PathVariable("id") Integer prtId){
        return productService.deleteProById(prtId);
    }

    @GetMapping("product/bytype/{id}")
    public List<Product> getByType(@PathVariable("id") Integer prtId){
        return productService.getAllByProtype(prtId);
    }
}
