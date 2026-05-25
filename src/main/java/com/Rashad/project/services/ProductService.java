package com.Rashad.project.services;

import com.Rashad.project.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    {
        products.add(new Product("title", "dedeooc", 123, "deeded", "edbuib"));
        products.add(new Product("title2", "dedeooc222", 12322, "deede2", "edbuib22222"));
    }
    public List<Product> getProducts() {
        return products;
    }
}