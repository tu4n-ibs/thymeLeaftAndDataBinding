package com.example.thuchanh3.service;

import com.example.thuchanh3.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    private final List<Product> products;
    public ProductService(){
        products = new ArrayList<>();
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product finById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void update(int id, Product product) {
        int index = products.indexOf(finById(id));
        products.set(index,product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
