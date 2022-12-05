package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public Product getProduct(Long id){
        Optional<Product> res = productRepository.findById(id);
        return res.get();
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

    public List<Product> getPro(Long id){
        return productRepository.serach(id);
    }

}
