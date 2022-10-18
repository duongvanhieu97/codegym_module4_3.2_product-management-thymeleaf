package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "SG M12",2790000,2));
        products.put(2, new Product(2, "NK 101",160000,2));
        products.put(3, new Product(3, "SG A22",4200000,3));
        products.put(4, new Product(4, "Xiaomi Redmi A92",2059000,5));
        products.put(5, new Product(5, "SG S20",93500000,6));
        products.put(6, new Product(6, "IP 11",10990000,7));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }
}
