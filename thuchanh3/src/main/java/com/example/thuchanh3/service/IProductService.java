package com.example.thuchanh3.service;

import com.example.thuchanh3.model.Product;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product finById(int id);
    void save(Product product);
    void update(int id,Product product);
    void delete(int id);
}
